algoritmo "conversor_temperatura"

var
t_celsius: real
t_fahrenheit: real

inicio
Escreval("Informe a temperatura (�F) : ")
leia(t_fahrenheit)
t_celsius <- (t_fahrenheit-32)/1.8
Escreval("A temperatura em Celsius � de: ", t_celsius)

se t_celsius < 15 entao
   Escreval("Est� frio")
senao
   se t_celsius > 28 entao
      Escreval("Est� quente")
   senao
      Escreval("Est� agrad�vel")
   fimse
fimse

fimalgoritmo
