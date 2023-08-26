import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double Haltura, Perimetro, perimetro, Apotema, Abase1, Abase2, Algo, Atotal, Alateral, Volumen;
        // Donde A = Area.
        // En los casos: Abase1, Abase2, Atotal y Alateral.

        System.out.println("----Calculo de los datos de un Tronco Piramide----");
// --------------------------------------------------------------------------- //
        System.out.println("Ingrese la Altura del tronco cono: ");
        Haltura = lector.nextDouble();
        System.out.println("Ingrese el Perimetro Inferior Mayor del Tronco Piramide: ");
        Perimetro = lector.nextDouble();
        System.out.println("Ingrese el Perimetro Superior Menor del Tronco Piramide: ");
        perimetro = lector.nextDouble();
   
        Algo = Math.pow(Haltura,2) + Math.pow(Perimetro, 2);
        Apotema = Math.sqrt(Algo);
        Abase1 = Math.pow(Perimetro, 2);
        Abase2 = Math.pow(perimetro, 2);
        Alateral = ((Perimetro + perimetro ) / 2) * Apotema;
        Atotal = Alateral + Abase1 + Abase2;
        Volumen = Haltura * (Abase1 + Abase2 + (Math.sqrt(Abase1 * Abase2))) / 3;

        System.out.println("--Calculando AreaTotal, AreaLateral y Volumen del Tronco Piramidee--");
        System.out.println("El Area Lateral del Tronco Piramide es de: " + Alateral + " unidad cuadrada. ");
        System.out.println("El Area Total del Tronco Piramide es de: " + Atotal + " unidad cuadrada. ");      
        System.out.println("El Volumen del Tronco Piramide es de: " + Volumen + " unidad cuadrada. ");
        lector.close();
    }
}