import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double Arista, Atotal, Alateral, Volumen;
        // Donde A = Area.
        // En los casos: Alateral y Atotal

        System.out.println("----Calculo de los datos de un Icosaedro----");
// --------------------------------------------------------------------------- //
        System.out.println("Ingrese el Largo de las Aristas del Icosaedro: ");
        Arista = lector.nextDouble();

        Atotal = 5 * Math.pow(Arista, 2) * (Math.sqrt(3));
        Alateral = Atotal / 20;
        Volumen = 5 * (3 + Math.sqrt(5)) * Math.pow(Arista, 3) / 12;

        System.out.println("--Calculando AreaTotal, AreaLateral y Volumen del Icosaedro--");
        System.out.println("El Area Lateral del Icosaedro es de: " + Alateral + " unidades cuadradas. ");
        System.out.println("El Area Total del Icosaedro es de: " + Atotal + " unidades cuadradas. ");      
        System.out.println("El Volumen del Icosaedro es de: " + Volumen + " unidades cubicas. ");
        lector.close();
    }
}
