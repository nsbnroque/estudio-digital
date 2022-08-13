package me.dio.estudiodigital.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {
    private long id;
    private String nome;
    private String email;
    private int creditos;
    private LocalDate dataDeNascimento;
    private Pacote pacote;

    private List<Aula> aulasAgendadas = new ArrayList<>();
    private List<Aula> aulasHistorico = new ArrayList<>();
    private List<Pacote> pacotesHistorico = new ArrayList<>();
}
