package com.edm.edmsystem.service.internal;

import com.edm.edmsystem.repository.DocumentScanRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@ExtendWith(MockitoExtension.class)
public class DocumentScanServiceTest {

    @Mock
    private DocumentScanRepository documentScanRepository;
    @InjectMocks
    private DocumentScanService documentScanService;

    @Test
    public void testProcessDocumentScan() throws IOException {
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Current Working Directory: " + currentDirectory);

        File file = ResourceUtils.getFile("invoice.pdf");
        FileInputStream input = new FileInputStream(file);

        // Create a MockMultipartFile with the loaded content
        MockMultipartFile multipartFile = new MockMultipartFile("file", file.getName(), "application/pdf", input.readAllBytes());

        // Call the method to be tested
        documentScanService.extractTextFromPDF(multipartFile);

    }
}
