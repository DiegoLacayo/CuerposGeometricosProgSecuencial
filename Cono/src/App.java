import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double Haltura, Radio, Alateral, Atotal, Volumen, Algo, Generatriz;
        // Donde A = Area.
        // En los casos: Alateral y Atotal.
        
        System.out.println("----Calculo de los datos de un Cono----");
// -------------------------------------------------------------------------------------- //
        System.out.println("Inserte el Radio del Cono: ");
        Radio = lector.nextDouble();
        System.out.println("Inserte la Altura del Cono: ");
        Haltura = lector.nextDouble();
                
        Algo = Math.pow(Haltura,2) + Math.pow(Radio,2);
        Generatriz = Math.sqrt(Algo);
        Alateral = Math.PI * Radio * Generatriz;
        Atotal = Math.PI * Radio * (Generatriz + Radio);
        Volumen = Math.PI * Math.pow(Radio,2) * Haltura / 3;

        System.out.println("--Calculo de Aria Lateral, Area Total y Volumen del Cono--");
        System.out.println("El Area Lateral del Cono es de " + Alateral + " unidades cuadradas. ");
        System.out.println("El Area Total del Cono es de " + Atotal + " unidades cuadradas. ");
        System.out.println("El Volumen del Cono es de " + Volumen + " unidades cubicas. ");
        lector.close();
    }
}
