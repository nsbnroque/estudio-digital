package me.dio.estudiodigital.entity;

import lombok.Data;

@Data
public class Pacote {
    private long id;
    private String nome;
    private int quantidadeCreditos;
    private int validade;
    private double valor;
}
