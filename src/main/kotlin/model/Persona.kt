package model

class Persona {
    var nombre: String = ""
    var edad: Int = 0
    var cedula: String = ""
    var sexo: Char = '0'
    var peso: Double = 0.0
    var altura: Double = 0.0

    constructor() {
        this.nombre = ""
        this.edad = 0
        this.cedula = "3333"
        this.sexo = '0'
        this.peso = 54.0
        this.altura = 164.0
    }

    constructor(nombre: String, edad: Int, sexo: Char) {
        this.nombre = nombre
        this.edad = edad
        this.cedula = "2222"
        this.sexo = sexo
        this.peso = 76.0
        this.altura = 172.0
    }

    constructor(nombre: String, edad: Int, sexo: Char, cedula: String, peso: Double, altura: Double) {
        this.nombre = nombre
        this.edad = edad
        this.cedula = cedula
        this.sexo = sexo
        this.peso = peso
        this.altura = altura
    }
    fun toStringP(){
        print("Nombre: ${this.nombre}\n");
        print("Edad: ${this.edad}\n");
        print("Cedula: ${this.cedula}\n");
        print("Sexo: ");
        if(this.sexo != 'H' || this.sexo!= 'M'){
            print("No valido\n");
        }else{
            print("${this.sexo}\n");
        }
        print("Peso: ${this.peso}\n");
        print("Altura: ${this.altura}\n\n");
    }

}