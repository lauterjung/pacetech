algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 08/03/2022
// Se��o de Declara��es
var
numeros: vetor[1..20] de inteiro
i, j: inteiro
n: inteiro
incremento: inteiro

inicio
// Se��o de Comandos
escreval("Informe n")
leia(n)

para i de 1 ate 20 faca
     numeros[i] <- i
fimpara

incremento <- 1
para i de 1 ate n faca
     para j de n ate 1 faca
          escreva(numeros[j-i])
     incremento <- incremento+1
     fimpara
fimpara


fimalgoritmo
