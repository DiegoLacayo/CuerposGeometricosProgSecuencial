import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double Haltura, Radio, Pbase, Alateral, Atotal, Volumen;
        // Donde P = perimetro y A = Aria. 
        // En los casos: Pbase, Alateral y Atotal.
        
        System.out.println("----Calculo de los datos de un Cilindro----");
// -------------------------------------------------------------------------------------- //
        System.out.println("Inserte el Radio del Cilindro: ");
        Radio = lector.nextDouble();
        System.out.println("Inserte la Altura del Cillindro: ");
        Haltura = lector.nextDouble();
                
        Pbase = 2 * Math.PI * Radio;
        Alateral = Pbase * Haltura;
        Atotal =  Alateral + (2 * (Math.PI * Math.pow(Radio, 2)));
        Volumen = Math.PI * Math.pow(Radio,2) * Haltura;

        System.out.println("--Calculo del Area Lateral, Area Total y Volumen del Cilindro--");
        System.out.println("El Area Lateral del Cilindro es de " + Alateral + " unidades cuadradas. ");
        System.out.println("El Area Total del Cilindro es de " + Atotal + " unidades cuadradas. ");
        System.out.println("El Volumen del Cilindro es de " + Volumen + " unidades cubicas. ");
        lector.close();
    }
}
