import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double Radio,Volumen, Area;
        
        System.out.println("----Calculo de los datos de una Esfera----");
// -------------------------------------------------------------------------------------- //
        System.out.println("Inserte el Radio de la esfera: ");
        Radio = lector.nextDouble();
        
        Area = 4 * (Math.PI * Math.pow(Radio,2));
        Volumen = 4/3 * (Math.PI * Math.pow(Radio,3));

        System.out.println("--Calculo del Aria y Volumen de la esfera--");
        System.out.println("El Area Total de la esfera es de " + Area + " unidades cuadradas. ");
        System.out.println("El Volumen de la esfera es de " + Volumen + " unidades cubicas. ");
        lector.close();
    }
}
