#language:pt
@all_home
Funcionalidade: Home

   	Contexto: Acessando com um usuário Default a página do Valorant
   	Dado um usuário acessar a página Home

   	@home
   	Cenario: Validando minimamente a pagina Home
   	Então encontrará a breve descrição "teste" na página 
   	E encontrará o número 1 na página
