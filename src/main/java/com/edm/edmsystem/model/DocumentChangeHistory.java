package com.edm.edmsystem.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "DOCUMENTS_CHANGE_HISTORY")
public class DocumentChangeHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate lastChangeDate;

    @OneToMany
    @JoinColumn(name = "")
    private User requester;
    private PropertyManager approver;
}
