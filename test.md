# Modelo Matematico/lógico                                                                                                        Lado = lad
Calcular el Area de un polígono
Formula calcular área
Area = Lado * Longitud * Apotema /2                                                                                      Longitud = long

# Datos de Entrada
Longitud = long
Lado = lad (numero de lados)

# Algoritmo
Lado * Longitud * Apotema /2
Longitud = long
Lado = lad
E = long, Apotema, lad, Apotema, Angulo, Radianes, Tangente, area
1.	Leer long, lad
2.	Calcular findAngulo()
3.	Calcular findRadianes()
4.	Calcular findTangente()
5.	Calcular findApotema()
6.	Calcular Area_Poligono

findAngulo()
1.	Angulo = 90 – (180 / lad)
2.	Mostrar Angulo
findRadianes()
1.	Radianes = Angulo / 180
2.	Mostrar Radianes
findTangente()
1.	Tangente = Tan(Radianes)
2.	Mostrar Tangente
findApotema()
1.	Apotema = (long / 2) * Tangente
2.	Mostrar Apotema
Area_Poligono
1.	area = lad * long * Apotema /2
2.	Mostrar Area 
