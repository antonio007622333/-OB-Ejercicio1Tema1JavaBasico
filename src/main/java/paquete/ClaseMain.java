package paquete;

public class ClaseMain {
    public static void main(String[] args) {
        /**
         * Ejercicio Sesión 1:
         *
         *     Crear un proyecto java desde cero.
         *     Crear un paquete.
         *     Dentro del paquete crear una clase.
         *     Dentro de la clase crear un método main
         *     Imprimir todos los tipos de datos vistos.
         *     Tipos de datos mas comunes:
         *     int, long, double, boolean, String
         */

        int numeroEntero = 789;
        long numeroLong = 987987987;
        double numeroDouble= 123.322;
        boolean variableBooleana = false;
        String cadenaDeTexto= " Hola me llamo Antonio";

        System.out.println("En el ejercicio se pide mostrar por pantalla las variables:\n" +
                "Integer: "+ numeroEntero + "\nlong: "+ numeroLong + "\ndouble: "+ numeroDouble + "\nboolean: "+ variableBooleana + "\nString: "+ cadenaDeTexto);
    }
}
