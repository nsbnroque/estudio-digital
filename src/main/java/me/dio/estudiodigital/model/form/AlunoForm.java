package me.dio.estudiodigital.model.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AlunoForm {

    private String nome;

    private String email;

    private LocalDate dataDeNascimento;
}
