package com.company;

public class Main {
    public static int calcularAreaTriangulo (int base, int altura){
        // El area de un triangulo es base por altura entre dos
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        System.out.println("El area del triangulo es: " + calcularAreaTriangulo(10,15));
    }
}
