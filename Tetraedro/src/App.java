import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double Arista, Atotal, Alateral, Volumen, Haltura;
        // Donde A = Area.
        // En los casos: Alateral y Atotal

        System.out.println("----Calculo de los datos de un Tetaedro----");
// --------------------------------------------------------------------------- //
        System.out.println("Ingrese el Largo de las Aristas Tetaedro: ");
        Arista = lector.nextDouble();

        Atotal = Math.pow(Arista, 2)* Math.sqrt(3);
        Alateral = (Atotal/4);
        Volumen = (Math.sqrt(2)/12) * Math.pow(Arista, 3);
        Haltura= (Arista) * (Math.sqrt(6)/3);

        System.out.println("--Calculo del Area Lateral, Area Total, Volumen y Altura del Tetaedro--");
        System.out.println("El Area Lateral del Tetaedro es de: " + Alateral + " unidad cuadrada. ");
        System.out.println("El Area Total del Tetaedro es de: " + Atotal + " unidad cuadrada. ");       
        System.out.println("El Volumen del Tetaedrotetaedro es de: " + Volumen + " unidad cubica. ");
        System.out.println("La Altura del Tetaedrotetaedro es de: " + Haltura + " unidad normal. ");
        lector.close();
    }
}
