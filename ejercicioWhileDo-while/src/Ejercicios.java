import java.awt.*;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Ejercicios {
    public void ejercicio1() {
        /*
        Crea un programa que pida un número N y use un bucle while para contar desde 1 hasta N, mostrando cada número.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número cualquiera: ");
        int numero = scanner.nextInt();
        int conteo = 1;
        System.out.println("Contando con while:");
        while (conteo<=numero){
            System.out.println(conteo++);
        }
        System.out.println("Fin del conteo");
        scanner.close();
    }
    public void ejercicio2() {
        /*
        Desarrolla un programa que pida al usuario una contraseña.
        La contraseña correcta es "1234". Usa un bucle do-while para seguir pidiendo la contraseña hasta que el usuario la introduzca correctamente.
         */
        Scanner scanner = new Scanner(System.in);
        String password;
        String greenPass = "1234";
        do {
            System.out.println("Introduce la contraseña:");
            password = scanner.nextLine();
            if (!password.equals(greenPass)){
                System.out.println("Contraseña incorrecta, vuelve a intentarlo");
            }
        } while ( !password.equals(greenPass));
        System.out.println("Bienvenido de nuevo user");
        scanner.close();
    }
    public void ejercicio3() {
        /*
        Escribe un programa que pida números al usuario y los vaya sumando. El bucle while debe continuar
        mientras el usuario introduzca números positivos. Cuando introduzca un número negativo o cero, el programa debe terminar y mostrar la suma total.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número (0 o negativo para salir)");
        int numero = scanner.nextInt();
        int total = 0;
        while (numero>0){
            total += numero;
            System.out.println("Suma actual: " + total);
            System.out.println("Introduce un número (0 o negativo para salir)");
            numero = scanner.nextInt();
        }
        System.out.println("Programa terminado, suma total: " + total);
        scanner.close();
    }
    public void ejercicio4() {
        /*
        Crea un juego donde el programa elige un número secreto entre 1 y 10 (por ejemplo, 7). Usa un bucle do-while para
        pedir al usuario que adivine el número. El programa debe indicar si el número es mayor o menor, y continuar hasta que el usuario acierte.
         */
        Scanner scanner = new Scanner(System.in);
        int aleatorio = (int) (Math.random() *11);
        System.out.println("¡Intenta adivinar el número entre 0 y 10!");
        System.out.println("Ingresa tu intento: ");
        int intento = 0;
        do {
            intento = scanner.nextInt();
            if (aleatorio > intento){
                System.out.println("El número es mayor, vuelve a intentarlo: ");
            } else if (aleatorio < intento) {
                System.out.println("El número es menor, vuelve a intentarlo: ");
            }
        } while (intento != aleatorio);
        System.out.println("Correcto, has acertado con el número " + intento);
        scanner.close();
    }
    public void ejercicio5() {
        /*
        Desarrolla un programa con un menú que se repita usando do-while. El menú debe tener 4 opciones:
        1=Saludar, 2=Despedirse, 3=Ver hora actual (puedes mostrar un mensaje fijo), 4=Salir. Usa switch para procesar cada opción.
        El programa solo debe terminar cuando el usuario elija la opción 4.caja caj
         */
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        LocalTime hora = LocalTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss"); // para configurar el formato de la hora.
        do {
            System.out.println("----MENÚ----");
            System.out.println("1.Saludar");
            System.out.println("2.Despedirse");
            System.out.println("3.Ver hora");
            System.out.println("4.Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1 -> {
                    System.out.println("¡Hola mamasita!");
                }
                case 2 -> {
                    System.out.println("¡Adiós, que te vaya bonito!" );
                }
                case 3 -> {
                    System.out.println(hora.format(formato));
                }
                case 4 -> {
                    break;
                }
                default -> {
                    System.out.println("Ingresa un valor valido");
                }
            }
            System.out.println(); //Para dar un salto de linea en cada ejecución del menú.
        } while (opcion != 4);
        System.out.println("¡Hasta luego!");
        scanner.close();
    }
    public void ejercicio6() {
        /*
        Escribe un programa que pida un número N y use un bucle while para hacer
        una cuenta atrás desde N hasta 1, mostrando cada número. Al llegar a 1, debe mostrar "¡Despegue!".
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        while (numero > 0){
            System.out.println(numero);
            numero --;
        }
        System.out.println("¡DESPEGUE!");
        scanner.close();
    }
    public void ejercicio7() {
        /*
        Crea un programa que pida al usuario cuántas calificaciones va a introducir. Luego,
        usa un bucle while para pedir cada calificación una por una, sumarlas y al final calcular y mostrar el promedio.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas calificaciones vas a ingresar?: ");
        int cantidad = scanner.nextInt();
        int conteo = 1;
        double nota = 0;
        double total = 0;
        while (conteo <= cantidad) {
            System.out.printf("Introduce la calificacion %d:", conteo++, "%n");
            nota = scanner.nextDouble();
            total+=nota;
        }
        System.out.println("Suma total de las calificaciones: " +total);
        System.out.println("Promedio de las calificaciones: " + total/cantidad);
        scanner.close();
    }
    public void ejercicio8() {
        /*
        Desarrolla un programa que pida la edad del usuario. Usa un bucle do-while para validar que
        la edad introducida esté entre 0 y 120. Si no es válida, debe volver a pedirla. Una vez válida, muestra un mensaje de confirmación.
         */
        Scanner scanner = new Scanner(System.in);
        int edad = 0;
        do {
            System.out.println("Introduce tu edad: ");
            edad = scanner.nextInt();
            if (edad <0 || edad > 120){
                System.out.println("Edad no valida, debe tener valores entre 0 y 120.");
                System.out.println("Introduce tu edad: ");
                edad = scanner.nextInt();
            }
        } while ((edad < 0) || (edad > 120));
        System.out.println("Edad valida, " + edad + " años. ¡Gracias!");
        scanner.close();
    }
    public void ejercicio9() {
        /*
        Crea un programa que pida al usuario cuántos estudiantes hay en una clase. Para cada estudiante, usa un bucle while para
        pedir su calificación numérica (0-10). Luego, usa un bucle for para mostrar todas las calificaciones y usa un switch para
        convertir cada nota numérica en letra: 9-10=A, 7-8=B, 5-6=C, 3-4=D, 0-2=F.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuántos estudiantes hay: ");
        int estudiantes = scanner.nextInt();
        double[] notas = new double[estudiantes]; //Se crean tantas posiciones del array como estudiantes hayan
        char[] equivalentes = new char[estudiantes]; //Lo mismo de arriba

        for (int i = 0; i < estudiantes; i++) {
            System.out.printf("Introduce la nota del estudiante %d (0-10): ", i + 1);
            double nota = scanner.nextDouble();
            notas[i] = nota; //Cada nota ingresada se guarda en uno de los valores del array
            switch ((int) nota) {
                case 0,1,2 -> equivalentes[i] = 'F';
                case 3,4 -> equivalentes[i] = 'D';
                case 5,6 -> equivalentes[i] = 'C';
                case 7,8 -> equivalentes[i] = 'B';
                case 9,10 -> equivalentes[i] = 'A';
                default -> equivalentes[i] = '?';
                    }
                }
                // REPORTE FINAL
        System.out.println("\n--- REPORTE DE CALIFICACIONES ---");
        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + notas[i] + " puntos = Calificación " + equivalentes[i]);
        }
    }
    public void ejercicio10() {
        /*
        Desarrolla un programa que simule un cajero automático. El saldo inicial es 1000€. Usa un bucle do-while para mostrar
        un menú con opciones: 1=Consultar saldo, 2=Retirar dinero, 3=Depositar dinero, 4=Salir. Usa switch para cada opción.
        Para retirar dinero, usa un bucle while para validar que no se retire más del saldo disponible (si intenta retirar más,
        debe volver a pedir la cantidad). Para depositar, valida que sea una cantidad positiva.
         */
        Scanner scanner = new Scanner(System.in);
        int saldo = 1000;
        System.out.println("---CAJERO AUTOMATICO---");
        System.out.printf("Saldo inicial: %d€.%n", saldo);
        int opcion;
        do {
            System.out.println("---MENU---");
            System.out.println("1. Consultar saldo.");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.println();
            System.out.println("Elige una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1 -> {
                    System.out.printf("Tu saldo es: %d€.%n", saldo);
                }
                case 2 -> {
                    System.out.println("Cuánto dinero deseas retirar: ");
                    int retiro = scanner.nextInt();
                    while (retiro>saldo){
                        System.out.println("Fondos insuficientes. Tu saldo es: " +saldo);
                        System.out.println("Cuánto dinero deseas retirar: ");
                        retiro = scanner.nextInt();
                    }
                    saldo = saldo-retiro;
                    System.out.printf("Retiro exitoso, has retirado: %d€.%n", retiro);
                    System.out.printf("Nuevo saldo: %d€.%n", saldo);
                }
                case 3 -> {
                    System.out.println("¿Cuánto deseas depositar?");
                    int deposito = scanner.nextInt();
                    if (deposito>0){
                        saldo = saldo + deposito;
                        System.out.printf("Deposito exitoso. Has depositado: %d€.%n", deposito);
                        System.out.printf("Nuevo saldo: %d€.%n", saldo);
                    } else {
                        System.out.println("Mamagüevo que es que tú me crees tonto o qué coño e' tu madre");
                    }
                }
                case 4 -> {
                    break;
                }
                default -> {
                    System.out.println("Ingresa una opción valida mamagüevo chistosito");
                }
            }
        } while (opcion!=4);
        System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
        scanner.close();
    }
    public void ejercicioString(){
        /*
        Pedir por consola una frase y luego decir:
        1. Cuantas frases tiene
        2. Cuantas letras tiene
        3. Cuantas palabras tiene.
        4. Cuantas letras tiene (sin contar simbolos, espacios).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la frase que quieres analizar: " );
        String frase = scanner.nextLine();
        System.out.println("La frase es: " +frase);
        String [] numeroOraciones = frase.split("\\."); //Se pone el \\. porque el . es un caracter reservado
        String frasePalabras = frase.replaceAll(" ", "").replaceAll(",", "").replaceAll("\\.", "");
        String palabrasFrase = frase.replaceAll(",", " ").replaceAll("\\.", " ");
        String [] palabras = palabrasFrase.split(" ");
        System.out.println("El número de oraciones son: " + numeroOraciones.length);
        System.out.println("La cantidad de letras que tiene: " + frasePalabras.length());
        System.out.println("El número de palabras que tiene: " + palabras.length);
        for(String item : numeroOraciones) {
            int contador = item.split(" ").length;
            System.out.println("El número de palabras de la oración es: " + contador);
        }
        scanner.close();
    }
}
