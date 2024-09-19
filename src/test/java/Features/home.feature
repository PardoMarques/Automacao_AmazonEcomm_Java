#language:pt
@all_home
Funcionalidade: Página Inicial (Home)

	Como usuário da Amazon
	Quero que a página inicial carregue rápido, exiba sugestões de pesquisa e tenha um menu de navegação responsivo
	Para que eu possa iniciar a navegação de forma eficiente e sem problemas

	Cenário: Carregamento rápido da página inicial
		Dado que acesso a página inicial da Amazon
		#Então deve aparecer no titulo a mensagem "EXEMPLO"
		#E deve constar na atual url o valor "abc"

	Cenário: Exibir sugestões de pesquisa ao digitar na barra de pesquisa
		Dado que acesso a página inicial da Amazon
		#Quando escrevo no campo de pesquisa o trecho "controle"
		#Então deve aparecer outras sugestões sobre o trecho "controle"