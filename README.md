# Automacao_AmazonEcomm_Java

## Configuração
Projeto de automação de testes web na linguagem <b>Java</b> com <b>Maven</b> usando:

- Junit 5.11.0
- Cucumber 7.15.0
- Selenium WebDriver 4.24.0

###### ChromeDriver Download: http://chromedriver.chromium.org/downloads

# Arquitetura
<i>Este projeto de automação de testes foi desenvolvido seguindo as melhores práticas para garantir uma arquitetura robusta, organizada e escalável. O foco foi criar uma estrutura modular que facilite a manutenção e ampliação do projeto, mantendo a simplicidade e a clareza no código.</i>:

## Estrutura do Projeto
A estrutura do projeto é dividida em pastas que refletem as diferentes responsabilidades e camadas da aplicação:

***
src
- main
- - java
  - - core
    - pageobjects
    - utilidades
- test
- - java
  - - features
    - runner
    - stepdefinitions
***

### 1. `main.java.core`: Gerenciamento do Driver e BasePage
A pasta `core` contém toda a lógica essencial para o funcionamento do projeto, como a fábrica de drivers e a classe `BasePage`.

#### DriverFactory
A **`DriverFactory`** é responsável pela criação e gerenciamento dos diferentes drivers (Chrome, Firefox, etc.), garantindo a execução dos testes em diferentes ambientes e plataformas. O uso do padrão **Factory** assegura a flexibilidade e escalabilidade ao adicionar novos navegadores ou plataformas.

#### BasePage
A **`BasePage`** é o coração das funcionalidades reutilizáveis, organizando ações comuns às páginas, como cliques, interações com elementos, esperas explícitas, entre outras. A arquitetura da **`BasePage`** segue o padrão **Page Object Model (POM)**, o que promove a reutilização de código e facilita a manutenção ao longo do tempo.

#### <i>A BasePage foi organizada em  para otimizar seu uso.</i>
+ MÉTODOS PRINCIPAIS COM TRATATIVA
+ RETORNAR TEXTOS
+ JAVASCRIPT & ACTIONS
+ ESPERAS

### 2. `main.java.pageobjects`: Mapeamento das Páginas e Componentização
Aqui temos os **Page Objects**, responsáveis pelo mapeamento dos elementos e funcionalidades de cada página do sistema. Cada página tem sua própria classe, que encapsula as interações com a interface.

> As páginas são **componentizadas**, ou seja, dividimos as funcionalidades da página em pequenos componentes reutilizáveis.<br>Isso torna o código mais modular e de fácil manutenção.

### 3. `main.java.utilidades`: Constantes organizadas
---

## Testes Automatizados

A estrutura de testes foi organizada para seguir um fluxo lógico e funcional, permitindo que os testes sejam facilmente compreendidos e executados.

### 1. `test.java.features`: Arquivos .feature
Aqui temos os arquivos escritos em **Gherkin**, que descrevem as funcionalidades que estamos automatizando em uma linguagem simples e compreensível por todas as partes envolvidas (técnicas e não técnicas). Cada cenário descreve um comportamento esperado da aplicação, tornando a comunicação clara.

### 2. `test.java.runner`: Orquestradores dos Testes
Nesta pasta, estão os **runners**, que são responsáveis por orquestrar a execução dos testes. Eles organizam quais cenários serão executados e gerenciam a integração com frameworks de relatórios e logs.

### 3. `test.java.stepdefinitions`: Definições de Passos
As **step definitions** (definições de passos) são os códigos que implementam o comportamento descrito nos arquivos `.feature`. Cada passo é atrelado ao contexto do negócio, garantindo que os testes automatizados reflitam fielmente os cenários de uso reais da aplicação.

---

## Boas Práticas Implementadas

- **Organização Modular**: A separação clara das responsabilidades em diferentes camadas do projeto facilita a manutenção e escalabilidade.
- **Page Object Model (POM)**: Aplicação do padrão POM para promover a reutilização e centralização das funcionalidades das páginas.
- **Componentização**: Divisão das funcionalidades de cada página em pequenos componentes.
- **Testes Descritivos em Gherkin**: Uso de uma linguagem clara e acessível (Gherkin) para a descrição dos cenários de teste.
- **DriverFactory**: Gerenciamento centralizado e flexível dos drivers, suportando diferentes navegadores e ambientes de execução.

---
  
### Executando os testes
Para baixar as dependências e rodar os testes pela primeira vez, executar o comando <b>maven clean install</b>

### Cenários validados
![image](https://github.com/user-attachments/assets/58ece983-7f35-4866-95f2-91ed784dc5ca)

### Relatório de execução
O relatório local do <b>Cucumber</b> está localizado em <b>target</b>

