# Automotora1

Análisis:

Existen 6 clases que en el UML estan dentro del package modelo, las cuales son: 

-Automotora: tiene relación de composición con Cliente y Vehiculo

-Cliente: Tiene relación de composición con Automotora y asociación con Compra.

-Compra: Tiene relación de asociación con Vehiculo y Cliente.

-Vehiculo: Es un clase abstracta y usa polimorfismo con los metodos velocidadMaxPermitida y getTipoVehiculo. 
Tiene relación de composición con Automora, asociación con Compra y relación de herencia con sus clases hijas que son Automovil y Motocicleta.

-Automovil: Es una clase hija que hereda de Vehiculo.

-Motocicleta: Al igual que Automovil, es una clase hija que hereda de Vehiculo.


UML:
![image](https://github.com/millrnv/Automotora1/assets/146766468/7172f6e6-1c44-4ecb-b502-064d66b6b776)

