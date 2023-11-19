package com.edm.edmsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DocumentScan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //  private MultipartFile documentScan;
}
