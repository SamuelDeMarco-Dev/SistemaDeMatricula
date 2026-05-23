# Projeto XP - Sistema de Matrículas

## Descrição

Este projeto foi desenvolvido em Java com base no método XP, Extreme Programming, seguindo o princípio de **fazer o mais simples que funcione**.

O sistema tem como objetivo permitir que um atendente realize o cadastro de alunos, o cadastro de cursos, a matrícula de alunos em cursos já cadastrados e o cancelamento de matrículas.

A solução utiliza uma estrutura simples em memória, sem banco de dados, e possui interação por meio de menu em console.

---

## Funcionalidades

O sistema permite:

- Cadastrar aluno;
- Cadastrar curso;
- Matricular aluno em curso;
- Cancelar matrícula;
- Listar alunos cadastrados;
- Listar cursos cadastrados;
- Listar matrículas realizadas;
- Controlar quantidade de vagas dos cursos;
- Impedir matrícula duplicada no mesmo curso;
- Encerrar o sistema.

---

## Histórias de Usuário

### História 1 - Cadastro de Aluno

Como atendente, quero cadastrar um aluno para manter seus dados no sistema.

#### Critérios de Aceitação

- O sistema deve permitir informar nome e e-mail do aluno;
- O aluno deve ficar armazenado no sistema;
- Não deve ser possível cadastrar aluno com nome vazio.

---

### História 2 - Cadastro de Curso

Como atendente, quero cadastrar um curso para disponibilizá-lo para matrícula.

#### Critérios de Aceitação

- O sistema deve permitir informar nome do curso e quantidade de vagas;
- O curso deve ficar armazenado no sistema;
- A quantidade de vagas deve ser maior que zero.

---

### História 3 - Matrícula de Aluno

Como atendente, quero matricular um aluno em um curso para registrar sua inscrição.

#### Critérios de Aceitação

- Só é possível matricular um aluno já cadastrado;
- Só é possível matricular em curso já cadastrado;
- A matrícula deve ficar registrada no sistema.

---

### História 4 - Cancelamento de Matrícula

Como atendente, quero cancelar uma matrícula para remover a inscrição de um aluno em um curso.

#### Critérios de Aceitação

- O sistema deve permitir cancelar uma matrícula pelo ID;
- Só deve ser possível cancelar uma matrícula existente;
- A matrícula cancelada não deve aparecer mais na listagem;
- A vaga do curso deve ser liberada após o cancelamento.

---

## Melhorias Implementadas

Além das histórias iniciais, foram adicionadas as seguintes melhorias:

- Não permitir matrícula duplicada do mesmo aluno no mesmo curso;
- Não permitir matrícula quando o curso não possuir vagas disponíveis;
- Permitir cancelamento de matrícula;
- Exibir vagas totais e vagas disponíveis na listagem de cursos.

---

## Tecnologias Utilizadas

- Java;
- Programação Orientada a Objetos;
- Console;
- ArrayList para armazenamento em memória;
- NetBeans;
- Maven;
- Método XP.

---

## Estrutura do Projeto

```text
ProjetoXP
└── src
    └── main
        └── java
            └── com
                └── mycompany
                    └── projetoxp
                        ├── ProjetoXP.java
                        ├── Aluno.java
                        ├── Curso.java
                        ├── Matricula.java
                        └── SistemaMatricula.java
```

---

## Classes do Sistema

### ProjetoXP

Classe principal do sistema.

Responsável por iniciar a aplicação e exibir o menu em console para o usuário.

Principais responsabilidades:

- Exibir o menu;
- Ler a opção escolhida pelo usuário;
- Chamar os métodos da classe `SistemaMatricula`;
- Encerrar o sistema quando solicitado.

---

### Aluno

Representa um aluno cadastrado no sistema.

Atributos principais:

- `idAluno`;
- `nomeAluno`;
- `emailAluno`.

A classe possui:

- Construtor vazio;
- Construtor com parâmetros;
- Getters;
- Setters.

---

### Curso

Representa um curso disponível para matrícula.

Atributos principais:

- `idCurso`;
- `nomeCurso`;
- `quantidadeVagasCurso`.

A classe possui:

- Construtor vazio;
- Construtor com parâmetros;
- Getters;
- Setters.

---

### Matricula

Representa a matrícula de um aluno em um curso.

Atributos principais:

- `idMatricula`;
- `alunoMatriculado`;
- `cursoMatriculado`.

A classe possui:

