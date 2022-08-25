package me.dio.estudiodigital.service;

import me.dio.estudiodigital.controller.dto.AlunoDTO;
import me.dio.estudiodigital.exception.AlunoNotFoundException;
import me.dio.estudiodigital.model.Aluno;
import me.dio.estudiodigital.model.Aula;
import me.dio.estudiodigital.model.form.AlunoForm;
import me.dio.estudiodigital.model.form.AlunoUpdateForm;
import me.dio.estudiodigital.repository.AlunoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlunoService implements IAlunoService{

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> findAll(){
        return alunoRepository.findAll();
    }

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setEmail(form.getEmail());
        aluno.setDataDeNascimento(form.getDataDeNascimento());
        alunoRepository.save(aluno);
        return aluno;
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm form) {
        Aluno aluno = findById(id);
        aluno.setNome(form.getNome());
        aluno.setEmail(form.getEmail());
        aluno.setDataDeNascimento(form.getDataDeNascimento());
        alunoRepository.save(aluno);
        return aluno;

    }

    @Override
    public void delete(Long id) {
        findById(id);
        alunoRepository.deleteById(id);

    }

    @Override
    public List<Aula> findAllAulaId(Long id) {
        return null;}


    @Override
    public Aluno findById(Long id) {
        return alunoRepository.findById(id).orElseThrow(() -> new AlunoNotFoundException(id));
    }


}
