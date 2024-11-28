package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios {

    public void Ejercicio1() {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();


        int[] numeros;
        int cuantas = random.nextInt(30) + 10;  //para obtener un num random de 10-40


        System.out.println("***BIENVENIDO AL CASINO CANTÁBRICO***");
        System.out.println("-------------------------------------");

        System.out.println(cuantas + " bolas extraídas hasta ahora.");

        int nums[] = new int[cuantas];

        System.out.println(cuantas + " bolas extraídas hasta ahora.");
        for (int i : nums) {
            nums[i] = random.nextInt(89) + 1;  //para sortear los numeros del 1-90

            System.out.print(nums[i] + " ");


        }
        System.out.println();
        System.out.println("**Introduce los datos de tu cartón**");
        int matriz[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {   //creamos una matriz 3x3
            for (int j = 0; j < matriz.length; j++) {

                try {
                System.out.println("Introduce tu carton");
                matriz[i][j] = entrada.nextInt();    // introducimos el carton
                } catch (InputMismatchException er) {
                    System.out.println("ERROR!");
                    return;

                }
                if (matriz[i][j]<1 || matriz[i][j]>90) {
                    System.out.println("ERROR. NUMERO INCORRECTO");
                    return;
                }

            }
        }
        System.out.println("Tu carton es el siguiente: "); // lo enseñamos en pantalla
        for (int i=0; i<matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
