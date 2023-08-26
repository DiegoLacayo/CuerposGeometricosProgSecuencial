import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double Haltura, Radio, radio, Generatriz, Abase1, Abase2, Algo, Atotal, Alateral, Volumen;
        // Donde A = Area.
        // En los casos: Abase1, Abase2, Atotal y Alateral.

        System.out.println("----Calculo de los datos de un Tronco de Cono----");
// --------------------------------------------------------------------------- //
        System.out.println("Ingrese la Altura del Tronco de Cono: ");
        Haltura = lector.nextDouble();
        System.out.println("Ingrese el Radio Mayor, Inferior del Tronco de Cono: ");
        Radio = lector.nextDouble();
        System.out.println("Ingrese el Radio Menor, Superior del Tronco de Cono: ");
        radio = lector.nextDouble();
   
        Algo = Math.pow(Haltura,2) + Math.pow(Radio,2);
        Generatriz = Math.sqrt(Algo);
        Abase1 = Math.PI * Math.pow(Radio, 2);
        Abase2 = Math.PI * Math.pow(radio, 2);
        Alateral = Math.PI * Generatriz * (Radio + radio);
        Atotal = Alateral + Abase1 + Abase2;
        Volumen = 1 * (Haltura * Math.PI) * (Abase1 + Abase2 + (Math.sqrt(Abase1 * Abase2))) / 3;

        System.out.println("--Calculando AreaTotal, AreaLateral y Volumen del Tronco de Cono--");
        System.out.println("El Area Lateral del Tronco de Cono es de: " + Alateral + " unidad cuadrada. ");
        System.out.println("El Area Total del Tronco de Cono es de: " + Atotal + " unidad cuadrada. ");      
        System.out.println("El Volumen del Tronco de Cono es de: " + Volumen + " unidad cubica. ");
        lector.close();
    }
}