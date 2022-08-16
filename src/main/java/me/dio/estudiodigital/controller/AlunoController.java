package me.dio.estudiodigital.controller;

import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.estudiodigital.controller.dto.AlunoDTO;
import me.dio.estudiodigital.controller.mapper.AlunoMapper;
import me.dio.estudiodigital.model.Aluno;
import me.dio.estudiodigital.service.AlunoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;
    private final AlunoMapper alunoMapper;

    public AlunoController(AlunoService alunoService, AlunoMapper alunoMapper) {
        this.alunoService = alunoService;
        this.alunoMapper = alunoMapper;
    }

    @GetMapping
    public List<AlunoDTO> findAll(){
        List<Aluno> alunoList = alunoService.findAll();
        List<AlunoDTO> result = alunoMapper.toAlunoDTOList(alunoList);
        return result;
    }
}
