/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoxp;

/**
 *
 * @author samue
 */
public class Aluno {

    private int idAluno;
    private String nomeAluno;
    private String emailAluno;

    public Aluno() {
    }

    public Aluno(int idAluno, String nomeAluno, String emailAluno) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.emailAluno = emailAluno;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }
}