package me.dio.estudiodigital.model.form;

import lombok.Data;
import me.dio.estudiodigital.model.Instrutor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;

@Data
public class AulaUpdateForm {

    public String nome;
    private LocalDate data;
    private LocalDateTime horarioInicio;
    private TemporalAmount duracao;
    private Instrutor instrutor;
    private int capacidade;
}
