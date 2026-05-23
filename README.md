\# Projeto XP - Sistema de Matrículas



\## Descrição



Este projeto foi desenvolvido em Java com base no método XP, Extreme Programming, seguindo o princípio de \*\*fazer o mais simples que funcione\*\*.



O sistema tem como objetivo permitir que um atendente realize o cadastro de alunos, o cadastro de cursos e a matrícula de alunos em cursos já cadastrados.



A solução utiliza uma estrutura simples em memória, sem banco de dados, e possui interação por meio de menu em console.



\---



\## Funcionalidades



O sistema permite:



\- Cadastrar aluno;

\- Cadastrar curso;

\- Matricular aluno em curso;

\- Listar alunos cadastrados;

\- Listar cursos cadastrados;

\- Listar matrículas realizadas;

\- Encerrar o sistema.



\---



\## Histórias de Usuário



\### História 1 - Cadastro de Aluno



Como atendente, quero cadastrar um aluno para manter seus dados no sistema.



\#### Critérios de Aceitação



\- O sistema deve permitir informar nome e e-mail do aluno;

\- O aluno deve ficar armazenado no sistema;

\- Não deve ser possível cadastrar aluno com nome vazio.



\---



\### História 2 - Cadastro de Curso



Como atendente, quero cadastrar um curso para disponibilizá-lo para matrícula.



\#### Critérios de Aceitação



\- O sistema deve permitir informar nome do curso e quantidade de vagas;

\- O curso deve ficar armazenado no sistema;

\- A quantidade de vagas deve ser maior que zero.



\---



\### História 3 - Matrícula de Aluno



Como atendente, quero matricular um aluno em um curso para registrar sua inscrição.



\#### Critérios de Aceitação



\- Só é possível matricular um aluno já cadastrado;

\- Só é possível matricular em curso já cadastrado;

\- A matrícula deve ficar registrada no sistema.



\---



\## Tecnologias Utilizadas



\- Java;

\- Programação Orientada a Objetos;

\- Console;

\- ArrayList para armazenamento em memória;

\- NetBeans;

\- Método XP.



\---



\## Estrutura do Projeto



```text

ProjetoXP

└── src

&#x20;   └── main

&#x20;       └── java

&#x20;           └── com

&#x20;               └── mycompany

&#x20;                   └── projetoxp

&#x20;                       ├── ProjetoXP.java

&#x20;                       ├── Aluno.java

&#x20;                       ├── Curso.java

&#x20;                       ├── Matricula.java

&#x20;                       └── SistemaMatricula.java

```



\---



\## Classes do Sistema



\### ProjetoXP



Classe principal do sistema.



Responsável por iniciar a aplicação e exibir o menu em console para o usuário.



\---



\### Aluno



Representa um aluno cadastrado no sistema.



Atributos principais:



\- `idAluno`;

\- `nomeAluno`;

\- `emailAluno`.



A classe possui:



\- Construtor vazio;

\- Construtor com parâmetros;

\- Getters;

\- Setters.



\---



\### Curso



Representa um curso disponível para matrícula.



Atributos principais:



\- `idCurso`;

\- `nomeCurso`;

\- `quantidadeVagasCurso`.



A classe possui:



\- Construtor vazio;

\- Construtor com parâmetros;

\- Getters;

\- Setters.



\---



\### Matricula



Representa a matrícula de um aluno em um curso.



Atributos principais:



\- `idMatricula`;

\- `alunoMatriculado`;

\- `cursoMatriculado`.



A classe possui:



\- Construtor vazio;

\- Construtor com parâmetros;

\- Getters;

\- Setters.



\---



\### SistemaMatricula



Classe responsável pelas regras principais do sistema.



Responsabilidades:



\- Cadastrar alunos;

\- Cadastrar cursos;

\- Buscar aluno por ID;

\- Buscar curso por ID;

\- Registrar matrículas;

\- Listar alunos;

\- Listar cursos;

\- Listar matrículas.



\---



\## Padrões Utilizados



O projeto segue boas práticas básicas de Java:



\- Classes com nomes claros e iniciando com letra maiúscula;

\- Atributos e variáveis em camelCase;

\- Métodos com nomes coerentes com sua função;

\- Uso de construtores vazios;

\- Uso de construtores com parâmetros;

\- Uso de getters e setters;

\- Encapsulamento dos atributos com `private`;

\- Separação de responsabilidades entre as classes.



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



\---



\## Relação com o Método XP



O projeto foi desenvolvido seguindo práticas do método XP, especialmente:



\- Simplicidade;

\- Entregas incrementais;

