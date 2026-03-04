import javax.swing.border.MatteBorder;
import java.util.Scanner;

public class Ejercicios {
    /**
     * Crea un programa que declare constantes locales con tu nombre completo,
     * dirección de casa (solo calle), número del portal, piso, letra del piso, código postal,
     * localidad, provincia y país. Muestra por consola estos datos almacenados en las constantes como si fuera la dirección para enviar una carta
     * ENTRADA/SALIDA
     * Luis González Sanz
     * C/ Maria de Molina nº 51, 1A
     * 91023 Madrid
     * España**/
    public void ejercicio1(){
        String nombreCompleto = "Hader Daniel Franco Gómez";
        String direccion = "Carrer del Capità Antoni Mena, #109, 3 planta";
        String codigoPostal = "03204, ";
        String provincia = "Alicante, ";
        String localidad = "Elche, ";
        String pais = "España";
        System.out.println(nombreCompleto);
        System.out.println(direccion);
        System.out.println(codigoPostal + provincia + localidad);
        System.out.println(pais);

    }

    /*
    * Programa que lee el nombre completo y la edad de una persona, y muestra los datos leídos. (leerNombreEdad)
ENTRADA/SALIDA
ESCRIBE TU NOMBRE COMPLETO: Ana Garrido Alonso
ESCRIBE TU EDAD: 23
Te llamas Ana Garrido Alonso
Tienes 23 años
Pulsa enter para continuar …*/
    public void ejercicio2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();
        System.out.println("¿Cuántos años tienes?: ");
        int edad = scanner.nextInt();
        System.out.println("te llamas " +nombreCompleto);
        System.out.println("Y tienes " + edad);
        System.out.println("Pulsa enter para continuar...");
        scanner.close();


    }

    /*
    * Hágase un programa que lea dos variables enteras y obtenga las siguientes operaciones:
a) Suma
b) Resta
c) Multiplicación
d) División entera
e) Resto
f) División real
g) Resto real
(Operaciones)

ENTRADA/SALIDA
ENTERO: 24
ENTERO: 7*/
    public void ejercicio3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un valor numerico entero para X: ");
        int x = scanner.nextInt();
        System.out.println("Dame un valor númerico entero para Y: ");
        int y = scanner.nextInt();
        int resultado = x+y;
        System.out.println("la suma x+y = "+ resultado);
        resultado = x-y;
        System.out.println("la resta x-y = "+resultado);
        resultado = x*y;
        System.out.println("la multiplicación x*y = "+resultado);
        resultado = x/y;
        System.out.println("la división entera x/y = "+resultado);
        resultado = x%y;
        System.out.println("El resto x%y = "+resultado);
        double divisionDecimal = (double) x / y;
        System.out.println("La división decimal x/y = " + divisionDecimal);
        double restoDecimal = (double) x % y;
        System.out.println("El resto real x%y = " + restoDecimal);
        scanner.close();


    }

    /*
    Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€.
    El camarero les pregunta cuántas bebidas y bocadillos quieren. Calcula el coste de la consumición,
    mostrando primero el coste de las bebidas y de los bocadillos. (Bar)
ENTRADA/SALIDA
Número de bebidas: 3
Número de bocadillos: 5
Coste de las bebidas: 3.75
Coste de los bocadillos: 10.25
Coste consumición: 14.0
     */
    public void ejercicio4(){
        Scanner scanner = new Scanner(System.in);
        double precioBebidas = 1.25;
        double precioBocadillos = 2.05;
        System.out.println("Número de bebidas: ");
        int numeroBebidas = scanner.nextInt();
        System.out.println("Número de bocadillos: ");
        int numeroBocadillos = scanner.nextInt();
        double costeBebidas = precioBebidas*numeroBebidas;
        double costeBocadillos = precioBocadillos*numeroBocadillos;
        double totalConsumicion = costeBocadillos + costeBebidas;
        System.out.println("Coste de las bebidas: " + costeBebidas);
        System.out.println("Coste de los bocadillos: " + costeBocadillos);
        System.out.println("Coste total: " + totalConsumicion);
        scanner.close();


    }
    public void ejercicio5(){
        /*
        Hágase un programa que convierta segundos en horas, minutos y segundos.(Segundos)
*ENTRADA/SALIDA*
Número de segundos: **24973**
Horas: 6
Minutos: 56
Segundos: 13
        */
        Scanner scanner = new Scanner(System.in);
        int eqSegundosMinuto = 60;
        int eqSegundosHora = 3600;
        int eqDias = eqSegundosHora*24;
        System.out.println("Ingrese la cantidad de segundos: ");
        double valorIngresado = scanner.nextInt();
        double horas = valorIngresado / eqSegundosHora;
        double minutos = (horas - (int)horas) * eqSegundosMinuto;
        double segundos = (minutos - (int)minutos) * eqSegundosMinuto;
        double dias = valorIngresado/eqDias;

        System.out.println("Horas: " + (int)horas);
        System.out.println("Minutos: " + (int)minutos);
        System.out.println("Segundos: " + (int)segundos);
        System.out.println("Días: " + dias);
        scanner.close();

    }

    /*
    Permítase introducir el valor con IVA de una compra con dos decimales (la compra no puede ser superior a 500€ ni inferior a 0€)
    y el valor del IVA de dicha compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA?
    ¿Cuánto fue el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra)
    *ENTRADA/SALIDA*
    Valor de la compra (entre 0.00 y 500.00):**298,45**
    IVA (entre 0 y 25%):**12**
    Compra: 266.47
    IVA: 31.98
    ======
    298.45
    */
    public void ejercicio6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el valor de la compra(entre 0.00 y 500.00): ");
        double valorCompra = scanner.nextDouble();
        valorCompra = Math.max(0.00, Math.min(valorCompra,500.00));
        System.out.println("Introduzca el IVA aplicable a esta compra (entre 0 y 25%): ");
        int iva = scanner.nextInt();
        iva = Math.max(0,Math.min(iva, 25));
        double valorIva = valorCompra*((double)iva/100);
        double valorSinIva = valorCompra - valorIva;
        System.out.println("Compra: "+valorSinIva);
        System.out.println("Lo que te robó el estado: " + valorIva);
        System.out.println("Total: " +valorCompra);
        scanner.close();

    }

    /*
    Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100.
    Obténgase la longitud de la circunferencia (2πr) y el área del circulo (πr2) .
    (Circunferencia) NOTA El valor de PI se obtiene con Math.PI
    *ENTRADA/SALIDA*
    Escribe un radio entero: **15**
    Longitud de la circunferencia: 94.24777960769379
    Area de circulo: 706.8583470577034
    */
    public void ejercicio7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un radio entero (entre 0 y 100)");
        int radioCircunferencia = scanner.nextInt();
        radioCircunferencia = Math.max(0, Math.min(radioCircunferencia,100));
        double pi = Math.PI;
        double longitudCircunferencia = 2*pi*radioCircunferencia;
        double areaCircunferencia = pi * radioCircunferencia * radioCircunferencia;
        System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia);
        System.out.println("El area de la circunferencia es: " + areaCircunferencia);
        scanner.close();

    }

    /*
    Hágase una aplicación que permita realizar conversiones de temperaturas entre grados
    centígrados, farenheit y kelvin (los resultados se muestran redondeados a dos
    decimales). (Temperaturas)
    *ENTRADA/SALIDA*
    Grados centigrados: **15,70**
    Farenheit: 60,26 Kelvin: 288,85
    Grados Farenheit: **45,32**
    Centigrados: 7,4 Kelvin: 280,55
    Grados Kelvin: **345,23**
    Centigrados: 72,08 Farenheit: 161,74
     */
    public void ejercicio8(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grados centigrados:");
        double centigrados = scanner.nextDouble();
        double centigradosFarenheit = ((9 * centigrados)/5) + 32;
        double centigradosKelvin = centigrados + 273.15;
        System.out.println("Farenheit: " + String.format("%.2f", centigradosFarenheit));
        System.out.println("Kelvin: " + String.format("%.2f", centigradosKelvin));
        //
        System.out.println("Grados Farenheit: ");
        double farenheit = scanner.nextDouble();
        double farenheitCentigrados = (5 * (farenheit-32)) / 9;
        double farenheitKelvin = ((5 * (farenheit-32)) / 9) + 273.15;
        System.out.println("Centigrados: " + String.format("%.2f", farenheitCentigrados));
        System.out.println("Kelvin: " + String.format("%.2f", farenheitKelvin));
        //
        System.out.println("Kelvin: ");
        double kelvin = scanner.nextDouble();
        double kelvinCentigrados = kelvin - 273.15;
        double kelvinFarenheit = ((9*(kelvin - 273.15))/5) + 32;
        System.out.println("Centigrados: " + String.format("%.2f", kelvinCentigrados));
        System.out.println("Farenheit: " + String.format("%.2f", kelvinFarenheit));
        scanner.close();

    }

    /*
    Hágase una aplicación que permita introducir el número de bebidas y bocadillos comprados (valores entre 0 y 20).
    Además se podrá introducir el precio de cada bebida (valor entre 0.00 € y 3.00 €)
    y de cada bocadillo (valor entre 0.00 € y 5.00 €). También se podrá introducir el número de alumnos que realizaron la compra
    (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las bebidas y de los bocadillos)
    y la cantidad que debe pagar cada alumno redondeada a 2 decimales. (CosteBar)
    *ENTRADA/SALIDA*
    Número de bebidas (entre 0 y 20): **3**
    Número de bocadillos (entre 0 y 20): **5**
    Precio de cada bebida (entre 0,00 y 3,00): **1,20**
    Precio de cada bocadillo (entre 0,00 y 3,00): **2,05**
    Número de alumnos (entre 1 y 10): **5**
     */
    public void ejercicio9(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique las bebidas (entre 0 y 20)");
        int bebidas = scanner.nextInt();
        bebidas = Math.max(0, Math.min(bebidas, 20));
        System.out.println("Indique el precio de las bebidas (entre 0.00 € y 3.00 €)");
        double precioBebidas = scanner.nextDouble();
        precioBebidas = Math.max(0.00, Math.min(precioBebidas, 3.00));

        System.out.println("Indique los bocadillos (entre 0 y 20) ");
        int bocadillos = scanner.nextInt();
        bocadillos = Math.max(0, Math.min(bocadillos, 20));
        System.out.println("Indique el precio de los bocadillos (entre 0.00 € y 5.00 €)");
        double precioBocadillos = scanner.nextDouble();
        precioBocadillos = Math.max(0.00, Math.min(precioBocadillos, 5.00));

        System.out.println("Cantidad de comensales (Entre 0 y 10): ");
        int comensales = scanner.nextInt();
        comensales = Math.max(0, Math.min(comensales, 10));

        double totalBebidas = bebidas * precioBebidas;
        double totalBocadillos = bocadillos * precioBocadillos;
        double total = totalBebidas + totalBocadillos;
        double totalComensal = total/comensales;

        System.out.println("ARTICULO     CANTIDAD  PRECIO  COSTE ");
        System.out.println("============ ======== ======= ======");
        System.out.println("Bebida              " +  bebidas + "    " + String.format("%.2f", precioBebidas) +  "   " + String.format("%.2f", totalBebidas) );
        System.out.println("Bocadillo           " +  bocadillos + "    " + String.format("%.2f", precioBocadillos) +  "  " + String.format("%.2f", totalBocadillos) );
        System.out.println("TOTAL:                         " + String.format("%.2f", total));
        System.out.println("Total por comensal:   " + String.format("%.2f", totalComensal));
        System.out.println("____________________________________");
        scanner.close();

    }
    public void ejercicio10(){
        /*
        Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil, centenas, decenas y unidades),
        y se obtiene el número correspondiente. (Numero)
        *ENTRADA/SALIDA*
        Decenas de mil: **7**
        Unidades de mil: **9**
        Centenas: **0**
        Decenas: **5**
        Unidades: **0**
        Numero introducido: 79050
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número de máximo 5 digitos");
        int numero = scanner.nextInt();
        numero = Math.max(0, Math.min(numero,99999));
        int decenasMil = numero / 10000;
        int unidadesMil = (numero % 10000) / 1000;
        int centenas = (numero % 1000) / 100;
        int decenas = (numero % 100) / 10;
        int unidades = (numero % 10);
        System.out.println("Decenas de mil: " +decenasMil);
        System.out.println("Unidades de mil: " +unidadesMil);
        System.out.println("Centenas: " +centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
        scanner.close();

    }
    public void ejercicio11(){
        /*
        Hágase una aplicación que lea un entero entre 0 y 100. Compruébese (mostrándose verdadero o falso) las siguientes condiciones:
        a) Es par
        b) Es mayor que 50
        (CompararEntero)
        *ENTRADA/SALIDA*
        Escribe un entero entre 0 y 100: **55**
        Par: false
        Mayor que 50: true
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a evaluar (entre 0 y 100)");
        int numero = scanner.nextInt();
        numero = Math.max(0, Math.min(numero, 100));
        boolean boolPar = numero%2 == 0;
        boolean boolMayor = numero > 50;
        System.out.printf("El número %d es par: %b, y es mayor que 50: %b%n", numero, boolPar, boolMayor);
        scanner.close();
    }
    /*
    Hágase una aplicación que lea dos cadenas y las compare del siguiente modo:
    a) Son iguales
    b) La primera es menor que la segunda
    c) Son distintas
    (CompararCadenas)
    *ENTRADA/SALIDA*
    Escribe una palabra: **hola**
    Escribe una palabra: **adios**
    Son iguales: false
    La primera es menor que la segunda: false
    Son distintas: true
     */
    public void ejercicio12(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la primera palabra");
        String palabraUno = scanner.nextLine();
        System.out.println("Escribe la segunda palabra a comparar");
        String palabraDos = scanner.nextLine();
        boolean igual = palabraUno.equals(palabraDos);
        boolean primeraMenor = palabraUno.compareTo(palabraDos)>0;
        boolean distintas = !igual;
        System.out.println("Son iguales: " + igual);
        System.out.println("La primera es menor que la segunda: " + primeraMenor);
        System.out.println("Son distintas: " + distintas);

        scanner.close();
    }
    public void ejercicio13(){
        /*
        Lea dos números entre 0 y 9, ambos inclusive. Compruébese (mostrándose verdadero o falso) las siguientes
        condiciones e indíquese cómo se evalúan:
        a) El primero es par y el segundo impar
        b) El primero es superior al doble del segundo e inferior a 8
        c) Son iguales o la diferencia entre el primero y el segundo es menor que 2
        (CompararEnteros)
        *ENTRADA/SALIDA*
        Escribe un número entre 0 y 9: **4**
        Escribe un número entre 0 y 9: **7**
        El primero es par y el segundo impar: true
        El primero es superior al doble del segundo e inferior a 8: false
        Son iguales o la diferencia entre el primero y el segundo es menor que 2: true
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número entre 0 y 9: ");
        int primerNumero = scanner.nextInt();
        System.out.println("Ingrese el segundo número entre 0 y 9");
        int segundoNumero = scanner.nextInt();
        boolean primeroPar = (primerNumero%2 == 0) && (segundoNumero%2 != 0);
        boolean primeroMayor = (primerNumero > 2 * segundoNumero) && (primerNumero < 8);
        boolean igualDif = (primerNumero == segundoNumero) || (Math.abs(primerNumero - segundoNumero)<2); //La segunda condición compara la diferencia absoluta
        // entre el primer numero y el segundo y confirma si es menor a 2
        System.out.println("El primero es par y el segundo impar: " +primeroPar);
        System.out.println("El primero es superior al doble del segundo y menor a 8: " + primeroMayor);
        System.out.println("Son iguales o la diferencia entre el primero y el segundo es menor que 2: " + igualDif);

        scanner.close();
    }
    public void ejercicio14(){
        /*
        /Hágase una aplicación que permita introducir la edad de una persona (valores enteros entre 0 y 100),
        su nivel de estudios (valores entre 0 y 10) y sus ingresos (valores enteros entre 0 y 25000).
        Compruébese (mostrándose verdadero o falso) si dicha persona tiene más de 40 años, un nivel de estudios entre 5 y 8,
        ambos incluisives, y gana menos de 15000 €. (CondicionLogica)
        *ENTRADA/SALIDA*
        Edad: **23**
        Nivel de estudios: **8**
        Ingresos: **1200**
        Mas de 40 años y estudios entre 5 y 8 y gana menos de 15000: false
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad = scanner.nextInt();
        edad = Math.max(0, Math.min(edad, 100));
        System.out.println("Nivel de estudios entre 0 y 10: ");
        int estudios = scanner.nextInt();
        estudios = Math.max(0, Math.min(estudios, 10));
        System.out.println("Introduzca sus ingresos: ");
        int ingresos = scanner.nextInt();
        ingresos = Math.max(0, Math.min(ingresos,25000));
        boolean primeraCondicion = edad < 40;
        boolean segundaCondicion = (estudios>=5) && (estudios<=8);
        boolean terceraCondicion = ingresos < 15000;
        boolean computoCondicion = primeraCondicion && segundaCondicion && terceraCondicion;
        System.out.println("Edad: " + edad);
        System.out.println("Nivel de estudios: " + estudios);
        System.out.println("Ingresos: " + ingresos);
        System.out.println("Esta persona tiene más de 40 años, estudios entre 5 y 8 y gana menos de 15000€: " + computoCondicion);
        scanner.close();
    }
    public void ejercicio15(){
        /*
        Se lee un entero que se modifica de la siguiente manera:
        a) Incrementar en 5 unidades (+=5).
        b) Decrementar en 3 unidades(-=3).
        c) Multiplicar por 10 (*=10)
        d) Dividir por 2 (/=2)
        e) Mostrar dicho entero en cada uno de los apartados anteriores.
        (AsignarEntero)
        *ENTRADA/SALIDA*
        ENTERO: **21**
        Incrementar 5 unidades: 26
        Decrementar 3 unidades: 23
        Multiplicar por 10:
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero cualquiera: ");
        int numero = scanner.nextInt();
        numero +=5;
        System.out.println("Incrementar 5 unidades: " +numero);
        numero -=3;
        System.out.println("Decrementar 3 unidades: " +numero);
        numero *= 10;
        System.out.println("Multiplicar por 10: " +numero);
        numero /=2;
        System.out.println("Dividir por 2: " + numero);
        scanner.close();
    }
    public void ejercicioT1_1 (){
        /*
        Crea un programa que defina tres variables: nombre, edad y ciudad. Asigna valores a cada una y muestra su contenido en la consola.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Cuál es tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); //Limpia el buffer del salto de linea que queda pendiente

        System.out.println("En qué ciudad vives: ");
        String ciudad = scanner.nextLine();

        System.out.printf("Nombre: %s%nEdad: %d%nCiudad: %s%n", nombre, edad, ciudad); //%s: cadenas de texto, %d: enteros, %n: salto de linea

        scanner.close();
    }
    public void ejercicioT1_2 () {
        /*
        Crea un programa que defina una variable llamada puntuación con valor inicial 0. Luego,
        modifica su valor tres veces y muestra el resultado final./
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int numero = scanner.nextInt();
        numero *= 2;
        System.out.println("Despues de la primera modificación: " +numero);
        numero -= 3;
        System.out.println("Despues de la segunda modificación: " +numero);
        numero -= 7;
        System.out.println("Puntuación final: " +numero);
    }
    public void ejercicioT1_3(){
        /*
        Define cinco variables con diferentes tipos de datos (String, int, boolean, double, char) y muestra tanto su valor como su tipo.
         */
        int entero = 4;
        String texto = "La reputa que te parió";
        boolean bool = false;
        double decimal = 3.14159;
        char caracter = '€';
        System.out.printf("Vamos primero con el entero: %d, seguimos con el string: %s, luego con el booleano: %b, " +
                "vamos con el decimal: %f, y terminamos con el carácter %c", entero, texto, bool, decimal, caracter);

    }
    public void ejercicioT1_4(){
       /*
       Crea un programa que simule la información de un libro usando variables con nombres descriptivos.
       Muestra toda la información del libro en la consola.
        */
        String titulo = "Los reyes malditos";
        String autor = "Maurice Druon";
        int anoPubli = 1955;
        int paginas = 2000;
        boolean disponible = true;
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anoPubli);
        System.out.println("Paginas: " + paginas);
    }
    public void ejercicioT1_5(){
        /*
        Crea un programa que use constantes para almacenar información que no debe cambiar
        (como el valor de PI o el nombre de una aplicación) y variables para información que puede cambiar.
        Muestra todos los valores.
         */
            // Constantes (no cambian)
            final String nombreApp = "MiApp";
            final String version = "1.0.0";
            final double pi = 3.14159;

            // Variables (sí cambian)
            String usuario = "Laura";
            int nivel = 1;
            int puntuacion = 0;

            // Mostrar valores iniciales
            System.out.println("Aplicación: " + nombreApp);
            System.out.println("Versión: " + version);
            System.out.println("Valor de PI: " + pi);
            System.out.println("Usuario actual: " + usuario);
            System.out.println("Nivel: " + nivel);
            System.out.println("Puntuación: " + puntuacion);

            // Actualizar variables
            usuario = "Miguel";
            nivel = 2;
            puntuacion = 150;

            // Mostrar valores actualizados
            System.out.println("Usuario actualizado: " + usuario);
            System.out.println("Nivel actualizado: " + nivel);
            System.out.println("Puntuación actualizada: " + puntuacion);
    }

    public void ejercicioT1_6(){
            /*
            Escribe un programa que declare dos variables numéricas,
            realice las operaciones básicas (suma, resta, multiplicación y división) y muestre los resultados por consola.
             */
            int numero1 = 4;
            int numero2 = 7;
            int suma = numero1 + numero2;
            int resta = numero1 - numero2;
            int multiplicacion = numero1 * numero2;
            double division = (double) numero1 / numero2;
        System.out.println("Primer número: "+numero1);
        System.out.println("Segundo número: "+numero2);
        System.out.println("La suma de los dos números: " +suma);
        System.out.println("La resta de los dos números: " +resta);
        System.out.println("La multiplicación de los dos números: " +multiplicacion);
        System.out.println("La división de los dos números: " +division);

    }
    public void ejercicioT1_7(){
        /*
        Crea un programa que almacene tu información personal (nombre, apellido, edad y ciudad)
         en variables y muestre un mensaje de presentación por consola.
         */
        String nombre = "Hader Daniel";
        String apellido = "Franco Gómez";
        int edad = 27;
        String ciudad = "Elche";
        System.out.printf("¡Hola! Me llamo %s %s. %n Tengo %d y vivo en %s", nombre, apellido, edad, ciudad);
    }
    public void ejercicioT1_8(){
        /*
        Desarrolla un programa que calcule el área de un rectángulo.
        Declara variables para la base y la altura, y muestra el resultado del cálculo.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un lado del rectangulo: ");
        int lado1 = scanner.nextInt();
        System.out.println("Ingrese el otro lado del rectangulo: ");
        int lado2 = scanner.nextInt();
        int area = lado1 * lado2;
        System.out.printf("El lado A = %d, el lado B = %d.%nY el área del rectángulo es: %d4%s%n", lado1, lado2, area, "m²");
        scanner.close();
    }
    public void ejercicioT1_9(){
        /*
        Escribe un programa que almacene la información de un producto
        (nombre, precio, código y disponibilidad) y muestre estos datos formateados por consola.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese el codigo del producto (ABC-123): ");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese si está disponible o no (true o false): ");
        boolean disponibilidad = scanner.nextBoolean();

        System.out.printf("INFORMACIÓN DEL PRODUCTO %n --------------------------");
        System.out.printf("Producto: %s.%n Precio: %f.%n Código: %s.%n Disponible: %b.", producto, precio, codigo, disponibilidad);
        scanner.close();
    }
    public void ejercicioT1_10(){
        /*
        Crea un programa que convierta una temperatura de grados Celsius a Fahrenheit.
        Usa una variable para la temperatura en Celsius y muestra el resultado de la conversión.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        double farenheit = (celsius*((double) 9/5))+32;
        System.out.printf("Grados celsius: %fª%n", celsius);
        System.out.printf("Grados farenheit: %fª", farenheit);
        scanner.close();
    }
}

