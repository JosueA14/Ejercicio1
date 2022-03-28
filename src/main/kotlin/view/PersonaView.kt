package view

import model.Persona
import controller.PersonaController

class PersonaView {

    fun menu() {
        println("Bienvenido")

        var controlador = PersonaController()
        var nombre: String
        var edad: Int
        var sexo: Char
        var peso: Double
        var altura: Double

        println("Digite su nombre: "); nombre = readLine()?.toString()!!
        println("Digite su edad: "); edad = readLine()?.toInt()!!
        println("Digite su sexo: "); sexo = readLine()!![0]
        println("Digite su peso: "); peso = readLine()?.toDouble()!!
        println("Digite su altura(cm): "); altura = readLine()?.toDouble()!!

        var objeto1 = Persona(nombre, edad, sexo, "11111", peso, altura)
        var objeto2 = Persona(nombre, edad, sexo)
        var objeto3 = Persona()
        objeto3.nombre = nombre
        objeto3.edad = edad
        objeto3.sexo = sexo

        println("\nRESULTADOS!!\n")
        println("Primer Objeto:");
        controlador.recibeDatos(objeto1);
        println("Segundo Objeto:");
        controlador.recibeDatos(objeto2);
        println("Tercer Objeto:");
        controlador.recibeDatos(objeto3);

    }
}