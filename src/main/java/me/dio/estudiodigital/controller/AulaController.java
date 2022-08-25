package me.dio.estudiodigital.controller;

import me.dio.estudiodigital.controller.dto.AulaDTO;
import me.dio.estudiodigital.controller.mapper.AulaMapper;
import me.dio.estudiodigital.model.Aula;
import me.dio.estudiodigital.model.form.AulaForm;
import me.dio.estudiodigital.model.form.AulaUpdateForm;
import me.dio.estudiodigital.service.AulaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<AulaDTO> findById(@PathVariable Long id){
        Aula aula = aulaService.findById(id);
        AulaDTO result = aulaMapper.toAulaDTO(aula);
        return ResponseEntity.ok(result);
    }

    @PostMapping
    @PreAuthorize("hasAnyRole{'USERS'}")
    public ResponseEntity<AulaDTO> create(@RequestBody AulaForm form){
        var aula = aulaService.create(form);
        var result = aulaMapper.toAulaDTO(aula);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AulaDTO> update(@PathVariable Long id, @RequestBody AulaUpdateForm form){
        var aluno = aulaService.update(id, form);
        var result = aulaMapper.toAulaDTO(aluno);
        return ResponseEntity.ok(result);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        aulaService.delete(id);
        return ResponseEntity.noContent().build();

    }
}
