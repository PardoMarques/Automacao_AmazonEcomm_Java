#language:pt
@all_home
Funcionalidade: Página Inicial (Home)

	Como usuário da Amazon
	Quero que a página inicial carregue rápido, exiba sugestões de pesquisa e tenha um menu de navegação responsivo
	Para que eu possa iniciar a navegação de forma eficiente e sem problemas

	Cenário: Carregamento rápido da página inicial
		Dado que acesso a página inicial da Amazon em menos de três segundos
		Então deve aparecer no titulo a mensagem "Amazon.com.br | Tudo pra você, de A a Z."
		E deve constar na atual url o valor "https://www.amazon.com.br/"

	Esquema do Cenário: Exibir sugestões de pesquisa ao digitar na barra de pesquisa
		Dado que acesso a página inicial da Amazon
		Quando escrevo no campo de pesquisa o trecho <produtoPesquisado>
		Então deve aparecer dez sugestões sobre o trecho <produtoPesquisado>
		Exemplos:
			|	produtoPesquisado	|
			|	"controle"			|
			|	"sabonete"			|
			|	"máquina"			|