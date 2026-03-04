import java.util.Scanner;

public class Ejercicios {
    public void ejercicio1(){
        /*
        Crea un programa que pida un número del 1 al 7
        y use un switch para mostrar el día de la semana correspondiente (1=Lunes, 2=Martes, etc.).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7: ");
        int numero = scanner.nextInt();
        switch (numero) {
            case 1:
                System.out.printf("El día correspondiente al número %d es Lunes", numero);
                break;
            case 2:
                System.out.printf("El día correspondiente al número %d es Martes", numero);
                break;
            case 3:
                System.out.printf("El día correspondiente al número %d es Miércoles", numero);
                break;
            case 4:
                System.out.printf("El día correspondiente al número %d es Jueves", numero);
                break;
            case 5:
                System.out.printf("El día correspondiente al número %d es Viernes", numero);
                break;
            case 6:
                System.out.printf("El día correspondiente al número %d es Sábado", numero);
                break;
            case 7:
                System.out.printf("El día correspondiente al número %d es Domingo", numero);
                break;
        }
        scanner.close();
    }

    public void ejercicio2(){
        /*
        Desarrolla un programa que pida una letra de calificación (A, B, C, D, F)
        y use un switch para mostrar el mensaje correspondiente: A="Excelente", B="Muy bien", C="Bien", D="Suficiente", F="Insuficiente".
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu letra de calificación(A-F):");
        char letraCali = scanner.next().toUpperCase().charAt(0);
        switch (letraCali) {
            case 'A':
                System.out.printf("La letra %c corresponde a excelente", letraCali);
                break;
            case 'B':
                System.out.printf("La letra %c corresponde a muy bien", letraCali);
                break;
            case 'C':
                System.out.printf("La letra %c corresponde a bien", letraCali);
                break;
            case 'D':
                System.out.printf("La letra %c corresponde a suficiente", letraCali);
                break;
            case 'F':
                System.out.printf("La letra %c corresponde insuficiente", letraCali);
                break;
        }
        scanner.close();
    }

    public void ejercicio3(){
        /*
        Escribe un programa que pida dos números y una operación (+, -, *, /).
        Usa un switch para realizar la operación correspondiente y mostrar el resultado.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        double numero1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número: ");
        double numero2 = scanner.nextInt();
        System.out.println("Introduce la operación a realizar(+, -, *, /): ");
        scanner.nextLine();
        char operacion = scanner.next().charAt(0);
        switch (operacion) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
                break;
            case '-':
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 - numero2);
                break;
            case '*':
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 * numero2);
                break;
            case '/':
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 / numero2);
                break;
        }
        scanner.close();
    }

    public void ejercicio4(){
        /*
        Crea un programa que muestre un menú con 4 opciones: 1=Ver perfil, 2=Configuración,
        3=Ayuda, 4=Salir. Pide al usuario que elija una opción y usa un switch para mostrar el mensaje correspondiente a cada opción.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Menú---");
        System.out.println("1. Ver perfil");
        System.out.println("2. Configuración");
        System.out.println("3. Ayuda");
        System.out.println("4. Salir");
        System.out.println("Elige una opción: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado: Ver perfil");
                break;
            case 2:
                System.out.println("Has seleccionado: Configuración");
                break;
            case 3:
                System.out.println("Has seleccionado: Ayuda");
                break;
            case 4:
                System.out.println("Has seleccionado: Salir");
                break;
        }
        scanner.close();
    }

    public void ejercicio5(){
        /*
        Desarrolla un programa que pida un mes (número del 1 al 12)
        y use un switch para determinar la estación del año:
        Invierno (12, 1, 2), Primavera (3, 4, 5), Verano (6, 7, 8), Otoño (9, 10, 11).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número del mes a evaluar: ");
        int mes = scanner.nextInt();
        switch (mes) {
            case 1,2,12:
                System.out.printf("El mes %d corresponde a: Invierno", mes);
                break;
            case 3,4,5:
                System.out.printf("El mes %d corresponde a: Primavera", mes);
                break;
            case 6,7,8:
                System.out.printf("El mes %d corresponde a: Verano", mes);
                break;
            case 9,10,11:
                System.out.printf("El mes %d corresponde a: Otoño", mes);
                break;
        }
        scanner.close();
    }

    public void ejercicio6(){
        /*
        Escribe un programa que pida un número y use un bucle for para mostrar su tabla de multiplicar del 1 al 10.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número del cuál quieres generar la tabla: ");
        int numero = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d * %d = %d.%n", numero, i, numero * i);
        }
        scanner.close();
    }

    public void ejercicio7(){
        /*
        Crea un programa que pida un número N y use un bucle for para calcular la suma de todos los números desde 1 hasta N.
        Muestra el resultado final.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número cualquiera:");
        int numero = scanner.nextInt();
        int suma = 0;
        System.out.print("Sumando: ");
        for (int i = 1; i <= numero; i++) {
            suma += i;
            if (i < numero) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println(); // salto de línea
        System.out.println("La suma de números del 1 al " + numero + " es: " + suma);

        scanner.close();

    }

    public void ejercicio8(){
        /*
        Desarrolla un programa que pida un número N
        y use un bucle for para contar cuántos números pares e impares hay desde 1 hasta N. Muestra ambos contadores.
         */
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero = scanner.nextInt();
        int pares = 0;
        int impares = 0;
        System.out.printf("Recorriendo números del 1 al %d...%n", numero);
        for (int i = 2; i < numero ; i++) {
            if (i % 2 == 0){
                pares +=1;
            } else {
                impares +=1;
            }
        }
        System.out.printf("Números pares encontrados (exceptuando el 1 y %d): %d%n", numero, pares);
        System.out.printf("Números impares encontrados: (exceptuando el 1 y %d): %d%n", numero, impares);

        scanner.close();
    }

