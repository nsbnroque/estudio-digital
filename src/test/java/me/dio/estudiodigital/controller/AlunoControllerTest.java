package me.dio.estudiodigital.controller;

import io.restassured.RestAssured;
import me.dio.estudiodigital.controller.dto.AlunoDTO;
import me.dio.estudiodigital.model.Aluno;
import me.dio.estudiodigital.model.form.AlunoForm;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import java.time.LocalDate;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AlunoControllerTest {

    @LocalServerPort
    private int randomPort;

    @BeforeEach
    public void setUpTest(){
        RestAssured.port = randomPort;
    }

    @Test
    void whenFindAllThenCheckResult() {
        RestAssured.given()
                .when()
                .get("/alunos")
                .then()
                .extract().response().body().prettyPrint();
    }


}