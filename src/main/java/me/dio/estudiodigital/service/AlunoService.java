package me.dio.estudiodigital.service;

import me.dio.estudiodigital.controller.dto.AlunoDTO;
import me.dio.estudiodigital.model.Aluno;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RestController
@RequestMapping("/alunos")
public class AlunoService {

    private static Map<String, Aluno> alunoMap = new HashMap<>();
    public List<Aluno> findAll(){
        return alunoMap.values().stream().collect(Collectors.toList());
    }
}