\- Feedback rápido;

\- Refatoração quando necessário;

\- Código simples e compreensível;

\- Implementação apenas do necessário.



A solução evita complexidades desnecessárias, como banco de dados ou interface gráfica, pois o objetivo inicial é validar as histórias de usuário da forma mais simples possível.



\---



\## Solução Mínima



A solução mínima definida para o projeto foi:



\- Utilizar Java;

\- Criar classes simples para representar aluno, curso e matrícula;

\- Utilizar listas em memória para armazenar os dados;

\- Criar um menu em console para interação com o usuário;

\- Validar apenas as regras definidas nos critérios de aceitação;

\- Não utilizar banco de dados nesta primeira versão;

\- Não implementar funcionalidades que não foram solicitadas.



\---



\## Armazenamento dos Dados



Os dados são armazenados em memória utilizando listas do tipo `ArrayList`.



Exemplo:



```java

private List<Aluno> listaAlunos;

private List<Curso> listaCursos;

private List<Matricula> listaMatriculas;

```



Por esse motivo, os dados são mantidos apenas durante a execução do sistema. Ao encerrar o programa, os dados cadastrados são perdidos.



\---



\## Menu do Sistema



Ao executar o projeto, será exibido o seguinte menu no console:



```text

===== Sistema de Matrículas =====



1 - Cadastrar aluno

2 - Cadastrar curso

3 - Matricular aluno em curso

4 - Listar alunos

5 - Listar cursos

6 - Listar matrículas

0 - Sair



Escolha uma opção:

```



\---



\## Como Executar o Projeto



\### Pelo NetBeans



1\. Abra o projeto no NetBeans;

2\. Verifique se a classe `ProjetoXP.java` está definida como classe principal;

3\. Clique com o botão direito no projeto;

4\. Selecione a opção `Run`;

5\. O menu do sistema será exibido no console.



\---



\### Pelo Terminal



Acesse a pasta do projeto e compile os arquivos Java:



```bash

javac src/main/java/com/mycompany/projetoxp/\*.java

```



Depois execute a classe principal:



```bash

java com.mycompany.projetoxp.ProjetoXP

```



\---



\## Testes Realizados



Os testes foram definidos com base nos critérios de aceitação das histórias de usuário.



\---



\### Teste 1 - Cadastrar aluno válido



Entrada:



```text

Nome: João Silva

E-mail: joao@email.com

```



Resultado esperado:



```text

Aluno cadastrado com sucesso.

```



\---



\### Teste 2 - Cadastrar aluno com nome vazio



Entrada:



```text

Nome:

E-mail: teste@email.com

```



Resultado esperado:



```text

Não é possível cadastrar aluno com nome vazio.

```



\---



\### Teste 3 - Listar alunos cadastrados



Pré-condição:



\- Ter pelo menos um aluno cadastrado.



Resultado esperado:



```text

1 - João Silva - joao@email.com

```



\---



\### Teste 4 - Cadastrar curso válido



Entrada:



```text

Nome do curso: Engenharia de Software

Quantidade de vagas: 30

```



Resultado esperado:



```text

Curso cadastrado com sucesso.

```



\---



\### Teste 5 - Cadastrar curso com zero vagas



Entrada:



```text

Nome do curso: Administração

Quantidade de vagas: 0

```



Resultado esperado:



```text

A quantidade de vagas deve ser maior que zero.

```



\---



\### Teste 6 - Cadastrar curso com vagas negativas



Entrada:



```text

Nome do curso: Direito

Quantidade de vagas: -5

```



Resultado esperado:



```text

A quantidade de vagas deve ser maior que zero.

```



\---



\### Teste 7 - Listar cursos cadastrados



Pré-condição:



\- Ter pelo menos um curso cadastrado.



Resultado esperado:



```text

1 - Engenharia de Software - Vagas: 30

```



\---



\### Teste 8 - Matricular aluno em curso existente



Pré-condição:



\- Aluno cadastrado com ID 1;

\- Curso cadastrado com ID 1.



Entrada:



```text

ID do aluno: 1

ID do curso: 1

```



Resultado esperado:



```text

Matrícula realizada com sucesso.

```



\---



\### Teste 9 - Matricular aluno inexistente



Entrada:



```text

ID do aluno: 99

ID do curso: 1

```



Resultado esperado:



```text

Aluno não encontrado.

```



\---



\### Teste 10 - Matricular curso inexistente



Entrada:



```text

ID do aluno: 1

ID do curso: 99

```



Resultado esperado:



```text

Curso não encontrado.

```



\---



