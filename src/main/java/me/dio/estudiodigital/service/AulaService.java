package me.dio.estudiodigital.service;


import me.dio.estudiodigital.exception.AulaNotFoundException;
import me.dio.estudiodigital.model.Aluno;
import me.dio.estudiodigital.model.Aula;
import me.dio.estudiodigital.model.form.AulaForm;
import me.dio.estudiodigital.model.form.AulaUpdateForm;
import me.dio.estudiodigital.repository.AulaRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service

public class AulaService implements IAulaService {

    private final AulaRepository aulaRepository;

    public AulaService(AulaRepository aulaRepository) {
        this.aulaRepository = aulaRepository;
    }

    @Override
    public Aula create(AulaForm form) {
        Aula aula = new Aula();
        aula.setNome(form.getNome());
        aula.setData(form.getData());
        aula.setHorarioInicio(form.getHorarioInicio());
        aula.setDuracao(form.getDuracao());
        aula.setCapacidade(form.getCapacidade());
        aula.setInstrutor(form.getInstrutor());
        aulaRepository.save(aula);
        return aula;

    }

    @Override
    public Aula findById(Long id) {
        return aulaRepository.findById(id).orElseThrow(() -> new AulaNotFoundException(id));
    }

    public List<Aula> findAll(){
        return aulaRepository.findAll();
    }

    @Override
    public Aula update(Long id, AulaUpdateForm form) {
        Aula aula = findById(id);
        aula.setNome(form.getNome());
        aula.setData(form.getData());
        aula.setHorarioInicio(form.getHorarioInicio());
        aula.setDuracao(form.getDuracao());
        aula.setCapacidade(form.getCapacidade());
        aula.setInstrutor(form.getInstrutor());
        aulaRepository.save(aula);
        return aula;
    }

    @Override
    public void delete(Long id) {
        findById(id);
        aulaRepository.deleteById(id);
    }

    @Override
    public List<Aluno> alunosAgendados(Long id) {
        return null;
    }

}
