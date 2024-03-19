import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor seleccione una de las opciones válidas: 1, 2 o 3");
        System.out.println("opcion 1: capturar 2 valores, multiplicarlos ,sumarlos y mostrar los resultados de forma indidual");
        System.out.println("opcion 2: solicitar al usuario su nombre y edad; validar si es mayor de edad , " + "si este es mayor de edad, realizar " + "un cobro de el valor $10.000 multiplicados por la edad, mostrar cuanto es el valor cobrado al usuario. sino mostrar un mensaje que diga,usted no genera cobro");
        System.out.println("opcion 3: solicitar al usuario los valores correspondientesa a la base y altura de un triangulo y hallar y mostrar el area del triangulo");


        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(" por favor Ingresa el primer valor: ");
                double valor1 = scanner.nextDouble();
                System.out.println("por favor " +
                        "" +
                        "Ingresa el segundo valor: ");
                double valor2 = scanner.nextDouble();

                double multiplicacion = valor1 * valor2;
                double suma = valor1 + valor2;

                System.out.println("El resultado de la multiplicación es: " + multiplicacion);
                System.out.println("El resultado de la suma es: " + suma);
                break;
            case 2:
                System.out.println("Ingresa tu nombre: ");
                String nombre = scanner.next();
                System.out.println("Ingresa tu edad: ");
                int edad = scanner.nextInt();

                if (edad >= 18) {
                    int valorCobrado = 10000 * edad;
                    System.out.println("señor(a) " + nombre + ", su cobro es: " + valorCobrado);
                } else {
                    System.out.println("señor(a)" + nombre + ", usted no genera cobro.");
                }
                break;
            case 3:
                System.out.println(" ingresar la base del trianguli: ");
                double base = scanner.nextDouble();
                System.out.println("Ingresar la altura del triángulo: ");
                double altura = scanner.nextDouble();

                double area = (base * altura) / 2;

                System.out.println("El área del triángulo es: " + area);
                break;
            default:
                System.out.println("Por favor seleccion una de las  siguientes opciones: 1, 2 o 3");
        }
    }
}

