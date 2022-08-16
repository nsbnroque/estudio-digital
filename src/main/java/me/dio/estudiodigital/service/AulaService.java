package me.dio.estudiodigital.service;


import me.dio.estudiodigital.model.Aluno;
import me.dio.estudiodigital.model.Aula;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RestController
public class AulaService {
    private static Map<String, Aula> aulaMap = new HashMap<>();

    public List<Aula> findAll(){
        return aulaMap.values().stream().collect(Collectors.toList());
    }
}
