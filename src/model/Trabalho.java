package com.exemplo.crudjava.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trabalho {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String cargo;
private String empresa;
}

