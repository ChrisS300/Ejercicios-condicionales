public class Condicional_Switch_Ejercicio {
    public static void main(String[] args) {
        // Creación de la variable.
        String Estación = "Primavera";

        // Creación del interuptor de validación.
        switch (Estación ) {
            // verificación de la estación Verano.
            case "Verano":

                System.out.println("Es Verano");
                break;
            // verificación de la estación Invierno.

            case "Invierno":
                System.out.println("Es Invierno");
                break;
            // verificación de la estación Otoño.

            case "Otoño":
                System.out.println("Es Otoño");
                break;
            // verificación de la estación primavera.

            case "Primavera":
                System.out.println("Es Primavera");
                break;
              // Creación del metodo default si ninguna de las condiciones anteriores se cumple.
            default:
                System.out.println("la variable no es una estación");

        }
    }
}

