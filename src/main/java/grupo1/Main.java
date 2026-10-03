package grupo1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ColaDeTrabajo cola = new ColaDeTrabajo("Cola principal");

        cola.encolar(new TrabajoImpresion("Informe.pdf"));
        cola.encolar(new TrabajoBackup("Base de datos"));

        // CASO 1
        System.out.println("CASO 1 - Cola no disponible");
        System.out.println("Presione ENTER para ejecutar...");
        scanner.nextLine();

        try {
            Trabajo trabajo = cola.sacar();
            trabajo.ejecutar();

        } catch (NoListaException | SinTrabajoEnColaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--------------------\n");

        // CASO 2
        cola.setEstado(true);

        System.out.println("CASO 2 - Cola disponible y con trabajos");
        System.out.println("Presione ENTER para ejecutar...");
        scanner.nextLine();

        try {
            Trabajo trabajo = cola.sacar();
            trabajo.ejecutar();

            trabajo = cola.sacar();
            trabajo.ejecutar();

        } catch (NoListaException | SinTrabajoEnColaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--------------------\n");

        // CASO 3
        System.out.println("CASO 3 - Cola disponible pero vacía");
        System.out.println("Presione ENTER para ejecutar...");
        scanner.nextLine();

        try {
            Trabajo trabajo = cola.sacar();
            trabajo.ejecutar();

        } catch (NoListaException | SinTrabajoEnColaException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}