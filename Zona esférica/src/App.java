import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double RadioE, radio1, radio2, Volumen, Area, Haltura;
        // Donde E = Esfera.
        // En los casos: RadioE.
        
        System.out.println("----Calculo de los datos de una Zona Esferica----");
// -------------------------------------------------------------------------------------- //
        System.out.println("Inserte el Radio de la Esfera: ");
        RadioE = lector.nextDouble();
        System.out.println("Inserte el Radio Mayor, inferior de la Zona Esferica: ");
        radio1 = lector.nextDouble();
        System.out.println("Inserte el Radio Menor, superior de la Zona Esferica: ");
        radio2 = lector.nextDouble();
        System.out.println("Inserte la Altura de la Zona Esferica: ");
        Haltura = lector.nextDouble();

        Area = 2 * Math.PI * RadioE * Haltura;
        Volumen = Math.PI * Haltura * (Math.pow(Haltura, 2) + (3 * Math.pow(radio1, 2)) + (3 * Math.pow(radio2, 2))) / 6;

        System.out.println("--Calculo del Aria y Volumen de la Zona Esferica--");
        System.out.println("El Area Total de la Zona Esferica es de " + Area + " unidades cuadradas. ");
        System.out.println("El Volumen de la Zona Esferica es de " + Volumen + " unidades cubicas. ");
        lector.close();
    }
}
