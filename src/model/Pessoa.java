package com.exemplo.crudjava.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String nome;
private String email;

@OneToOne(cascade = CascadeType.ALL)
private Trabalho trabalho;
}