- Construtor vazio;
- Construtor com parâmetros;
- Getters;
- Setters.

---

### SistemaMatricula

Classe responsável pelas regras principais do sistema.

Responsabilidades:

- Cadastrar alunos;
- Cadastrar cursos;
- Buscar aluno por ID;
- Buscar curso por ID;
- Buscar matrícula por ID;
- Registrar matrículas;
- Cancelar matrículas;
- Verificar matrícula duplicada;
- Controlar vagas disponíveis;
- Listar alunos;
- Listar cursos;
- Listar matrículas.

---

## Padrões Utilizados

O projeto segue boas práticas básicas de Java:

- Classes com nomes claros e iniciando com letra maiúscula;
- Atributos e variáveis em camelCase;
- Métodos com nomes coerentes com sua função;
- Uso de construtores vazios;
- Uso de construtores com parâmetros;
- Uso de getters e setters;
- Encapsulamento dos atributos com `private`;
- Separação de responsabilidades entre as classes.

Exemplos de nomes utilizados:

```java
nomeAluno
emailAluno
nomeCurso
quantidadeVagasCurso
alunoMatriculado
cursoMatriculado
listaAlunos
listaCursos
listaMatriculas
```

---

## Relação com o Método XP

O projeto foi desenvolvido seguindo práticas do método XP, especialmente:

- Simplicidade;
- Entregas incrementais;
- Feedback rápido;
- Refatoração quando necessário;
- Código simples e compreensível;
- Implementação apenas do necessário.

A solução evita complexidades desnecessárias, como banco de dados ou interface gráfica, pois o objetivo inicial é validar as histórias de usuário da forma mais simples possível.

---

## Solução Mínima

A solução mínima definida para o projeto foi:

- Utilizar Java;
- Criar classes simples para representar aluno, curso e matrícula;
- Utilizar listas em memória para armazenar os dados;
- Criar um menu em console para interação com o usuário;
- Validar as regras definidas nos critérios de aceitação;
- Não utilizar banco de dados nesta primeira versão;
- Não implementar funcionalidades que não foram solicitadas inicialmente.

Posteriormente, a solução foi evoluída com melhorias simples:

- Controle de vagas;
- Bloqueio de matrícula duplicada;
- Cancelamento de matrícula.

---

## Armazenamento dos Dados

Os dados são armazenados em memória utilizando listas do tipo `ArrayList`.

Exemplo:

```java
private List<Aluno> listaAlunos;
private List<Curso> listaCursos;
private List<Matricula> listaMatriculas;
```

Por esse motivo, os dados são mantidos apenas durante a execução do sistema. Ao encerrar o programa, os dados cadastrados são perdidos.

---

## Menu do Sistema

Ao executar o projeto, será exibido o seguinte menu no console:

```text
===== Sistema de Matrículas =====

1 - Cadastrar aluno
2 - Cadastrar curso
3 - Matricular aluno em curso
4 - Listar alunos
5 - Listar cursos
6 - Listar matrículas
7 - Cancelar matrícula
0 - Sair

Escolha uma opção:
```

---

## Como Executar o Projeto

### Pelo NetBeans

1. Abra o projeto no NetBeans;
2. Verifique se a classe `ProjetoXP.java` está definida como classe principal;
3. Clique com o botão direito no projeto;
4. Selecione a opção `Run`;
5. O menu do sistema será exibido no console.

---

### Pelo Terminal

Acesse a pasta do projeto e compile os arquivos Java:

```bash
javac src/main/java/com/mycompany/projetoxp/*.java
```

Depois execute a classe principal:

```bash
java com.mycompany.projetoxp.ProjetoXP
```

---

## Principais Regras Implementadas

### Cadastro de Aluno

O sistema valida se o nome do aluno está vazio.

Caso esteja vazio, o cadastro não é realizado.

```java
if (nomeAluno == null || nomeAluno.trim().isEmpty()) {
    System.out.println("Não é possível cadastrar aluno com nome vazio.");
    return;
}
```

---

### Cadastro de Curso

O sistema valida se o nome do curso está vazio.

Também valida se a quantidade de vagas é maior que zero.

```java
if (nomeCurso == null || nomeCurso.trim().isEmpty()) {
    System.out.println("Não é possível cadastrar curso com nome vazio.");
    return;
}

if (quantidadeVagasCurso <= 0) {
    System.out.println("A quantidade de vagas deve ser maior que zero.");
    return;
}
```

---

### Matrícula de Aluno

