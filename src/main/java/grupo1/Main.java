package grupo1;

public class Main {

    public static void main(String[] args) {

        ColaDeTrabajo cola = new ColaDeTrabajo("Cola principal");

        cola.encolar(new TrabajoImpresion("Informe.pdf"));
        cola.encolar(new TrabajoBackup("Base de datos"));

        // CASO 1:
        // Hay trabajos, pero la cola no está lista.

        try {
            Trabajo trabajo = cola.sacar();
            trabajo.ejecutar();

        } catch (NoListaException | SinTrabajoEnColaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------------");

        // Habilitamos la cola.
        cola.setEstado(true);

        // CASO 2:
        // Cola disponible y con trabajos.

        try {
            Trabajo trabajo = cola.sacar();
            trabajo.ejecutar();

            trabajo = cola.sacar();
            trabajo.ejecutar();

        } catch (NoListaException | SinTrabajoEnColaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------------");

        // CASO 3:
        // La cola está disponible,
        // pero ya no quedan trabajos.

        try {
            Trabajo trabajo = cola.sacar();
            trabajo.ejecutar();

        } catch (NoListaException | SinTrabajoEnColaException e) {
            System.out.println(e.getMessage());
        }
    }
}