public class Contador {
    public static void main(String[] args) {
        // Imprimir del 1 al 5
//        var contador = 1;
//        final var VALOR_MAXIMO = 5;
//        do{
//            System.out.println("Valor: " + contador++);
//        } while(contador <= VALOR_MAXIMO);

        final var VALOR_MAXIMO = 5;
        for(var contador = 1; contador <= VALOR_MAXIMO; contador++){
            System.out.println(contador);
        }
    }
}
