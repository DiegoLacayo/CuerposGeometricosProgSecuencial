import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        int Nlados;
        double Haltura, Llados, Pbase, Alateral, Algo, Apotema, Abase, Atotal, Volumen;
        // Donde A = Area, L = Longitud, N = Numero, P = Perimetro. 
        // En los casos: Nlados, Llados, Alateral, Atotal, Abase y Pbase.

        System.out.println("----Calculo de los datos de un Prisma----");
// -------------------------------------------------------------------------------------- //
        System.out.println("Inserte la Cantidad de Lados del Prisma: ");
        Nlados = lector.nextInt();
        System.out.println("Inserte la Longitud de los Lados del Prisma: ");
        Llados = lector.nextDouble();
        System.out.println("Inserte la Altura del Prisma: ");
        Haltura = lector.nextDouble();
        
        Pbase = Llados * Nlados;
        Alateral = Pbase * Haltura;
        Algo = (Math.PI/180) * (360/Nlados);
        Apotema = Llados / (2 * Math.tan((Algo/2)));
        Abase = (Pbase * Apotema)/2;
        Atotal = Alateral + 2 * Abase;
        Volumen = Haltura * Abase;

        System.out.println("--Calculo del Aria Lateral, Area Total y Volumen del Prisma--");
        System.out.println("El Area Lateral del Prisma es de " + Alateral + " unidades cuadradas. ");
        System.out.println("El Area Total del Prisma es de " + Atotal + " unidades cuadradas. ");
        System.out.println("El Volumen del Prisma es de " + Volumen + " unidades cubicas. ");
        lector.close();
    }
}
