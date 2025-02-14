package Ejercicios;

import java.util.Scanner;

public class E6_1_Main2 {
    static E6_2_Coche coche = new E6_2_Coche();

    public static void main(String[] args) {
        int opcion = 0;
        do {
            imprimirMenu();
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    f1(sc);
                    break;
                case 2:
                    f2(sc);
                    break;
                case 3:
                    f3(sc);
                    break;
                case 4:
                    System.out.println("Ha elegido Salir.");
                    break;
                default:
                    System.out.println("Debes poner un número del 1 al 4.");
            }
        } while (opcion != 4);
    }

    private static void f1(Scanner sc) {        /*1.- Ver velocidad actual*/
        System.out.print("Velocidad actual: " + coche.getVelocidad());
    }

    private static void f2(Scanner sc) {        /*2.- Acelerar*/
        System.out.print("Estamos acelerando.");
        coche.acelera(5);
    }

    private static void f3(Scanner sc) {
        /*2.- Frenar*/
        System.out.print("Estamos frenando.");
        coche.frena(2);
    }


    static void imprimirMenu() {
        System.out.println("Menú de coches:");
        System.out.println("1.- Velocidad actual.");
        System.out.println("2.- Acelerar.");
        System.out.println("3.- Frenar.");
        System.out.println("4.- Salir.");
        System.out.print("¿Qué quieres hacer? ");
    }
}


