O sistema valida se o aluno e o curso existem antes de realizar a matrícula.

```java
if (alunoEncontrado == null) {
    System.out.println("Aluno não encontrado.");
    return;
}

if (cursoEncontrado == null) {
    System.out.println("Curso não encontrado.");
    return;
}
```

---

### Bloqueio de Matrícula Duplicada

O sistema verifica se o aluno já está matriculado no mesmo curso.

```java
if (verificarMatriculaDuplicada(idAluno, idCurso)) {
    System.out.println("Este aluno já está matriculado neste curso.");
    return;
}
```

---

### Controle de Vagas

O sistema conta quantas matrículas existem no curso.

Caso a quantidade de matrículas seja igual ou maior que a quantidade de vagas, uma nova matrícula é bloqueada.

```java
int quantidadeMatriculasCurso = contarMatriculasPorCurso(idCurso);

if (quantidadeMatriculasCurso >= cursoEncontrado.getQuantidadeVagasCurso()) {
    System.out.println("Não há vagas disponíveis para este curso.");
    return;
}
```

---

### Cancelamento de Matrícula

O sistema permite cancelar uma matrícula existente pelo ID.

```java
public void cancelarMatricula(int idMatricula) {
    Matricula matriculaEncontrada = buscarMatriculaPorId(idMatricula);

    if (matriculaEncontrada == null) {
        System.out.println("Matrícula não encontrada.");
        return;
    }

    listaMatriculas.remove(matriculaEncontrada);

    System.out.println("Matrícula cancelada com sucesso.");
}
```

---

## Testes Realizados

Os testes foram definidos com base nos critérios de aceitação das histórias de usuário e nas melhorias implementadas.

---

### Teste 1 - Cadastrar aluno válido

Entrada:

```text
Nome: Samuel De Marco
E-mail: samuel@teste.com
```

Resultado esperado:

```text
Aluno cadastrado com sucesso.
```

---

### Teste 2 - Cadastrar aluno com nome vazio

Entrada:

```text
Nome:
E-mail: teste@email.com
```

Resultado esperado:

```text
Não é possível cadastrar aluno com nome vazio.
```

---

### Teste 3 - Cadastrar curso válido

Entrada:

```text
Nome do curso: Engenharia de Computação
Quantidade de vagas: 2
```

Resultado esperado:

```text
Curso cadastrado com sucesso.
```

---

### Teste 4 - Cadastrar curso com zero vagas

Entrada:

```text
Nome do curso: Administração
Quantidade de vagas: 0
```

Resultado esperado:

```text
A quantidade de vagas deve ser maior que zero.
```

---

### Teste 5 - Cadastrar curso com vagas negativas

Entrada:

```text
Nome do curso: Direito
Quantidade de vagas: -5
```

Resultado esperado:

```text
A quantidade de vagas deve ser maior que zero.
```

---

### Teste 6 - Matricular aluno em curso existente

Pré-condição:

- Aluno cadastrado com ID 1;
- Curso cadastrado com ID 1.

Entrada:

```text
ID do aluno: 1
ID do curso: 1
```

Resultado esperado:

```text
Matrícula realizada com sucesso.
```

---

### Teste 7 - Matricular aluno inexistente

Entrada:

```text
ID do aluno: 99
ID do curso: 1
```

Resultado esperado:

```text
Aluno não encontrado.
```

---

### Teste 8 - Matricular curso inexistente

Entrada:

```text
ID do aluno: 1
ID do curso: 99
```

Resultado esperado:

```text
Curso não encontrado.
```

---

### Teste 9 - Impedir matrícula duplicada

Pré-condição:

- Aluno ID 1 já matriculado no curso ID 1.

Entrada:

```text
ID do aluno: 1
ID do curso: 1
```

Resultado esperado:

```text
Este aluno já está matriculado neste curso.
```

---

### Teste 10 - Impedir matrícula sem vagas disponíveis

Pré-condição:

- Curso cadastrado com 1 vaga;
- Um aluno já matriculado no curso.

Entrada:

```text
ID do aluno: 2
ID do curso: 1
```

Resultado esperado:

```text
Não há vagas disponíveis para este curso.
```

---

### Teste 11 - Cancelar matrícula existente

Entrada:

```text
ID da matrícula: 1
```

Resultado esperado:

```text
Matrícula cancelada com sucesso.
```

---

### Teste 12 - Cancelar matrícula inexistente

Entrada:

```text
ID da matrícula: 99
```

Resultado esperado:

```text
Matrícula não encontrada.
```

