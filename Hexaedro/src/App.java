import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double Arista, Atotal, Alateral, Volumen, Diametro;
        // No se realmente que siginifica "D", pero tiene formula asi que igual lo calcule y lo llame Diametro. 
        // Donde A = Area.
        // En los casos: Alateral y Atotal
        
        System.out.println("----Calculo de los datos de un Hexaedro----");
// --------------------------------------------------------------------------- //
        System.out.println("Ingrese el Largo de las Aristas del Hexaedro: ");
        Arista = lector.nextDouble();

        Alateral = Math.pow(Arista, 2);
        Atotal = 6 * Math.pow(Arista, 2);
        Volumen = Math.pow(Arista, 3);
        Diametro = Arista * Math.sqrt(3);

        System.out.println("--Calculo del AreaTotal, AreaLateral, Volumen y Diametro del Hexaedro--");
        System.out.println("El AreaLateral del Hexaedro es de: " + Alateral + " unidad cuadrada. ");
        System.out.println("El AreaTotal del Hexaedro es de: " + Atotal + " unidad cuadrada. ");       
        System.out.println("El Volumen del Hexaedro es de: " + Volumen + " unidad cubica. ");
        System.out.println("El Diametro del Hexaedro es de : " + Diametro + " unidad normal. ");
        lector.close();
    }
}