    public void ejercicio9(){
        /*
        Escribe un programa que pida un número entero positivo y calcule su factorial usando un bucle for.
        El factorial de N es: N! = N × (N-1) × (N-2) × ... × 1
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un entero positivo...");
        int numero = scanner.nextInt();
        int factorial = 1;
        System.out.println("Calculando " + numero + "!");
        for (int i = numero; i > 0; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
            factorial *= i; // multiplicación, no suma
        }
        System.out.println("\nResultado: " + factorial);

        scanner.close();
    }

    public void ejercicio10(){
        /*
        Crea un programa que muestre un menú con 3 tipos de ejercicios: 1=Flexiones, 2=Abdominales, 3=Sentadillas.
        Pide al usuario que elija un ejercicio y cuántas repeticiones quiere hacer. Usa un switch para determinar
        el ejercicio y un for para contar las repeticiones una a una.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("---EJERCICIOS---");
        System.out.println("1. Flexiones");
        System.out.println("2. Abdominales");
        System.out.println("3. Sentadillas");
        System.out.println("Elige un ejercicio(1-3): ");
        int ejercicio = scanner.nextInt();
        System.out.println("¿Cuántas repeticiones?: ");
        int repeticiones = scanner.nextInt();
        String nombreEjercicio = "";
        switch (ejercicio){
            case 1:
                nombreEjercicio = "flexiones";
                System.out.printf("Has elegido %s.%n", nombreEjercicio);
                break;
            case 2:
                nombreEjercicio = "abdominales";
                System.out.printf("Has elegido %s.%n", nombreEjercicio);
                break;
            case 3:
                nombreEjercicio = "sentadillas";
                System.out.printf("Has elegido %s.%n", nombreEjercicio);
                break;
        }
        for (int i = 1; i<=repeticiones; i++){
            System.out.println("Repetición "+ i + " completada.");
        }
        System.out.printf("¡Ejercicio completado! Has hecho %d %s", repeticiones, nombreEjercicio);
        scanner.close();
    }

}
