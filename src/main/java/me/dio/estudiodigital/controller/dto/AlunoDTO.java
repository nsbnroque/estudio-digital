package me.dio.estudiodigital.controller.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import me.dio.estudiodigital.model.Pacote;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlunoDTO {
    private long id;
    private String nome;
    private String email;
    private int creditos;
    private LocalDate dataDeNascimento;
    private Pacote pacote;
}
