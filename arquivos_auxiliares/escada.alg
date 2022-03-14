algoritmo "semnome"
var
numeros: vetor[1..20] de inteiro
i, j: inteiro
n: inteiro

inicio
// Seção de Comandos
escreval("Informe n")
leia(n)

para i de 1 ate 20 faca
   numeros[i] <- i
fimpara

para i de 1 ate n passo 1 faca
   para j de 1 ate i passo 1 faca
      escreva(numeros[j])
   fimpara
   escreval()
   i <- i+1
fimpara

fimalgoritmo
