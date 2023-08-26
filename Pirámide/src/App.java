import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double Haltura, Base, Pbase, Mbase, Alateral, Algo, Apotema, Atotal, Volumen;
        // Donde L = Longitud, P = Perimetro, A = Area y M = Mitad.
        // En los casos: Llados, Pbase, Mbase, Alateral y Atotal.

        System.out.println("----Calculo de los datos de una Piramide----");
// -------------------------------------------------------------------------------------- //
        System.out.println("Inserte la Altura de la Piramide:  ");
        Haltura  = lector.nextDouble();
        System.out.println("Inserte la medida de la Base de la Piramide: ");
        Base = lector.nextDouble();

        Mbase = Base / 2;
        Pbase = Base * 4;
        Algo = Math.pow(Haltura,2) + Math.pow(Mbase,2);
        Apotema = Math.sqrt(Algo);
        Alateral = Pbase *  Apotema / 2;  
        Atotal = Alateral + Math.pow(Base, 2);
        Volumen = Math.pow(Base, 2) * Haltura / 3;

        System.out.println("--Calculo del Areal Lateral, Area Total y el Volumen de la Piramide--");
        System.out.println("El Area Lateral de la Piramide es de " + Alateral + " unidades cuadradas. ");
        System.out.println("El Area Total de la Piramide es de " + Atotal + " unidades cuadradas. ");
        System.out.println("El Volumen de la Piramide es de " + Volumen + " unidades cuadradas. ");
        lector.close();
    }
}
