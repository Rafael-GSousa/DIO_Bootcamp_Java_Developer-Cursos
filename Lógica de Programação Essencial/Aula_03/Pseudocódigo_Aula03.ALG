Algoritmo "Aula_03"
// Disciplina   : L?gica de Programa??o Essencial
// Professor   : Denilson Bonatti
// Descri??o   : Calcula a m?dia artim?tica de 4 notas
// Autor(a)    : Rafael Galdino
// Data atual  : 23/09/2022
Var
// Se??o de Declara??es das vari?veis 
n1, n2, n3, n4, total, media : real
aluno : caracter

Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
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
escreva("M?dia final do aluno ", aluno, " ==> ", media)

Fimalgoritmo