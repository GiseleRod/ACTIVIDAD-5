package grupo1;

public class TrabajoBackup implements Trabajo {

    private String origen;

    public TrabajoBackup(String origen) {
        this.origen = origen;
    }

    @Override
    public void ejecutar() {
        System.out.println("Realizando backup de: " + origen);
    }
}
