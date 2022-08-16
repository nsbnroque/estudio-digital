package me.dio.estudiodigital.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import me.dio.estudiodigital.model.Aluno;
import me.dio.estudiodigital.model.Instrutor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AulaDTO {
    private long id;
    private LocalDate data;
    private LocalTime horarioInicio;
    private LocalTime horarioFinal;

    private Instrutor instrutor;

    private List<Aluno> alunosAgendados = new ArrayList<>();

}
