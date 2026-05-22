/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoxp;
import java.util.Scanner;


/**
 *
 * @author samue
 */

public class ProjetoXP {
    public static void main(String[] args) {

        Scanner leitorEntrada = new Scanner(System.in);
        SistemaMatricula sistemaMatricula = new SistemaMatricula();

        int opcaoMenu = -1;

        do {
            System.out.println("\n===== Sistema de Matrículas =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar curso");
            System.out.println("3 - Matricular aluno em curso");
            System.out.println("4 - Listar alunos");
            System.out.println("5 - Listar cursos");
            System.out.println("6 - Listar matrículas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcaoMenu = Integer.parseInt(leitorEntrada.nextLine());

            switch (opcaoMenu) {
                case 1:
                    System.out.print("Informe o nome do aluno: ");
                    String nomeAluno = leitorEntrada.nextLine();

                    System.out.print("Informe o e-mail do aluno: ");
                    String emailAluno = leitorEntrada.nextLine();

                    sistemaMatricula.cadastrarAluno(nomeAluno, emailAluno);
                    break;

                case 2:
                    System.out.print("Informe o nome do curso: ");
                    String nomeCurso = leitorEntrada.nextLine();

                    System.out.print("Informe a quantidade de vagas: ");
                    int quantidadeVagasCurso = Integer.parseInt(leitorEntrada.nextLine());

                    sistemaMatricula.cadastrarCurso(nomeCurso, quantidadeVagasCurso);
                    break;

                case 3:
                    System.out.print("Informe o ID do aluno: ");
                    int idAluno = Integer.parseInt(leitorEntrada.nextLine());

                    System.out.print("Informe o ID do curso: ");
                    int idCurso = Integer.parseInt(leitorEntrada.nextLine());

                    sistemaMatricula.matricularAluno(idAluno, idCurso);
                    break;

                case 4:
                    sistemaMatricula.listarAlunos();
                    break;

                case 5:
                    sistemaMatricula.listarCursos();
                    break;

                case 6:
                    sistemaMatricula.listarMatriculas();
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcaoMenu != 0);

        leitorEntrada.close();
    }
}
