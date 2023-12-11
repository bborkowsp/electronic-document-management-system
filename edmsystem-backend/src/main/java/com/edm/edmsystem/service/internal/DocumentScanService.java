package com.edm.edmsystem.service.internal;

import com.edm.edmsystem.repository.DocumentRepository;
import com.edm.edmsystem.service.DocumentScanUseCases;
import com.edm.edmsystem.service.DocumentUseCases;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class DocumentScanService implements DocumentScanUseCases {

    private final DocumentRepository documentRepository;
    private final DocumentUseCases documentUseCases;

    @Override
    public void uploadDocumentScan(MultipartFile[] uploadedFiles) throws IOException {
        for (MultipartFile uploadedFile : uploadedFiles) {
            try {
                final var extractedTextFromDocument = extractTextFromDocument(uploadedFile);
                Map<String, String> foundMatches = findDocumentDetails(extractedTextFromDocument);
                documentRepository.save(documentUseCases.createDocumentFromPdf((foundMatches), uploadedFile));
            } catch (IOException e) {
                throw new IOException();
            }
        }
    }

    private String extractTextFromDocument(MultipartFile uploadedFile) throws IOException {
        File convertedMultipartFileToFile = convertMultipartFileToFile(uploadedFile);
        try (PDDocument loadedPDF = Loader.loadPDF(convertedMultipartFileToFile)) {
            return extractTextFromPDF(loadedPDF);
        } finally {
            convertedMultipartFileToFile.delete();
        }
    }

    private File convertMultipartFileToFile(MultipartFile uploadedFile) throws IOException {
        File file = File.createTempFile("temp", null);
        try (OutputStream os = new FileOutputStream(file)) {
            os.write(uploadedFile.getBytes());
        }
        return file;
    }

    private String extractTextFromPDF(PDDocument document) throws IOException {
        PDFTextStripper pdfTextStripper = new PDFTextStripper();
        return pdfTextStripper.getText(document);
    }


    private Map<String, String> findDocumentDetails(String text) {
        Map<String, String> results = new HashMap<>();
        Pattern pattern = Pattern.compile("Faktura VAT nr FV (\\d+)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            results.put("documentNumber", matcher.group(1));
        }
        return results;
    }
}
