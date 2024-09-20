# Automacao_AmazonEcomm_Java

## Configuração
Projeto de automação de testes web na linguagem <b>Java</b> com <b>Maven</b> usando:

- Junit 5.11.0
- Cucumber 7.15.0
- Selenium WebDriver 4.24.0

###### ChromeDriver Download: http://chromedriver.chromium.org/downloads

## Arquitetura
Projeto estruturado a partir do design patterns <b>Page Objects</b>:

- Classe BasePage: Classe mãe das classes Page.
- <b>Métodos tratados</b> e renomeados e facilitados
- Locators e Métodos aplicados por classe Page
- Classe Hooks: Orquestração dos testes
  
### Executando os testes
Para baixar as dependências e rodar os testes pela primeira vez, executar o comando <b>maven clean install</b>

### Cenários validados
![image](https://github.com/user-attachments/assets/58ece983-7f35-4866-95f2-91ed784dc5ca)

### Relatório de execução
O relatório local do <b>Cucumber</b> está localizado em <b>target</b>

