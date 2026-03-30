package com.eca.busdepot.labourservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "labours")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Labour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String role; // Driver, Conductor, Mechanic
    private String contact;
    private String email;
}
