package grupo1;

public class TrabajoImpresion implements Trabajo {

    private final String documento;

    public TrabajoImpresion(String documento) {
        this.documento = documento;
    }

    @Override
    public void ejecutar() {
        System.out.println("Imprimiendo documento: " + documento);
    }
}
