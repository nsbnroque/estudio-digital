package me.dio.estudiodigital.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Aula {
    private long id;
    private LocalDate data;
    private LocalTime horarioInicio;
    private LocalTime horarioFinal;

    private Instrutor instrutor;

    private List<Aluno> alunosAgendados = new ArrayList<>();


}
