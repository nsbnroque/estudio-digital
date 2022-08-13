package me.dio.estudiodigital.controller.dto;
import me.dio.estudiodigital.model.Pacote;

import java.time.LocalDate;

public class AlunoDTO {
    private long id;
    private String nome;
    private String email;
    private int creditos;
    private LocalDate dataDeNascimento;
    private Pacote pacote;
}
