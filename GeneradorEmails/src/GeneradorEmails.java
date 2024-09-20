import java.util.Scanner;

public class GeneradorEmails {
    public static void main(String[] args) {
        limpiarPantalla();
        generadorEmail();
    }

    static void generadorEmail(){
        System.out.println("*** Generador Emails ***");
        var consola = new Scanner(System.in);
        System.out.print("Cual es tu nombre: ");
        var nombre = consola.nextLine().toLowerCase();
        System.out.print("Cual es tu apellido: ");
        var apellido = consola.nextLine().toLowerCase();
        var dominio = "dominiodecorreo.com.mx";
        var emailGenerado = nombre + "." + apellido + "@" + dominio;
        System.out.println("Felicidades! Tu email es: " + emailGenerado);
    }

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
