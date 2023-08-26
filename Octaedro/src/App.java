import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double Arista, Atotal, Alateral, Volumen;
        // Donde A = Area.
        // En los casos: Alateral y Atotal

        System.out.println("----Calculo de los datos de un Octaedro----");
// --------------------------------------------------------------------------- //
        System.out.println("Ingrese el Largo de las Aristas del Octaedro: ");
        Arista = lector.nextDouble();

        Atotal = 2 * Math.pow(Arista, 2) * Math.sqrt(3);
        Alateral = Atotal / 8;
        Volumen = (Math.sqrt(2) / 3) * Math.pow(Arista, 3);

        System.out.println("--Calculando AreaTotal, AreaLateral y Volumen del Octaedro--");
        System.out.println("El AreaLateral del octaedro es de: " + Alateral + " unidades cuadradas. ");
        System.out.println("El AreaTotal del octaedro es de: " + Atotal + " unidades cuadradas. ");       
        System.out.println("El Volumen del octaedro es de: " + Volumen + " unidades cubicas. ");
        lector.close();
    }
}
