/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoxp;

/**
 *
 * @author samue
 */
public class Matricula {

    private int idMatricula;
    private Aluno alunoMatriculado;
    private Curso cursoMatriculado;

    public Matricula() {
    }

    public Matricula(int idMatricula, Aluno alunoMatriculado, Curso cursoMatriculado) {
        this.idMatricula = idMatricula;
        this.alunoMatriculado = alunoMatriculado;
        this.cursoMatriculado = cursoMatriculado;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Aluno getAlunoMatriculado() {
        return alunoMatriculado;
    }

    public void setAlunoMatriculado(Aluno alunoMatriculado) {
        this.alunoMatriculado = alunoMatriculado;
    }

    public Curso getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(Curso cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }
}
