package com.edm.edmsystem.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "PROPERTIES")
public class Property {
    @Id
    private Long id;
    private String propertyName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_address_id")
    private Address propertyAddress;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_manager_id")
    private PropertyManager propertyManager;
}
