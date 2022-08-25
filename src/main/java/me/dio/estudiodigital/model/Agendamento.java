package me.dio.estudiodigital.model;

import lombok.Data;

import javax.persistence.*;

@Data

@Entity
@Table(name = "tb_agendamentos")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Aula aula;

    @OneToOne
    private Aluno aluno;


}
