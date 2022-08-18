package me.dio.estudiodigital.service;

import me.dio.estudiodigital.controller.dto.AlunoDTO;
import me.dio.estudiodigital.model.Aluno;
import me.dio.estudiodigital.model.Aula;
import me.dio.estudiodigital.model.form.AlunoForm;
import me.dio.estudiodigital.model.form.AlunoUpdateForm;
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
public class AlunoService implements IAlunoService{

    private AlunoDTO alunoDTO;

    private static Map<String, Aluno> alunoMap = new HashMap<>();
    public List<Aluno> findAll(){
        return alunoMap.values().stream().collect(Collectors.toList());
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Aula> findAllAulaId(Long id) {
        return null;}

    @Override
    public Aluno create(Aluno alunoCreate) {
        Aluno aluno = new Aluno(alunoCreate.getNome(), alunoCreate.getEmail(), alunoCreate.getDataDeNascimento());
        return aluno;
    }

    @Override
    public Aluno findById(Long id) { return alunoMap.get(id);
    }


}
