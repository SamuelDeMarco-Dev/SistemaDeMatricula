/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoxp;

/**
 *
 * @author samue
 */
import java.util.ArrayList;
import java.util.List;

public class SistemaMatricula {

    private List<Aluno> listaAlunos;
    private List<Curso> listaCursos;
    private List<Matricula> listaMatriculas;

    private int proximoIdAluno;
    private int proximoIdCurso;
    private int proximoIdMatricula;

    public SistemaMatricula() {
        this.listaAlunos = new ArrayList<>();
        this.listaCursos = new ArrayList<>();
        this.listaMatriculas = new ArrayList<>();
        this.proximoIdAluno = 1;
        this.proximoIdCurso = 1;
        this.proximoIdMatricula = 1;
    }

    public SistemaMatricula(
            List<Aluno> listaAlunos,
            List<Curso> listaCursos,
            List<Matricula> listaMatriculas,
            int proximoIdAluno,
            int proximoIdCurso,
            int proximoIdMatricula
    ) {
        this.listaAlunos = listaAlunos;
        this.listaCursos = listaCursos;
        this.listaMatriculas = listaMatriculas;
        this.proximoIdAluno = proximoIdAluno;
        this.proximoIdCurso = proximoIdCurso;
        this.proximoIdMatricula = proximoIdMatricula;
    }

    public void cadastrarAluno(String nomeAluno, String emailAluno) {
        if (nomeAluno == null || nomeAluno.trim().isEmpty()) {
            System.out.println("Não é possível cadastrar aluno com nome vazio.");
            return;
        }

        Aluno novoAluno = new Aluno(proximoIdAluno, nomeAluno, emailAluno);
        listaAlunos.add(novoAluno);
        proximoIdAluno++;

        System.out.println("Aluno cadastrado com sucesso.");
    }

    public void cadastrarCurso(String nomeCurso, int quantidadeVagasCurso) {
        if (nomeCurso == null || nomeCurso.trim().isEmpty()) {
            System.out.println("Não é possível cadastrar curso com nome vazio.");
            return;
        }

        if (quantidadeVagasCurso <= 0) {
            System.out.println("A quantidade de vagas deve ser maior que zero.");
            return;
        }

        Curso novoCurso = new Curso(proximoIdCurso, nomeCurso, quantidadeVagasCurso);
        listaCursos.add(novoCurso);
        proximoIdCurso++;

        System.out.println("Curso cadastrado com sucesso.");
    }

    public void matricularAluno(int idAluno, int idCurso) {
    Aluno alunoEncontrado = buscarAlunoPorId(idAluno);
    Curso cursoEncontrado = buscarCursoPorId(idCurso);

    if (alunoEncontrado == null) {
        System.out.println("Aluno não encontrado.");
        return;
    }

    if (cursoEncontrado == null) {
        System.out.println("Curso não encontrado.");
        return;
    }

    int quantidadeMatriculasCurso = contarMatriculasPorCurso(idCurso);

    if (quantidadeMatriculasCurso >= cursoEncontrado.getQuantidadeVagasCurso()) {
        System.out.println("Não há vagas disponíveis para este curso.");
        return;
    }

    Matricula novaMatricula = new Matricula(
            proximoIdMatricula,
            alunoEncontrado,
            cursoEncontrado
    );

        listaMatriculas.add(novaMatricula);
        proximoIdMatricula++;

        System.out.println("Matrícula realizada com sucesso.");
    }
    
    private int contarMatriculasPorCurso(int idCurso) {
    int quantidadeMatriculasCurso = 0;

    for (Matricula matriculaAtual : listaMatriculas) {
        if (matriculaAtual.getCursoMatriculado().getIdCurso() == idCurso) {
            quantidadeMatriculasCurso++;
        }
    }

    return quantidadeMatriculasCurso;
    }

    private Aluno buscarAlunoPorId(int idAluno) {
        for (Aluno alunoAtual : listaAlunos) {
            if (alunoAtual.getIdAluno() == idAluno) {
                return alunoAtual;
            }
        }

        return null;
    }

    private Curso buscarCursoPorId(int idCurso) {
        for (Curso cursoAtual : listaCursos) {
            if (cursoAtual.getIdCurso() == idCurso) {
                return cursoAtual;
            }
        }

        return null;
    }

    public void listarAlunos() {
        for (Aluno alunoAtual : listaAlunos) {
            System.out.println(
                    alunoAtual.getIdAluno() + " - " +
                    alunoAtual.getNomeAluno() + " - " +
                    alunoAtual.getEmailAluno()
            );
        }
    }

    public void listarCursos() {
        for (Curso cursoAtual : listaCursos) {
            System.out.println(
                    cursoAtual.getIdCurso() + " - " +
                    cursoAtual.getNomeCurso() + " - Vagas: " +
                    cursoAtual.getQuantidadeVagasCurso()
            );
        }
    }

    public void listarMatriculas() {
        for (Matricula matriculaAtual : listaMatriculas) {
            System.out.println(
                    "Matrícula " + matriculaAtual.getIdMatricula() +
                    " | Aluno: " + matriculaAtual.getAlunoMatriculado().getNomeAluno() +
                    " | Curso: " + matriculaAtual.getCursoMatriculado().getNomeCurso()
            );
        }
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }

    public int getProximoIdAluno() {
        return proximoIdAluno;
    }

    public void setProximoIdAluno(int proximoIdAluno) {
        this.proximoIdAluno = proximoIdAluno;
    }

    public int getProximoIdCurso() {
        return proximoIdCurso;
    }

    public void setProximoIdCurso(int proximoIdCurso) {
        this.proximoIdCurso = proximoIdCurso;
    }

    public int getProximoIdMatricula() {
        return proximoIdMatricula;
    }

    public void setProximoIdMatricula(int proximoIdMatricula) {
        this.proximoIdMatricula = proximoIdMatricula;
    }
}
