package me.dio.estudiodigital.service;

import io.restassured.RestAssured;
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

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AlunoServiceTest {

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

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void findAllAulaId() {
    }

    @Test
    void whenCreateThenCheckIsCreated() {
        var form = new AlunoForm("John Doe","johndoe@test.me", LocalDate.of(1999,02,02));

        RestAssured.given()
                .when()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(form)
                .post("/alunos")
                .then()
                .statusCode(HttpStatus.CREATED.value())
                .body("email", Matchers.equalTo("johndoe@test.me"));
    }

    @Test
    void findById() {
    }
}