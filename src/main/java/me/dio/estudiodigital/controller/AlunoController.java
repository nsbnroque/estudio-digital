package me.dio.estudiodigital.controller;

import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.estudiodigital.controller.dto.AlunoDTO;
import me.dio.estudiodigital.controller.dto.AulaDTO;
import me.dio.estudiodigital.controller.mapper.AlunoMapper;
import me.dio.estudiodigital.model.Aluno;
import me.dio.estudiodigital.model.Aula;
import me.dio.estudiodigital.model.form.AlunoForm;
import me.dio.estudiodigital.model.form.AlunoUpdateForm;
import me.dio.estudiodigital.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<AlunoDTO>> findAll(){
        List<Aluno> alunoList = alunoService.findAll();
        List<AlunoDTO> result = alunoMapper.toAlunoDTOList(alunoList);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoDTO> findById(@PathVariable Long id){
        Aluno aluno = alunoService.findById(id);
        AlunoDTO result = alunoMapper.toAlunoDTO(aluno);
        return ResponseEntity.ok(result);
    }

    @PostMapping
    @PreAuthorize("hasAnyRole{'USERS'}")
    public ResponseEntity<AlunoDTO> create(@RequestBody AlunoForm form){
        var aluno = alunoService.create(form);
        var result = alunoMapper.toAlunoDTO(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlunoDTO> update(@PathVariable Long id, @RequestBody AlunoUpdateForm form){
        var aluno = alunoService.update(id, form);
        var result = alunoMapper.toAlunoDTO(aluno);
        return ResponseEntity.ok(result);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        alunoService.delete(id);
        return ResponseEntity.noContent().build();

    }

}
