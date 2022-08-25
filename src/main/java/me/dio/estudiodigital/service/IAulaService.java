package me.dio.estudiodigital.service;


import me.dio.estudiodigital.model.Aluno;
import me.dio.estudiodigital.model.Aula;
import me.dio.estudiodigital.model.form.AulaForm;
import me.dio.estudiodigital.model.form.AulaUpdateForm;

import java.util.List;

public interface IAulaService {
    /**
     * Cria um Aula e salva no banco de dados.
     * @param form formulário referente aos dados para criação de um Aluno no banco de dados.
     * @return Aula recém-criado.
     */
    Aula create(AulaForm form);

    Aula findById(Long id);

    /**
     * Retorna as Aulas que estão no banco de dados.
     * @return Uma lista de Aulas que estão salvas no DB.
     */
    List<Aula> findAll();

    /**
     * Atualiza o Aluno.
     * @param id id do Aluno que será atualizado.
     * @param formUpdate formulário referente aos dados necessários para atualização do Aluno
     * no banco de dados.
     * @return Aluno recém-atualizado.
     */
    Aula update(Long id, AulaUpdateForm formUpdate);

    /**
     * Deleta uma Aula específica.
     * @param id da aula que será removido.
     */
    void delete(Long id);

    /**
     *
     * @param  id da aula que será recuperada a lista de alunos agendados
     * @return uma lista com todos os alunos agendadas pelo aluno na aula.
     */
    List<Aluno> alunosAgendados(Long id);


}
