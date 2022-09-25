Algoritmo "Aula_02"
// Disciplina   : Lógica de Programação Essencial
// Professor   : Denilson Bonatti
// Descrição   : Puzzle dos pinguins
// Autor(a)    : Rafael Galdino
// Data atual  : 23/09/2022
Var
   // Seção de Declarações das variáveis
   f1, p1, f2, p2, f3, p3: caracter

procedimento subirBloco(pinguim : caracter)

inicio

   escreval(pinguim, " subiu no bloco")

fimprocedimento

procedimento moverBloco()

inicio

   escreval("Bloco movido!")

fimprocedimento

procedimento descerBloco(pinguim : caracter)

inicio

   escreval(pinguim, " desceu do bloco")

fimprocedimento


Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   f1 <- "Filho Azul"
   p1 <- "Pai Azul"
   f2 <- "Filho Verde"
   p2 <- "Pai Verde"
   f3 <- "Filho Vermelho"
   p3 <- "Pai Vermelho"

   subirBloco(f1)//filho azul subiu no bloco
   subirBloco(p1)//pai azul subiu no bloco
   moverBloco()
   descerBloco(p1)//pai azul desceu do bloco
   moverBloco()
   subirBloco(f2)//filho verde subiu no bloco
   moverBloco()
   descerBloco(f1)//filho azul desceu do bloco
   moverBloco()
   subirBloco(p2)//pai verde subiu no bloco
   moverBloco()
   descerBloco(p2)//pai verde desceu do bloco
   moverBloco()
   subirBloco(f3)//filho vermelho subiu no bloco
   moverBloco()
   descerBloco(f2)//filho verde desceu do bloco
   moverBloco()
   subirBloco(p3)//pai vermelho subiu no bloco
   moverBloco()
   descerBloco(p3)//pai vermelho desceu do bloco
   descerBloco(f3)//filho vermelho desceu do bloco
Fimalgoritmo