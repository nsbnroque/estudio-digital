package me.dio.estudiodigital.controller;

import me.dio.estudiodigital.controller.dto.AlunoDTO;
import me.dio.estudiodigital.controller.dto.AulaDTO;
import me.dio.estudiodigital.controller.mapper.AulaMapper;
import me.dio.estudiodigital.model.Aluno;
import me.dio.estudiodigital.model.Aula;
import me.dio.estudiodigital.service.AulaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aulas")
public class AulaController {

    private final AulaService aulaService;

    private final AulaMapper aulaMapper;

    public AulaController(AulaService aulaService, AulaMapper aulaMapper){
        this.aulaService = aulaService;
        this.aulaMapper = aulaMapper;
    }

    @GetMapping
    public ResponseEntity<List<AulaDTO>> findAll(){
        List<Aula> aulaList = aulaService.findAll();
        List<AulaDTO> result = aulaMapper.toAulaDTOList(aulaList);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AulaDTO> findById(@PathVariable String id){
        Aula aula = aulaService.findById(id);
        AulaDTO result = aulaMapper.toAulaDTO(aula);
        return ResponseEntity.ok(result);
    }
}
