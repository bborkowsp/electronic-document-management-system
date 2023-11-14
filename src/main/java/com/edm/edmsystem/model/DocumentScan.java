package com.edm.edmsystem.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.lang.NonNull;

import java.io.File;

@Data
@Entity
@AllArgsConstructor
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DocumentScan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private File documentScan;
}
