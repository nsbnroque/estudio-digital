package me.dio.estudiodigital.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_pacotes")
public class Pacote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private Aluno aluno;

    private String nome;
    private int quantidadeCreditos;
    private LocalDate dataDeValidade;
    private double valor;
}
