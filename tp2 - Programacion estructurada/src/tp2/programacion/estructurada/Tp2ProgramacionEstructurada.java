/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.programacion.estructurada;

/**
 *
 * @author giu
 */
import java.util.Scanner;

public class Tp2ProgramacionEstructurada {

    /**
     * @param precioBase
     * @param impuesto
     * @param descuento
     * @return 
     */
    
    // Método para calcular el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
        return precioFinal;
    }
    
     // Método para calcular el costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        double costo = 0;
        if (zona.equalsIgnoreCase("Nacional")) {
            costo = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costo = peso * 10;
        }
        return costo;
    }

    // Método para calcular el total de la compra usando el costo de envío
    public static double calcularTotalCompra(double precioProducto, double peso, String zona) {
        double costoEnvio = calcularCostoEnvio(peso, zona);
        return precioProducto + costoEnvio;
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
    
    // Variable global 
    static double descuentoGlobal = 0.10;

    // Método para calcular el descuento especial
    public static void calcularDescuentoEspecial(double precio) {
        // Variable local
        double descuentoAplicado = precio * descuentoGlobal;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    // Función recursiva para imprimir los precios
    public static void imprimirPrecios(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            imprimirPrecios(precios, indice + 1); 
        }
    }
    
    public static void main(String[] args) {
/**    
    // 1. Verificación de Año Bisiesto.
        try (Scanner input = new Scanner(System.in)) {
            // Pedir el año al usuario
            System.out.print("Ingrese un año: ");
            int anio = input.nextInt();
            
            // Verificar si es bisiesto
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println("El año " + anio + " es bisiesto.");
            } else {
                System.out.println("El año " + anio + " no es bisiesto.");
            }
        }
        

    // 2. Determinar el Mayor de Tres Números.
        Scanner input = new Scanner(System.in); 

        // Pedir tres números al usuario
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = input.nextInt();

        // Determinar el mayor
        int mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El mayor es: " + mayor);
        input.close();
        


    // 3. Clasificación de Edad.
        Scanner input = new Scanner(System.in);

        // Pedir la edad
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        if (edad < 12) {
            System.out.println("Eres un niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un adulto.");
        } else {
            System.out.println("Eres un adulto mayor.");
        }

        input.close();


    // 4. Calculadora de Descuento según categoría.
    Scanner input = new Scanner(System.in);

        // Pedir precio
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        // Pedir categoría
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = input.next().toUpperCase().charAt(0); 

        double descuento = 0;

        // Calcular el descuento según categoría
        switch (categoria) {
            case 'A':
                descuento = 0.10;
                break;
            case 'B':
                descuento = 0.15;
                break;
            case 'C':
                descuento = 0.20;
                break;
            default:
                System.out.println("Categoría inválida.");
                input.close();
                return; 
        }

        // Calcular precio final
        double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;

        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);

        input.close();



    // 5. Suma de Números Pares (while).
    Scanner input = new Scanner(System.in);

        int numero;
        int sumaPares = 0;

        // Pedir números
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = input.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) { // verificar si es par
                sumaPares += numero;
            }

            System.out.print("Ingrese un número (0 para terminar): ");
            numero = input.nextInt();
        }

        System.out.println("La suma de los números pares es: " + sumaPares);

        input.close();

    
    // 6. Contador de Positivos, Negativos y Ceros (for).
    Scanner input = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Pedir 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = input.nextInt();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Mostrar resultados
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        input.close();


    // 7. Validación de Nota entre 0 y 10 (do-while).
    Scanner input = new Scanner(System.in);
        int nota;

        // Pedir nota
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = input.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente: " + nota);

        input.close();



    // 8. Cálculo del Precio Final con impuesto y descuento.
        Scanner sc = new Scanner(System.in);

        // Pedir los datos al usuario
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = sc.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = sc.nextDouble();

        // Calcular el precio final usando el método
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);
        
        sc.close();


    // 9. Composición de funciones para calcular costo de envío y total de compra.
        Scanner input = new Scanner(System.in); 

        // Solicitar datos al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();

        input.nextLine();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();

        // Calcular costos
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalCompra = calcularTotalCompra(precioProducto, peso, zona);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);

        input.close();


    // 10. Actualización de stock a partir de venta y recepción de productos.
        Scanner input = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();

        // Calcular el nuevo stock
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        input.close();

    
    // 11. Cálculo de descuento especial usando variable global.
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        // Llamar al método
        calcularDescuentoEspecial(precio);

        input.close();
    

    
    // 12. Modificación de un array de precios y visualización de resultados.
        // a. Declarar e inicializar el array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar los valores originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        // c. Modificar el precio de un producto específico (por ejemplo, índice 2)
        precios[2] = 129.99;

        // d. Mostrar los valores modificados
        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }


    
    // 13. Impresión recursiva de arrays antes y después de modificar un elemento.
        // a. Declarar e inicializar un array con precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar precios originales usando función recursiva
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);

        // c. Modificar el precio de un producto específico 
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirPrecios(precios, 0);
*/
    }
    
}
