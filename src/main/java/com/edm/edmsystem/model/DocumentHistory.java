package com.edm.edmsystem.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.lang.NonNull;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DocumentHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate modificationDate;

    @OneToOne(cascade = CascadeType.ALL)
    @NonNull
    private User requester;

    @OneToOne(cascade = CascadeType.ALL)
    @NonNull
    private PropertyManager approver;

    @NonNull
    private DocumentStatus modificationType;
}
