algoritmo "Conversor Temperatura"
var
programa_ligado: logico

// Funções e procedimentos
funcao menu(): literal
var
opcao_menu: literal
inicio
escreval("Operações")
escreval("")
escreval("Conversor")
escreval("(a) Celsius (°C) para Fahrenheit (°F)")
escreval("(b) Fahrenheit (°F) para Celsius (°C)")
escreval("Armazenamento")
escreval("(c) Armazenar dados em Celsius (°C)")
escreval("(d) Armazenar dados em Fahrenheit (°F)")
escreval("(q) Sair")
escreval("")
escreval("Digite a tecla correspondente de qual operação você deseja realizar")
leia(opcao_menu)
retorne opcao_menu
fimfuncao

procedimento nova_operacao()
var
opcao: literal
inicio
opcao <- ""
enquanto (opcao <> "s") e (opcao <> "n") faca
   escreval("Deseja fazer nova operação? (s/n)")
   leia(opcao)
   limpatela
   se opcao = "n" entao
      programa_ligado <- FALSO
   fimse
fimenquanto
fimprocedimento

funcao celsius_p_fahrenheit(valor: real): real
var
inicio
retorne valor*1.8+32
fimfuncao

funcao fahrenheit_p_celsius(valor: real): real
var
inicio
retorne (valor-32)/1.8
fimfuncao

procedimento conversor_temperatura (tipo: literal)
var
temperatura_celsius: real
temperatura_fahrenheit: real
inicio
se tipo = "a" entao
   escreval("Informe a temperatura (°F) : ")
   leia(temperatura_fahrenheit)
   temperatura_celsius <- fahrenheit_p_celsius(temperatura_fahrenheit)
   escreval(temperatura_fahrenheit, " °F equivalem a", temperatura_celsius, " °C")
fimse

se tipo = "b" entao
   escreval("Informe a temperatura (°C) : ")
   leia(temperatura_celsius)
   temperatura_fahrenheit <- celsius_p_fahrenheit(temperatura_celsius)
   escreval(temperatura_celsius, " °C equivalem a", temperatura_fahrenheit, " °F")
fimse
fimprocedimento

procedimento registro_impressao(tipo: literal)
var
armazenamento_temperatura: vetor[1..4] de real
armazenamento_hora: vetor[1..4] de literal
i: inteiro
j: inteiro
aux_temperatura: real
aux_hora: literal

inicio
para i de 1 ate 4 faca:         ///////////
   Escreval("Informe a hora do dado", i," (hh:mm)")
   leia(armazenamento_hora[i])
   Escreval("Informe a temperatura do dado", i)
   leia(armazenamento_temperatura[i])
fimpara
limpatela

// ordenar bolha
para i de 1 ate 4 faca
	para j de 1 ate 4 faca
		se armazenamento_temperatura[j] > armazenamento_temperatura[i] entao
		aux_temperatura <- armazenamento_temperatura[i]
		aux_hora <- armazenamento_hora[i]
		armazenamento_temperatura[i] <- armazenamento_temperatura[j]
		armazenamento_hora[i] <- armazenamento_hora[j]
		armazenamento_temperatura[j] <- aux_temperatura
		armazenamento_hora[j] <- aux_hora
		fimse
	fimpara
fimpara

se tipo = "c" entao
   para i de 1 ate 4 faca
        escreval("Temperatura", armazenamento_temperatura[i]," graus Celsius, registrada as ", armazenamento_hora[i]," h corresponde a",celsius_p_fahrenheit(armazenamento_temperatura[i])," graus Fahrenheit.")
   fimpara
fimse

se tipo = "d" entao
   para i de 1 ate 4 faca
        escreval("Temperatura", armazenamento_temperatura[i]," graus Fahrenheit, registrada as ", armazenamento_hora[i]," h corresponde a",fahrenheit_p_celsius(armazenamento_temperatura[i])," graus Celsius.")
   fimpara
fimse

fimprocedimento

// Programa
inicio
escreval("Conversor de Temperatura - 2.0")
escreval("")
programa_ligado <- VERDADEIRO

enquanto programa_ligado faca
   escolha menu()
   caso "a"
      conversor_temperatura("a")
   caso "b"
      conversor_temperatura("b")
   caso "c"
      registro_impressao("c")
   caso "d"
      registro_impressao("d")
   caso "q"
      programa_ligado <- FALSO
      interrompa
   outrocaso
      escreval("Não entendi o comando.")
   fimescolha
   nova_operacao()
fimenquanto

fimalgoritmo
