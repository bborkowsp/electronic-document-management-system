package com.edm.edmsystem.controller;

import com.edm.edmsystem.model.Document;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
public class DocumentController {

    @GetMapping("/documents")
    public List<Document> getDocuments(){
        return null;
    }
}
