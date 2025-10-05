import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1 (for) Contador simple (for): Ingresa un número N y muestra los números del 1 al N
        System.out.print("Ingresa un numero");
        //sc.nextLine();
        int n1 = sc.nextInt();
        for (int i = 1; i <= n1; i++) {
            System.out.println(i);
        }

        // Ejercicio 2 Cuenta regresiva (for): Ingresa un número N y muestra una cuenta atrás desde N hasta 1.
        System.out.println("Ingresa un numero");
        //sc.nextLine();
        int n2 = sc.nextInt();
        for (int e = n2; e >= 1; e--) {
            System.out.println(e);
        }

        // Ejercicio 3  Tabla de multiplicar (for): Ingresa un número y muestra su tabla de multiplicar del 1 al 10.
        System.out.println("Ingresa numero");
        //sc.nextLine();
        int n3 = sc.nextInt();
        for (int f = 1; f <= 10; f++) {
            System.out.println(n3 + "x" + f + "=" + (n3 * f));
        }

        // Ejercioio 4 Sumatoria (for): Ingresa un número N y calcula la suma de los números del 1 al N.
        System.out.println("Ingresa numero");
        sc.nextLine();
        int n4 = sc.nextInt();
        int suma = 0;
        for (int h = 1; h <= n4; h++) {
            suma = suma + h;
        }
        System.out.println("La suma " + n4 + " es: " + suma);

        // Ejercicio 10  Números impares (for): Ingresa un número N y muestra los impares desde 1 hasta N.
        System.out.println("Ingresa un numero");
        int n5 = sc.nextInt();
        for (int j = 1; j <= n5; j++) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
    }
}
