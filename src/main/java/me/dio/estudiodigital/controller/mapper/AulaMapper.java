package me.dio.estudiodigital.controller.mapper;

import me.dio.estudiodigital.controller.dto.AlunoDTO;
import me.dio.estudiodigital.controller.dto.AulaDTO;
import me.dio.estudiodigital.model.Aluno;
import me.dio.estudiodigital.model.Aula;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AulaMapper {
    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public AulaDTO aulaDTO(Aula aula){
        return MODEL_MAPPER.map(aula, AulaDTO.class);
    }
    public List<AulaDTO> toAlunoDTOList(List<Aula> aulaList) {
        return aulaList.stream().map(this::aulaDTO).collect(Collectors.toList());
    }
}
