import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double Arista, Apotema, Raiz, Area, Apentagonal, Volumen;
        // Donde A = Area.
        // En los casos: Apentagonal.

        System.out.println("----Calculo de los datos de un Dodecaedro----");
// --------------------------------------------------------------------------- //
        System.out.println("Ingrese el Largo de las Aristas del Dodecaedro: ");
        Arista = lector.nextDouble();
        System.out.println("Ingrese el Largo del Apotema del dodecaedro: ");
        Apotema = lector.nextDouble();

        Raiz = 25 + (10 * Math.sqrt(5));
        Area = 3 * Math.pow(Arista, 2) * (Math.sqrt(Raiz));
        Apentagonal = 5/2 * Arista * Apotema;
        Volumen = 1/4 + (15 + (7 * Math.sqrt(5))) * Math.pow(Arista, 3);

        System.out.println("--Calculando AreaTotal, AreaLateral y Volumen del Dodecaedro--");
        System.out.println("El Area Pentagonal del dodecaedro es de: " + Apentagonal);
        System.out.println("El Area del dodecaedro es de: " + Area);       
        System.out.println("El Volumen del dodecaedro es de: " + Volumen);
        lector.close();
    }
}
