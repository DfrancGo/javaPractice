import java.util.Scanner;

public class EjerciciosSerios {
    public void ejercicio1(){
        /*
        Crea un programa de adivinación de números El programa genera de manera
        aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
        máximo de 7 intentos. Después de cada intento, indica si el número es mayor
        o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
        de intentos utilizado; si no, mostrar un aviso de que debe introducir
        nuevamente un número.
         */
        Scanner scanner = new Scanner(System.in);
        int intentos = 7;
        int numero = (int)(Math.random() *50) + 1;
        int apuesta;
        System.out.println("Vamos a jugar un juego, si adivinas el número entre 0 y 50 hacemos el amor. (tienes 7 intentos)");
        for (int i = 1; i<=7; i++){
            System.out.println("Introduce tu intento de adivinar: ");
            apuesta = scanner.nextInt();
            if (apuesta <numero){
                System.out.println("El número es mayor, vuelve a intentarlo");
            } else if (apuesta>numero) {
                System.out.println("El número es menor, vuelve a intentarlo");
            }else {
                System.out.println("¡Felicidades lo has adivinado! era el número " + apuesta + ". Has acertado al intento " +i);
                break;
            }

            if (i == 7){
                System.out.println("Lo sentimos, te has quedado sin intentos :c");
            }
        }
        scanner.close();
    }
    public void ejercicio2(){
        /*
        Crea una aplicación que simule el funcionamiento del wordle. Para ello realiza
        las siguientes acciones:
        a. Crea una palabra de 5 letras. (funcionará como la palabra a adivinar)
        b. El programa debe seleccionar aleatoriamente una palabra del array y
        almacenarla como la palabra secreta.
        c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.
        d. En cada intento, el usuario introduce una palabra por teclado.
        e. Tras cada intento, el programa debe indicar al usuario:
        i. Aciertos: cuántas letras tiene en la misma posición que la palabra
            secreta.
        ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una
        posición diferente.
        iii. Fallos: cuántas letras no están presentes en la palabra secreta.
        El juego termina cuando el usuario adivina la palabra o se acaban los 5 intentos.
         */
        Scanner scanner = new Scanner(System.in);
        String palabraSistema = "loqui", palabraUsuario;
        int intentos = 5;

        do {
            int numeroAciertos = 0, numeroAprox = 0, numeroFallos = 0;

            System.out.println("Introduce la palabra:");
            palabraUsuario = scanner.nextLine();
            intentos--;

            // Si son iguales, acierto total
            if (palabraSistema.equals(palabraUsuario)) {
                numeroAciertos = palabraSistema.length();
                break;
            } else {
                // Evitar errores si la palabra del usuario es más corta
                int limite = Math.min(palabraSistema.length(), palabraUsuario.length());

                for (int i = 0; i < limite; i++) {
                    char c = palabraUsuario.charAt(i);

                    if (palabraSistema.charAt(i) == c) {
                        numeroAciertos++;
                    } else if (palabraSistema.contains(String.valueOf(c))) {
                        numeroAprox++;
                    } else {
                        numeroFallos++;
                    }
                }
            }

            System.out.println("Aciertos: " + numeroAciertos);
            System.out.println("Aproximaciones: " + numeroAprox);
            System.out.println("Fallos: " + numeroFallos);

        } while (intentos > 0);

        scanner.close();

    }
}
