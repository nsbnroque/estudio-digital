package me.dio.estudiodigital.service;

import me.dio.estudiodigital.controller.dto.AlunoDTO;
import me.dio.estudiodigital.model.Aluno;
import me.dio.estudiodigital.model.Aula;
import me.dio.estudiodigital.model.form.AlunoForm;
import me.dio.estudiodigital.model.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {
        /**
         * Cria um Aluno e salva no banco de dados.
         * @param form formulário referente aos dados para criação de um Aluno no banco de dados.
         * @return Aluno recém-criado.
         */
        Aluno create(AlunoForm form);

        /**
         * Retorna um Aluno que está no banco de dados de acordo com seu Id.
         * @param id id do Aluno que será exibido.
         * @return Aluno de acordo com o Id fornecido.
         */
        Aluno findById(Long id);

        /**
         * Retorna os Alunos que estão no banco de dados.
         * @return Uma lista os Alunos que estão salvas no DB.
         */
        List<Aluno> findAll();

        /**
         * Atualiza o Aluno.
         * @param id id do Aluno que será atualizado.
         * @param formUpdate formulário referente aos dados necessários para atualização do Aluno
         * no banco de dados.
         * @return Aluno recém-atualizado.
         */
        Aluno update(Long id, AlunoUpdateForm formUpdate);

        /**
         * Deleta um Aluno específico.
         * @param id id do Aluno que será removido.
         */
        void delete(Long id);

        /**
         *
         * @param  id do aluno que será recuperada a lista de avaliações
         * @return uma lista com todas as aulas agendadas pelo aluno de acordo com o Id
         */
        List<Aula> findAllAulaId(Long id);
}
