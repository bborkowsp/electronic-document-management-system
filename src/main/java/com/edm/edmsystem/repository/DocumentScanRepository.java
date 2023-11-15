package com.edm.edmsystem.repository;

import com.edm.edmsystem.model.DocumentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentScanRepository extends JpaRepository<DocumentScan, Long> {
}
