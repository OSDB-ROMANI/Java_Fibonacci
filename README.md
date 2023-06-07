# Java_Fibonacci
video youtube https://www.youtube.com/watch?v=cCJU5By_b8U

Successione di fibonacci:

1, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...

se F(0) --> 1
se F(1) --> 1
se F(2) --> 1
se F(3) --> 2
se F(4) --> 3
se F(5) --> 5
se F(6) --> 8
se F(7) --> 13
se F(8) --> 21
se F(9) --> 34
se F(10) --> 55

#IDEA 
 - F(3) = F(2)+F(1) 
 - F(4) = F(3)+F(2) 
 - F(5) = F(4)+F(3)
 - F(6) = F(5)+F(4)
 - etc..

#SOLUZUONE 
 - se F(1),F(2) allora il risultato è 1
 - altrimenti F(n) = F(n-1)+F(Fn-2)

#Versione_1
 - Utilizziamo il concetto di ricorsione per calcolare il risultato, richiamando il risultato con n-1 + n-2.
 - Problema: a ogni iterazione devo calcolare tutti i sotto risultati, richiede tempo e potenza di calcolo. Provare con n = 50 !

#Versione_2:
 - Utilizziamo il concetto di ricorsione per calcolare il risultato, richiamando il risultato con n-1 + n-2.
 - Salvo i numeri calcolati in un array che riutilizzo al posto di rifare i calcoli
