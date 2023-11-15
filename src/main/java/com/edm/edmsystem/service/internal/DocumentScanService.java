package com.edm.edmsystem.service.internal;

import com.edm.edmsystem.repository.DocumentScanRepository;
import com.edm.edmsystem.service.DocumentScanUseCases;
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

@Service
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class DocumentScanService implements DocumentScanUseCases {

    private final DocumentScanRepository documentScanRepository;

    @Override
    public void processDocumentScan(MultipartFile[] files) {
        for (MultipartFile file : files) {
            try {
                String text = extractTextFromPDF(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String extractTextFromPDF(MultipartFile file) throws IOException {
        File tempFile = convertMultipartFileToFile(file);

        try (PDDocument document = Loader.loadPDF(tempFile)) {
            PDFTextStripper pdfTextStripper = new PDFTextStripper();
            String text = pdfTextStripper.getText(document);
            System.out.println(text);
            return text;
        } finally {
            tempFile.delete();
        }
    }

    private File convertMultipartFileToFile(MultipartFile file) throws IOException {
        File tempFile = File.createTempFile("temp", null);
        try (OutputStream os = new FileOutputStream(tempFile)) {
            os.write(file.getBytes());
        }
        return tempFile;
    }

}
