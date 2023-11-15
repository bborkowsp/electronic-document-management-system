package com.edm.edmsystem.service;

import com.edm.edmsystem.model.Document;

import java.util.List;
import java.util.Map;

public interface DocumentUseCases {
    public List<Document> getDocuments();

    Document createDocumentFromPdf(Map<String, String> results);
}
