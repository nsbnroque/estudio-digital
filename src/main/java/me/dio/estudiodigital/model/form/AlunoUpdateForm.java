package me.dio.estudiodigital.model.form;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AlunoUpdateForm {
    private String nome;

    private String email;

    private LocalDate dataDeNascimento;

}
