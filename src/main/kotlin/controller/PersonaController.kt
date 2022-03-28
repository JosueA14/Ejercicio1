package controller

import model.Persona

class PersonaController {
    fun calcularIMC(peso: Double, altura: Double): Int {
        var valorIMC: Double
        var alturaM: Double = (altura / 100); //conversion a metros
        valorIMC = peso / (alturaM * alturaM);

        if (valorIMC < 18.5) {
            return -1
        } else if (valorIMC in 18.5..24.9) {
            return 0
        } else {
            return 1
        }
    }

    fun esMayorDeEdad(edad: Int): Boolean {
        if (edad >= 18) {
            return true
        }
        return false
    }

    fun comprobarSexo(sexo: Char): Boolean {
        if (sexo == 'H' || sexo == 'M') {
            return true
        }
        return false
    }

    fun imprime(persona: Persona) {
        persona.toStringP();
    }

    fun recibeDatos(persona: Persona) {

        var IMC: Int = calcularIMC(persona.peso, persona.altura);
        var edad: Boolean = esMayorDeEdad(persona.edad);
        var sexoValido: Boolean = comprobarSexo(persona.sexo);

        print("\nIMC: ")
        if (IMC == -1) {
            print("Bajo peso\n")
        } else if (IMC == 1) {
            print("Peso ideal\n")
        } else {
            print("Sobrepeso\n")
        }
        if (edad){
            print("Es mayor de dad\n")
        }
        else{
            print("No es mayor de edad\n")
        }
        if (sexoValido){
            print("El sexo ingresado es valido\n")
        }
        else{
            print("El sexo ingresado no es valido\n")
        }
        imprime(persona);
    }
}