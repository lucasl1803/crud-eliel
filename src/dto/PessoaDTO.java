PessoaDTO.java

package com.exemplo.crudjava.dto;

import lombok.*;
import com.exemplo.crudjava.model.Trabalho;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {
private String nome;
private String email;
private Trabalho trabalho;
}
