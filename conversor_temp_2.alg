algoritmo "Conversor EUA"
//tentei formatar o número de dígitos antes da vírgula, mas sem sucesso nessa linguagem:
//digitos <- int(Compr(numpcarac(int(valor_dolar))))
//valor_dolar:digitos:2

var
programa_ligado: logico
opcao_menu: literal
nova_operacao: literal
temperatura_celsius: real
temperatura_fahrenheit: real
termino: literal
i: inteiro

inicio
programa_ligado <- VERDADEIRO

escreval("Conversor Temperatura - 2.0")
escreval("")

enquanto programa_ligado faca
   escreval("Operações")
   escreval("")
   escreval("Temperatura")
   escreval("(a) Celsius para Fahrenheit")
   escreval("(b) Fahrenheit para Celsius")
   escreval("(q) Sair")
   escreval("")
   escreval("Digite a tecla correspondente de qual operação você deseja realizar")

   leia(opcao_menu)

   escolha opcao_menu

   caso "a"
      escreval("Informe a temperatura (°F) : ")
      leia(temperatura_fahrenheit)
      temperatura_celsius <- (temperatura_fahrenheit-32)/1.8
      escreval(temperatura_fahrenheit, " °F equivalem a", temperatura_celsius, " °C")

   caso "b"
      escreval("Informe a temperatura (°C) : ")
      leia(temperatura_celsius)
      temperatura_fahrenheit <- temperatura_celsius*1.8+32
      escreval(temperatura_celsius, " °C equivalem a", temperatura_fahrenheit, " °F")

   caso "q"
      escreval("Boa estadia!")
      programa_ligado <- FALSO
      interrompa
      
   outrocaso
      escreval("Não entendi o comando. Digite novamente o comando da operação desejada")

   fimescolha

   nova_operacao <- ""
   enquanto (nova_operacao <> "s") e (nova_operacao <> "n") faca
      escreval("Deseja fazer nova operação? (s/n)")
      leia(nova_operacao)
      limpatela
      se nova_operacao = "n" entao
      programa_ligado <- FALSO
      fimse
   fimenquanto
fimenquanto

para i de 1 ate 100 passo 1 faca
     temperatura_fahrenheit <- i*1.8+32
     escreval(i, " °C equivalem a", temperatura_fahrenheit, " °F")
fimpara
escreval("Pressione uma tecla para continuar...")
leia(termino)

fimalgoritmo
