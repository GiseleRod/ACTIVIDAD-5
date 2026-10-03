
package staticFinal;
import java.util.Scanner;
public class Actividad {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio del circulo: ");
        double radio = scanner.nextDouble();
        
        Circulo circulo = new Circulo();
        circulo.setRadio(radio);

        System.out.println("area del circulo: " + circulo.calcularArea());
        System.out.println("Longitud del circulo: " + circulo.CalcularLongitud());

        scanner.close();
    }
  }

