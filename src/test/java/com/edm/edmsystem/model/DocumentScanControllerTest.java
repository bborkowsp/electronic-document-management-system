package com.edm.edmsystem.model;

import com.edm.edmsystem.controller.DocumentScanController;
import com.edm.edmsystem.service.DocumentScanUseCases;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DocumentScanControllerTest {

    @Mock
    private DocumentScanUseCases documentScanUseCases;

    @InjectMocks
    private DocumentScanController documentScanController;

    @Test
    public void testUploadDocumentScan() throws IOException {
        // Mock MultipartFile
        MultipartFile mockFile = mock(MultipartFile.class);
        when(mockFile.getBytes()).thenReturn("Mock PDF content".getBytes());

        // Call the controller method
        ResponseEntity<Void> response = documentScanController.uploadDocumentScan(new MultipartFile[]{mockFile});

        // Verify that the processDocumentScan method was called with the correct argument
        //verify(documentScanUseCases, times(1)).processDocumentScan(new MultipartFile[]{mockFile});

        // Verify the response status
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
