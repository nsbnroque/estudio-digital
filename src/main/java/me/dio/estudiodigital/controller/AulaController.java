package me.dio.estudiodigital.controller;

import me.dio.estudiodigital.controller.mapper.AulaMapper;
import me.dio.estudiodigital.service.AulaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aulas")
public class AulaController {

    private final AulaService aulaService;

    private final AulaMapper aulaMapper;

    public AulaController(AulaService aulaService, AulaMapper aulaMapper){
        this.aulaService = aulaService;
        this.aulaMapper = aulaMapper;
    }
}
