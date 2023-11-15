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
        //given
        File file = ResourceUtils.getFile("invoice.pdf");
        FileInputStream input = new FileInputStream(file);

        //when
        MockMultipartFile multipartFile = new MockMultipartFile("file", file.getName(), "application/pdf", input.readAllBytes());

        //then

    }
}
