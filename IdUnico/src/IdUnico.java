import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class IdUnico {
    public static void main(String[] args) {
        limpiarPantalla();  // Limpia la pantalla al inicio
        generadorIdUnico();
    }

    static void generadorIdUnico(){
        System.out.println("*** Generador ID Unico ***");
        var consola = new Scanner(System.in);
        System.out.print("Cual es tu nombre: ");
        var nombre = consola.nextLine().substring(0,2).toUpperCase();
        System.out.print("Cual es tu apellido: ");
        var apellido = consola.nextLine().substring(0,2).toUpperCase();
        System.out.print("Cual es tu año de nacimiento (YYYY): ");
        var anio = consola.nextLine().substring(2,4);
        var aleatorio = new Random().nextInt(9999);
        var valorAleatorio = new DecimalFormat("0000").format(aleatorio);
        var idUnico = nombre + apellido + anio + valorAleatorio;
        System.out.println("Felicidades! tu nuevo numero de ID Unico es: " + idUnico);
    }

    // Método para limpiar la pantalla
    static void limpiarPantalla() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // En Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // En Linux/macOS
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
