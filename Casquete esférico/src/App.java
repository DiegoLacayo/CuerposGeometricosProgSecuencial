import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double Radio, Volumen, Area, Haltura;
        
        System.out.println("----Calculo de los datos del Casquete Esferico----");
// -------------------------------------------------------------------------------------- //
        System.out.println("Inserte el Radio del Casquete Esferico: ");
        Radio = lector.nextDouble();
        System.out.println("Inserte la Altura del Casquete Esferico: ");
        Haltura = lector.nextDouble();

        Area = 2 * Math.PI * Radio * Haltura;
        Volumen = Math.PI * Math.pow(Haltura, 2) * ((3 * Radio) - Haltura) / 3;

        System.out.println("--Calculo del Aria y Volumen del Casquete Esferico--");
        System.out.println("El Area Total del Casquete Esferico es de " + Area + " unidades cuadradas. ");
        System.out.println("El Volumen del Casquete Esferico es de " + Volumen + " unidades cubicas. ");
        lector.close();
    }
}
