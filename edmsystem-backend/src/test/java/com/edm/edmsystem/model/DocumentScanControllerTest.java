package com.edm.edmsystem.model;

import com.edm.edmsystem.repository.DocumentRepository;
import com.edm.edmsystem.service.DocumentScanUseCases;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@ActiveProfiles("test")
@SpringBootTest
public class DocumentScanControllerTest {

    @Autowired
    private DocumentRepository documentRepository;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private DocumentScanUseCases documentScanUseCases;

    @BeforeEach
    void setUp() {
        documentRepository.deleteAll();
    }

    @Test
    public void testUploadDocumentScan() throws Exception {

    }
}
