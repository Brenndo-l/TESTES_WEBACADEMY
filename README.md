# testes-t6
Repositório da disciplina Testes (Turma 6)

## Atualizando seu repositório local

O código produzido em sala de aula, e compartilhado neste repositório, pode ser atualizado em seu repositório local com o comando:

```console
git pull
```

No entando, se você fez alterações no seu repositório local, o comando acima pode gerar conflitos. Para evitar lidar com isso, você pode forçar uma atualização com o repositório remoto por meio dos comandos:

```console
git fetch origin
git reset --hard origin/main
```

O primeiro comando recebe as atualizações mais recentes do repositório remoto, e o segundo descarta todas as alterações locais e atualiza com o histórico mais recente do repositório remoto (branch main).

## Como inciar a aplicação

### Back-end

```console
cd sgcmapi
mvn package
java -jar target\sgcmapi.jar
```

Ou

```console
cd sgcmapi
mvn spring-boot:run
```

A aplicação vai iniciar no endereço <https://localhost:9000>, com acesso local a base de dados MySQL, por meio da porta padrão 3306, além de usuário e senha "root".

### Front-end

Para iniciar a aplicação, é necessário também instalar as dependências do projeto.

```console
cd sgcmapp
npm install
ng serve --ssl
```

A aplicação vai iniciar no endereço <https://localhost:4200>.

## Sites de referência

- Angular Developer Guides - Testing: <https://angular.io/guide/>
- Testing Angular - A Guide to Robust Angular Applications: <https://testing-angular.com/>
- Spring Boot Reference - Testing: <https://docs.spring.io/spring-boot/docs/3.0.11/reference/html/features.html#features.testing>
- JUnit 5 User Guide: <https://code.visualstudio.com/docs/nodejs/angular-tutorial>
- Testing Java with Visual Studio Code: <https://code.visualstudio.com/docs/java/java-testing>

## Ferramentas

- **Visual Studio Code**
  - <https://code.visualstudio.com/Download>
- **Extension Pack for Java (Extensão do VS Code)**
  - <https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack>
- **Spring Boot Extension Pack (Extensão do VS Code)**
  - <https://marketplace.visualstudio.com/items?itemName=pivotal.vscode-boot-dev-pack>
- **XML (Extensão do VS Code)**
  - <https://marketplace.visualstudio.com/items?itemName=redhat.vscode-xml>
- **Angular Language Service (Extensão do VS Code)**
  - <https://marketplace.visualstudio.com/items?itemName=Angular.ng-template>
- **Git**
  - <https://git-scm.com/downloads>
- **Postman**
  - <https://www.postman.com/downloads/>
  - Link para download da coleção compartilhada: <https://api.postman.com/collections/19704449-e147c76f-5808-48bd-9808-8f7315414ed9?access_key=PMAT-01HBEZH1WVE959024Z1V9S5BYS>
- **JDK 17**
  - Para verificar se o JDK está corretamente instalado e configurado, digite no prompt de comandos:
    - ```javac -version```
  - Se necessário, realizar a instalação e configuração:
    - Link para download: <https://download.oracle.com/java/17/archive/jdk-17.0.8_windows-x64_bin.msi>
    - Criar a variável de ambiente JAVA_HOME configurada para o diretório de instalação do JDK. Exemplo: “C:\Program Files\Java\jdk-17”.
    - Adicionar “%JAVA_HOME% bin” na variável de ambiente PATH.
    - Tutorial de configuração: <https://mkyong.com/java/how-to-set-java_home-on-windows-10/>
- **Maven**
  - Para verificar se o Maven está corretamente instalado e configurado, digite no prompt de comandos:
    - ```mvn -version```
  - Se necessário, realizar a instalação e configuração:
    - Link para download: <https://dlcdn.apache.org/maven/maven-3/3.8.8/binaries/apache-maven-3.8.8-bin.zip>
    - Adicionar o diretório de instalação do Maven na variável de ambiente PATH. Exemplo: “C:\apache-maven\bin”.
    - Tutorial de instalação: <https://mkyong.com/maven/how-to-install-maven-in-windows/>
