Algoritmo "Aula_03"
// Disciplina   : Lógica de Programação Essencial
// Professor   : Denilson Bonatti
// Descrição   : Calcula a média artimética de 4 notas
// Autor(a)    : Rafael Galdino
// Data atual  : 23/09/2022
Var
// Seção de Declarações das variáveis 
n1, n2, n3, n4, total, media : real
aluno : caracter

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Nome do aluno ==> ")
leia(aluno)
escreva("Nota 1 = ")
leia(n1)
escreva("Nota 2 = ")
leia(n2)
escreva("Nota 3 = ")
leia(n3)
escreva("Nota 4 = ")
leia(n4)
total <- n1 + n2 + n3 + n4
media <- (n1 + n2 + n3 + n4) / 4
escreval("Aluno ==> ", aluno)
escreval("Soma das notas ==> ", total)
escreva("Média final do aluno ", aluno, " ==> ", media)

Fimalgoritmo