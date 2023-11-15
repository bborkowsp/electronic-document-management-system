package com.edm.edmsystem.controller;

import com.edm.edmsystem.model.Document;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/document")
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class DocumentController {

    @GetMapping
    public List<Document> getDocuments() {
        return null;
    }
}
