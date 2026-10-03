package grupo1;

public class NoListaException extends Exception {

    private String nombre;
    private long cantidadTrabajos;

    public NoListaException(String nombre, long cantidadTrabajos) {
        this.nombre = nombre;
        this.cantidadTrabajos = cantidadTrabajos;
    }

    @Override
    public String getMessage() {
        return "La Cola de Trabajo: " + nombre
                + " no está disponible. Cantidad de trabajos a procesar: "
                + cantidadTrabajos;
    }
}
