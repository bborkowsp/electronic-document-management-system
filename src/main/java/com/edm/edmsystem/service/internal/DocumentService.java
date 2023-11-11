package com.edm.edmsystem.service.internal;

import com.edm.edmsystem.model.Document;
import com.edm.edmsystem.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentService {
    private final DocumentRepository documentRepository;

    public List<Document> getDocuments(){
        return documentRepository.findAll();
    }
}
