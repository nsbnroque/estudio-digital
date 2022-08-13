package me.dio.estudiodigital.entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class Instrutor {
    private long id;
    private String nome;
    private String email;
    private LocalDate dataDeNascimento;

    private List<Aula> aulasHistorico = new ArrayList<>();


}
