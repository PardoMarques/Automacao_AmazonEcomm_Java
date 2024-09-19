#language:pt
@all_home
Funcionalidade: Home

	Como: um visitante
   	Quero: Percorrer os fluxos da página inicial
   	Para: Validar os caminhos possíveis

   	Contexto: Acessando com um usuário Default a página do Valorant
   	Dado um usuario simples acessar a página Home

   	@home
   	Cenario: Validando minimamente a pagina Home
   	Então encontrará a breve descrição "teste" na página 
   	E encontrará o número 1 na página
