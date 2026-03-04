import java.util.Scanner;

public class Ejercicios {

    public void ejercicio1(){
        /*
        Crea un programa que pida al usuario dos números enteros por consola y muestre el resultado de las cinco
        operaciones aritméticas básicas: suma, resta, multiplicación, división y módulo (resto).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese otro número: ");
        int numero2 = scanner.nextInt();
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = (double) numero1 / numero2;
        int resto = numero1 % numero2;
        System.out.printf("X = %d.%n Y = %d.%n X+Y = %d.%n X-Y = %d.%n X*Y = %d.%n X/Y = %f.%n Resto X, Y = %d.%n",
                numero1, numero2, suma, resta, multiplicacion, division, resto);

        scanner.close();

    }
    public void ejercicio2() {
        /*
        Escribe un programa que pida dos números al usuario y muestre el resultado de todas las comparaciones
        relacionales entre ellos (mayor que, menor que, igual, diferente, mayor o igual, menor o igual).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número(entero): ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingresa otro número(entero): ");
        int numero2 = scanner.nextInt();
        boolean mayor = numero1 > numero2;
        boolean menor = numero1 < numero2;
        boolean igual = numero1 == numero2;
        boolean diferente = numero1 != numero2;
        boolean mayorIgual = numero1 >= numero2;
        boolean menorIgual = numero1 <= numero2;
        System.out.printf("X = %d.%nY = %d.%nX > Y = %b.%nX < Y = %b.%nX = Y = %b.%nX != Y = %b.%nX >= Y = %b.%nX <= Y = %b.%n",
                numero1, numero2, mayor, menor, igual, diferente, mayorIgual, menorIgual);
        scanner.close();
    }
    public void ejercicio3(){
     /*
     Crea un programa que declare una variable con valor inicial 100 y aplique diferentes operadores de asignación compuesta
     (+=, -=, *=, /=). Muestra el valor de la variable después de cada operación.
      */
        int numero = 100;
        System.out.printf("Valor inicial: %d.%n", numero);
        numero += 50;
        System.out.printf("Después de sumar 50: %d.%n", numero);
        numero -= 30;
        System.out.printf("Después de restar 30: %d.%n", numero);
        numero *= 5;
        System.out.printf("Después de multiplicar por 5: %d.%n", numero);
        numero /= 3;
        System.out.printf("Después de dividir entre 3: %d.%n", numero);
    }
    public void ejercicio4(){
        /*
        Desarrolla un programa que pida un número al usuario y determine si es par o impar usando el operador módulo.
         Muestra el resultado por consola.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número(entero):");
        int numero = scanner.nextInt();
        if (numero%2 == 0){
            System.out.printf("El número %d es par", numero);
        }
        else {
            System.out.printf("El número %d es impar", numero);
        }
        scanner.close();
    }

    public void ejercicio5(){
        /*
        Crea un programa que pida la edad del usuario y si tiene carnet de conducir (true/false).
        Usa operadores lógicos para determinar si puede alquilar un coche (debe tener 21 años o más Y tener carnet).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuál es tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Tienes carnet de conducir (true o false)");
        boolean carnet = scanner.nextBoolean();
        boolean condicionEdad = edad >= 21;
        boolean aptitud = condicionEdad && carnet;
        System.out.printf("¿Eres mayor de 21 años? %b.%n¿Tienes carnet de coche?: %b.%n¿Puedes alquilar un coche?: %b.", condicionEdad, carnet, aptitud);

        scanner.close();
    }

    public void ejercicio6(){
        /*
        Escribe un programa que pida el precio de un producto y el porcentaje de descuento.
        Calcula el precio final después del descuento usando operadores aritméticos y muestra todos los pasos del cálculo.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto: ");
        float precio = scanner.nextFloat();
        System.out.println("Ingresa el porcentaje de descuento: ");
        int porcentajeDescuento = scanner.nextInt();
        float descuento = precio * porcentajeDescuento / 100f; //la f del final de 100 es para que trate a 100 como float
        float precioFinal = precio - descuento;
        System.out.println("Precio original: " + precio + "€");
        System.out.println("Descuento (" + porcentajeDescuento + "%): " + descuento + "€");
        System.out.println("Precio final: " + precioFinal + "€");
        scanner.close();
    }

    public void ejercicio7(){
        /*
        Crea un programa que pida al usuario su edad y si es estudiante (true/false). Usa operadores lógicos (AND, OR, NOT)
        para determinar si puede acceder a diferentes descuentos: descuento joven (menor de 26 años), descuento estudiante,
        o descuento especial (menor de 26 Y estudiante).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Eres estudiante (true/false): ");
        boolean estudiante = scanner.nextBoolean();
        boolean descuentoJoven = edad < 26;
        boolean descuentoEspecial = estudiante && descuentoJoven;
        System.out.println("¿No eres estudiante? : " + !estudiante);
        System.out.println("¿Tienes descuento joven?: " + descuentoJoven);
        System.out.println("¿Tienes descuento estudiante?: " + estudiante);
        System.out.println("¿Tienes descuento especial?: " + descuentoEspecial);
        scanner.close();
    }

    public void ejercicio8(){
        /*
        Desarrolla un programa que pida tres números al usuario y calcule: la suma de los tres, el promedio,
        el resultado de multiplicar el primero por el segundo y dividirlo entre el tercero. Usa paréntesis para controlar la precedencia de operadores.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número (entero): ");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce otro número (entero): ");
        int numero2 = scanner.nextInt();
        System.out.println("Introduce otro número (entero): ");
        int numero3 = scanner.nextInt();
        int suma = numero1 + numero2 + numero3;
        float promedio = suma / 3f;
        float operacion = (numero1 * numero2) / (float)numero3;
        System.out.printf("La suma de los números es: %d.%nEl promedio de los números es: %f.%n(%d * %d) / %d = %f", suma,
                promedio, numero1, numero2, numero3, operacion);
        scanner.close();
    }

    public void ejercicio9(){
        /*
        Escribe un programa que pida al usuario la puntuación de tres exámenes. Calcula la nota media
        y usa operadores relacionales para determinar si ha aprobado (>=5), si tiene notable (>=7), y si tiene sobresaliente (>=9). Muestra todos los resultados.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingresa la puntuación de los tres exámenes:%nExámen 1: ");
        float examen1 = scanner.nextFloat();
        System.out.println("Exámen 2: ");
        float examen2 = scanner.nextFloat();
        System.out.println("Exámen 3: ");
        float examen3 = scanner.nextFloat();
        float notaMedia = (examen1 + examen2 + examen3)/3;
        boolean aprueba = notaMedia >= 5;
        boolean notable = notaMedia >= 7;
        boolean sobresaliente = notaMedia >= 9;
        System.out.println("Nota media: " + notaMedia);
        System.out.printf("¿Ha aprobado?: %b.%n¿Tiene notable?: %b.%n¿Tiene sobresaliente?: %b.", aprueba, notable, sobresaliente);
        scanner.close();
    }

    public void ejercicio10(){
        /*
        Crea un programa que pida el salario base por hora, las horas trabajadas y si ha hecho horas extra (true/false). Si ha hecho horas extra
        y trabajó más de 40 horas, las horas que excedan de 40 se pagan al doble. Usa operadores lógicos, relacionales y aritméticos para calcular el salario total.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu salario base por hora: ");
        float salarioBase = scanner.nextFloat();
        System.out.println("Ingresa las horas trabajadas en la semana: ");
        float horasTrabajadas = scanner.nextFloat();
        System.out.println("¿Has hecho horas extra?(True/false): ");
        boolean condicion = scanner.nextBoolean();
        float salarioBaseSemanal = salarioBase * 40;
        float horasExtra = horasTrabajadas - 40;
        float salarioExtra = horasExtra * 2 * salarioBase;
        float salarioTotal = salarioExtra + salarioBaseSemanal;
        System.out.printf("Trabajaste más de 40 horas: %b.%n", condicion);
        System.out.printf("Salario base semanal: %f.%n", salarioBaseSemanal);
        System.out.printf("Remuneración por horas extra: %f.%n", salarioExtra);
        System.out.printf("Salario total a percibir: %f.%n", salarioTotal);
        scanner.close();
    }
}
