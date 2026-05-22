/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoxp;

/**
 *
 * @author samue
 */
public class Curso {

    private int idCurso;
    private String nomeCurso;
    private int quantidadeVagasCurso;

    public Curso() {
    }

    public Curso(int idCurso, String nomeCurso, int quantidadeVagasCurso) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.quantidadeVagasCurso = quantidadeVagasCurso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getQuantidadeVagasCurso() {
        return quantidadeVagasCurso;
    }

    public void setQuantidadeVagasCurso(int quantidadeVagasCurso) {
        this.quantidadeVagasCurso = quantidadeVagasCurso;
    }
}
