package grupo1;

import java.util.LinkedList;
import java.util.Queue;

public class ColaDeTrabajo {

    private final String nombre;
    private boolean estado;
    private final Queue<Trabajo> trabajos;

    public ColaDeTrabajo(String nombre) {
        this.nombre = nombre;
        this.estado = false;
        this.trabajos = new LinkedList<>();
    }

    public void encolar(Trabajo trabajo) {
        trabajos.offer(trabajo);
    }

    public Trabajo sacar()
            throws NoListaException, SinTrabajoEnColaException {

        if (!estado) {
            throw new NoListaException(nombre, trabajos.size());
        }

        if (trabajos.isEmpty()) {
            throw new SinTrabajoEnColaException(nombre);
        }

        return trabajos.poll();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int cantidadTrabajos() {
        return trabajos.size();
    }
}
