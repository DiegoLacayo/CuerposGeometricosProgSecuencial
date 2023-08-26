import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        int Angulo;
        double Radio, Volumen, Area;
        
        System.out.println("----Calculo de los datos del Huso Esferico y Cuña Esferica----");
// -------------------------------------------------------------------------------------- //
        System.out.println("Inserte el Radio del huso esferico = cuña esferica: ");
        Radio = lector.nextDouble();
        System.out.println("Inserte el Angulo del huso esferico = cuña esferica: ");
        Angulo = lector.nextInt();

        Area = (4 * Math.PI * Math.pow(Radio,2) * Angulo) / 360;
        Volumen = ((Math.PI * Math.pow(Radio, 3)) * Angulo) / 270;

        System.out.println("--Calculo del Area y Volumen del Huso Esferico y Cuña Esferica--");
        System.out.println("El Area Total del huso esferico es de " + Area + " unidad cuadrada. ");
        System.out.println("El Volumen de la cuña esferica es de " + Volumen + " unidad cubica. ");
        lector.close();
    }
}
