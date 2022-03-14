algoritmo "semnome"
// Função :
// Autor :
// Data : 08/03/2022
// Seção de Declarações
var
numeros: vetor[1..20] de inteiro
i, j: inteiro
n: inteiro
incremento: inteiro

inicio
// Seção de Comandos
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