- **MySQL**
  - Verificar se o MySQL está funcionando:
    - Para tentar conectar no MySQL, no prompt de comandos digite:
      - ```mysql -u root -p```
    - Tentar acessar com senha em branco ou senha igual ao nome de usuário (root).
    - Tutorial para resetar a senha de root, caso necessário: <https://dev.mysql.com/doc/mysql-windows-excerpt/8.0/en/resetting-permissions-windows.html>
  - Remova o banco de dados ```sgcm```, se existir:
    - No prompt de comandos digite:
      - ```mysql -u root -p```
    - Ao conectar no MySQL, execute a seguinte instrução SQL:
      - ```DROP DATABASE sgcm;```
  - Se necessário, realizar a instalação:
    - Link para download: <https://dev.mysql.com/downloads/file/?id=516927>
    - [Tutorial de instalação](https://github.com/webacademyufac/tutoriais/blob/main/mysql/mysql.md)
- **Node.js (e npm)**
  - Versão 18 (LTS).
  - Para verificar a versão do Node.js, no prompt de comandos digite:
    - ```node --version```
  - Link para download: <https://nodejs.org/en/download/>
- **Angular CLI**
  - Versão 16.
  - Para verificar a versão do Angular CLI, no prompt de comandos digite:
    - ```ng version```
  - Tutorial de instalação: <https://angular.io/guide/setup-local>
  - Para instalar o Angular CLI, no prompt de comandos digite:
    - ```npm i -g @angular/cli@16```

## SGCM - Sistema de Gerenciamento de Clínica Médica

A demonstração de uso das ferramentas e tecnologias abordadas na capacitação é baseada em um projeto de exemplo, o SGCM. A documentação básica deste projeto está disponível [em outro repositório](https://github.com/webacademyufac/sgcmdocs) e aborda os seguintes tópicos:

- [Principais funcionalidades](https://github.com/webacademyufac/sgcmdocs#principais-funcionalides)
- [Histórias de usuário](https://github.com/webacademyufac/sgcmdocs#histórias-de-usuário)
- [Diagrama de Classes](https://github.com/webacademyufac/sgcmdocs#diagrama-de-classes)
- [Diagrama Entidade Relacionamento](https://github.com/webacademyufac/sgcmdocs#diagrama-entidade-relacionamento)

## Atividades Práticas

> [!IMPORTANT]
>
> - As atividades serão entregues com o GitHub Classroom e podem ser acessadas pelos links nas descrições das atividades.
> - Link da sala de aula para a disciplina de Testes Turma 6: 
>   - https://classroom.github.com/classrooms/101579917-webacademyufac-classroom-testes-turma6

1. [INDIVIDUAL] 
 a. Criar uma classe de testes com JUnit para um método de outra classe Java capaz transformar um número em algarismo romano (no formato string) para um inteiro no sistema decimal (até o valor 4000). Os testes devem incluir algarismos com apenas um algarismo, com algarismos iguais, com algarismos diferenes, com algarismos de notação subtrativa (ex: IV, IX, XIV) e com algarismos inválidos.

 b. Implementar uma classe chamada ListaUtils com os métodos: somaElementos(List<Integer> lista), inverterLista(List<Integer> lista), encontrarMaiorElemento(List<Integer> lista), filtrarPares(List<Integer> lista). Escrever testes unitários que garantam o comportamento correto para listas de diferentes tamanhos, incluindo listas vazias e listas com todos os elementos iguais.
 (Entrega: 05/11/2024). Link da atividade: https://classroom.github.com/a/RIbPoPZ4

2. [GRUPO] Criar testes para o projeto back-end. (Entrega: 08/11/2024). 
Link da atividade: https://classroom.github.com/a/UMDyAcTF

    - **Back-end**: criar testes de unidade para todas as classes nas camadas ```model```, ```service``` e ```controller``` e de integração nas camadas ```repository``` e ```controller``` até alcançar o máximo de cobertura de código.

Equipes: 
  1)Kelvin, Luis Henrique, Samuel, Hayssa
  2)João Vitor, Marcos, Isaque
  3)John, Mateus, Rafael, Brenndo
  4)Beatriz, Douglas, Willian
  5)Gabriel, Ester