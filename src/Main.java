import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1 (for)
        System.out.print("Ingresa un numero");
        //sc.nextLine();
        int n1 = sc.nextInt();
        for (int i = 1; i <= n1; i++) {
            System.out.println(i);
        }

        // Ejercicio 2
        System.out.println("Ingresa un numero");
        //sc.nextLine();
        int n2 = sc.nextInt();
        for (int e = n2; e >= 1; e--) {
            System.out.println(e);
        }

        // Ejercicio 3
        System.out.println("Ingresa numero");
        //sc.nextLine();
        int n3 = sc.nextInt();
        for (int f = 1; f <= 10; f++) {
            System.out.println(n3 + "x" + f + "=" + (n3 * f));
        }

        // Ejercioio 4
        System.out.println("Ingresa numero");
        sc.nextLine();
        int n4 = sc.nextInt();
        int suma = 0;
        for (int h = 1; h <= n4; h++) {
            suma = suma + h;
        }
        System.out.println("La suma " + n4 + " es: " + suma);
    }
}