\### Teste 11 - Listar matrículas realizadas



Pré-condição:



\- Ter pelo menos uma matrícula realizada.



Resultado esperado:



```text

Matrícula 1 | Aluno: João Silva | Curso: Engenharia de Software

```



\---



\### Teste 12 - Encerrar o sistema



Entrada:



```text

0

```



Resultado esperado:



```text

Sistema encerrado.

```



\---



\## Validações Implementadas



\### Cadastro de Aluno



O sistema valida se o nome do aluno está vazio.



Caso esteja vazio, o cadastro não é realizado.



```java

if (nomeAluno == null || nomeAluno.trim().isEmpty()) {

&#x20;   System.out.println("Não é possível cadastrar aluno com nome vazio.");

&#x20;   return;

}

```



\---



\### Cadastro de Curso



O sistema valida se a quantidade de vagas do curso é maior que zero.



Caso seja igual ou menor que zero, o cadastro não é realizado.



```java

if (quantidadeVagasCurso <= 0) {

&#x20;   System.out.println("A quantidade de vagas deve ser maior que zero.");

&#x20;   return;

}

```



\---



\### Matrícula



O sistema valida se o aluno informado está cadastrado.



Também valida se o curso informado está cadastrado.



Caso o aluno ou o curso não exista, a matrícula não é realizada.



```java

if (alunoEncontrado == null) {

&#x20;   System.out.println("Aluno não encontrado.");

&#x20;   return;

}



if (cursoEncontrado == null) {

&#x20;   System.out.println("Curso não encontrado.");

&#x20;   return;

}

```



\---



\## Estimativa das Histórias



| História | Descrição | Complexidade | Estimativa |

|---|---|---:|---:|

| 1 | Cadastrar aluno | Baixa | 2 pontos |

| 2 | Cadastrar curso | Baixa | 2 pontos |

| 3 | Matricular aluno em curso | Média | 3 pontos |



Total estimado: \*\*7 pontos de história\*\*.



\---



\## Refatorações Realizadas



Durante o desenvolvimento, foram realizadas refatorações simples para melhorar a organização do código.



Exemplos:



\- Criação dos métodos `buscarAlunoPorId` e `buscarCursoPorId`;

\- Uso de nomes mais claros para variáveis e atributos;

\- Separação da lógica principal na classe `SistemaMatricula`;

\- Uso de classes específicas para `Aluno`, `Curso` e `Matricula`;

\- Organização do menu principal na classe `ProjetoXP`.



\---



\## Progresso Apresentado ao Cliente



O desenvolvimento foi realizado em pequenas entregas, seguindo o método XP.



| Entrega | Funcionalidade demonstrada |

|---|---|

| 1 | Cadastro de aluno funcionando |

| 2 | Cadastro de curso funcionando |

| 3 | Matrícula de aluno em curso funcionando |

| 4 | Listagem de alunos, cursos e matrículas |



A cada entrega, o cliente poderia validar se o sistema atendia aos critérios de aceitação definidos.



\---



\## Limitações da Versão Atual



Esta versão possui algumas limitações, pois foi desenvolvida como uma solução mínima:



\- Os dados não são salvos após encerrar o programa;

\- Não há banco de dados;

\- Não há interface gráfica;

\- Não há controle de login;

\- Não há validação de formato de e-mail;

\- Não há controle de quantidade de vagas consumidas;

\- Não há impedimento para matrícula duplicada do mesmo aluno no mesmo curso.



Essas funcionalidades podem ser implementadas futuramente, caso sejam definidas novas histórias de usuário.



\---



\## Possíveis Melhorias Futuras



Algumas melhorias possíveis para versões futuras são:



\- Salvar os dados em banco de dados;

\- Criar interface gráfica;

\- Criar API web;

\- Validar formato do e-mail;

\- Controlar quantidade de vagas disponíveis;

\- Impedir matrícula duplicada;

\- Permitir excluir aluno, curso ou matrícula;

\- Permitir editar dados cadastrados;

\- Criar testes automatizados com JUnit.



\---



\## Conclusão



O projeto atende às três histórias de usuário propostas utilizando uma solução simples, funcional e alinhada ao método XP.



A aplicação foi desenvolvida em Java, com classes organizadas, atributos em camelCase, construtores, getters, setters e armazenamento em memória.



A solução cumpre o objetivo de permitir o cadastro de alunos, o cadastro de cursos e a realização de matrículas, respeitando os critérios de aceitação definidos.



\---



\## Autor



Projeto desenvolvido para atividade acadêmica utilizando Java e método XP.

