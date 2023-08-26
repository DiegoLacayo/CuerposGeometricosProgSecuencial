import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double Largo, Ancho, Haltura, Area, Volumen, Diagonal, diagonal;

        System.out.println("----Calculo de los datos de un Ortoedro----");
// --------------------------------------------------------------------------- //
        System.out.println("Ingrese el Largo del Ortoedro: ");
        Largo = lector.nextDouble();
        System.out.println("Ingrese el Ancho del Ortoedro: ");
        Ancho = lector.nextDouble();
        System.out.println("Ingrese el Altura del Ortoedroo: ");
        Haltura = lector.nextDouble();

        Area = 2 * ((Largo * Ancho) + (Largo * Haltura) + (Ancho * Haltura));
        Volumen = Largo * Ancho * Haltura;
        diagonal = Math.pow(Ancho, 2) + Math.pow(Largo, 2) + Math.pow(Haltura, 2);
        Diagonal = Math.sqrt(diagonal);

        System.out.println("--Calculo del Area, Volumen y Diagonal del Ortoedro--");
        System.out.println("El Area del Ortoedro es de: " + Area + " unidad cuadrada. ");
        System.out.println("El Volumen del Ortoedro es de: " + Volumen + " unidad cubica. ");
        System.out.println("La Diagonal del Ortoedro es de: " + Diagonal + " unidad normal. ");
        lector.close();
    }
}
