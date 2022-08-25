package me.dio.estudiodigital.model.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.estudiodigital.model.Instrutor;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AulaForm {

    public String nome;
    private LocalDate data;
    private LocalDateTime horarioInicio;
    private TemporalAmount duracao;
    private Instrutor instrutor;
    private int capacidade;
}