---

### Teste 13 - Verificar liberação de vaga após cancelamento

Pré-condição:

- Curso cadastrado com 1 vaga;
- Matrícula realizada;
- Matrícula cancelada.

Entrada:

```text
ID do aluno: 2
ID do curso: 1
```

Resultado esperado:

```text
Matrícula realizada com sucesso.
```

---

### Teste 14 - Listar alunos

Entrada:

```text
Opção 4
```

Resultado esperado:

```text
Lista de alunos cadastrados exibida corretamente.
```

---

### Teste 15 - Listar cursos

Entrada:

```text
Opção 5
```

Resultado esperado:

```text
Lista de cursos cadastrados exibida corretamente, com vagas totais e disponíveis.
```

---

### Teste 16 - Listar matrículas

Entrada:

```text
Opção 6
```

Resultado esperado:

```text
Lista de matrículas ativas exibida corretamente.
```

---

### Teste 17 - Encerrar sistema

Entrada:

```text
Opção 0
```

Resultado esperado:

```text
Sistema encerrado.
```

---

## Estimativa das Histórias

| História | Descrição | Complexidade | Estimativa |
|---|---|---:|---:|
| 1 | Cadastrar aluno | Baixa | 2 pontos |
| 2 | Cadastrar curso | Baixa | 2 pontos |
| 3 | Matricular aluno em curso | Média | 3 pontos |
| 4 | Cancelar matrícula | Baixa | 2 pontos |
| 5 | Bloquear matrícula duplicada | Baixa | 1 ponto |
| 6 | Controlar vagas disponíveis | Média | 2 pontos |

Total estimado: **12 pontos de história**.

---

## Refatorações Realizadas

Durante o desenvolvimento, foram realizadas refatorações simples para melhorar a organização do código.

Exemplos:

- Criação dos métodos `buscarAlunoPorId` e `buscarCursoPorId`;
- Criação do método `buscarMatriculaPorId`;
- Criação do método `verificarMatriculaDuplicada`;
- Criação do método `contarMatriculasPorCurso`;
- Uso de nomes mais claros para variáveis e atributos;
- Separação da lógica principal na classe `SistemaMatricula`;
- Uso de classes específicas para `Aluno`, `Curso` e `Matricula`;
- Organização do menu principal na classe `ProjetoXP`.

---

## Progresso Apresentado ao Cliente

O desenvolvimento foi realizado em pequenas entregas, seguindo o método XP.

| Entrega | Funcionalidade demonstrada |
|---|---|
| 1 | Cadastro de aluno funcionando |
| 2 | Cadastro de curso funcionando |
| 3 | Matrícula de aluno em curso funcionando |
| 4 | Listagem de alunos, cursos e matrículas |
| 5 | Controle de vagas funcionando |
| 6 | Bloqueio de matrícula duplicada funcionando |
| 7 | Cancelamento de matrícula funcionando |

A cada entrega, o cliente poderia validar se o sistema atendia aos critérios de aceitação definidos.

---

## Limitações da Versão Atual

Esta versão possui algumas limitações, pois foi desenvolvida como uma solução simples:

- Os dados não são salvos após encerrar o programa;
- Não há banco de dados;
- Não há interface gráfica;
- Não há controle de login;
- Não há validação de formato de e-mail;
- Não há edição de dados cadastrados;
- Não há exclusão de alunos ou cursos.

---

## Possíveis Melhorias Futuras

Algumas melhorias possíveis para versões futuras são:

- Salvar os dados em banco de dados;
- Criar interface gráfica;
- Criar API web;
- Validar formato do e-mail;
- Permitir editar dados de alunos;
- Permitir editar dados de cursos;
- Permitir excluir aluno;
- Permitir excluir curso;
- Criar testes automatizados com JUnit;
- Criar tratamento para entradas inválidas no menu.

---

## Conclusão

O projeto atende às histórias de usuário propostas utilizando uma solução simples, funcional e alinhada ao método XP.

A aplicação foi desenvolvida em Java, com classes organizadas, atributos em camelCase, construtores, getters, setters e armazenamento em memória.

A solução cumpre o objetivo de permitir o cadastro de alunos, o cadastro de cursos, a realização de matrículas e o cancelamento de matrículas.

Também foram implementadas melhorias importantes, como o controle de vagas disponíveis e o bloqueio de matrícula duplicada no mesmo curso.

---

## Autor

Projeto desenvolvido para atividade acadêmica utilizando Java e método XP.