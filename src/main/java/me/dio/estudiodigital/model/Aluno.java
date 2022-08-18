package me.dio.estudiodigital.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int creditos;

    private LocalDate dataDeNascimento;

    @OneToOne
    private Pacote pacote;

    @ManyToMany (fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Aula> aulasAgendadas = new ArrayList<>();


    public Aluno(String nome, String email, LocalDate dataDeNascimento) {
    }
}
