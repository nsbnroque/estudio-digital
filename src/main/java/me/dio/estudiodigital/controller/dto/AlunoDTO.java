package me.dio.estudiodigital.controller.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.estudiodigital.model.Pacote;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlunoDTO {


    private Long id;
    private String nome;
    private String email;
    private int creditos;
    private LocalDate dataDeNascimento;
    private Pacote pacote;
}
