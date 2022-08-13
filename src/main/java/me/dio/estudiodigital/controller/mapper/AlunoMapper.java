package me.dio.estudiodigital.controller.mapper;

import me.dio.estudiodigital.controller.dto.AlunoDTO;
import me.dio.estudiodigital.model.Aluno;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AlunoMapper {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public AlunoDTO alunoDTO(Aluno aluno){
        return MODEL_MAPPER.map(aluno, AlunoDTO.class);
    }
    public List<AlunoDTO> toAlunoDTOList(List<Aluno> alunoList) {
        return alunoList.stream().map(this::alunoDTO).collect(Collectors.toList());
    }
}
