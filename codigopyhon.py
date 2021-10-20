############################################
# Fecha : 19-10-2021                       #
# Author: Astrit Lariza Garcia Castillo    #
# astritlariza2403@gmail.com               #
############################################

fecha_Nacimiento = int (input("Digite su fecha de nacimiento: "))
diferencia =int (2021 -fecha_Nacimiento)
if diferencia >= 18:
      print ("El usuario tiene", diferencia," es mayor de edad")
else:
    print ("El usuario tiene", diferencia," es menor de edad")
