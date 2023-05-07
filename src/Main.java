import javax.swing.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Uso de condicionales!");
        int i = 3;
        if (i < 0) {
            System.out.println("El numero es negativo");
        } else if (i > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es 0");
        }

        System.out.println(" ");
        System.out.println("Ciclo while ");
        int NumeroWhile = 0;
        while (NumeroWhile <= 3) {
            System.out.println("Contador: " + NumeroWhile);
            NumeroWhile++;
        }

        System.out.println(" ");
        System.out.println("Ciclo  do while ");
        int la = 0;
        do {
            if (la < 3) {
                System.out.print(la + ", ");
            } else {
                System.out.print(la + ".");
            }
            la++;
        } while (la <= 3);
        System.out.println(" ");
        System.out.println("Ciclo  for ");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            if (numeroFor < 3) {
                System.out.print(numeroFor + ", ");
            } else {
                System.out.print(numeroFor + ".");
            }
        }
        System.out.println(" ");
        System.out.println("Uso del Switch ");
        var estacion = "Primavera";
        switch (estacion) {
            case "Verano":
                System.out.println("Verano");
                break;
            case "Otoño":
                System.out.println("Otoño");
                break;
            case "Invierno":
                System.out.println("Invierno");
                break;
            case "Primavera":
                System.out.println("Primavera");
                break;
            default:
            System.out.println("estoy en default");
        }
    }
}

