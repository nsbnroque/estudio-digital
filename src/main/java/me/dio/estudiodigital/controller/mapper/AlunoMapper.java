package me.dio.estudiodigital.controller.mapper;

import me.dio.estudiodigital.controller.dto.AlunoDTO;
import me.dio.estudiodigital.model.Aluno;
import me.dio.estudiodigital.model.form.AlunoForm;
import me.dio.estudiodigital.model.form.AlunoUpdateForm;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AlunoMapper {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public AlunoDTO toAlunoDTO(Aluno aluno){

        return MODEL_MAPPER.map(aluno, AlunoDTO.class);
    }
    public AlunoDTO toAlunoDTO(AlunoForm aluno){

        return MODEL_MAPPER.map(aluno, AlunoDTO.class);
    }
    public List<AlunoDTO> toAlunoDTOList(List<Aluno> alunoList) {
        return alunoList.stream().map(this::toAlunoDTO).collect(Collectors.toList());
    }

    public Aluno toAluno(AlunoForm form) {
        return MODEL_MAPPER.map(form, Aluno.class);
    }
    public Aluno toAluno(AlunoUpdateForm form) {
        return MODEL_MAPPER.map(form, Aluno.class);
    }

}
