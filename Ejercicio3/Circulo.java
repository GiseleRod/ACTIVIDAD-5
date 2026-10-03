
package staticFinal;

public class Circulo {
     public static final double PI = 3.14;
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getAreaRadio() {
        return PI * radio * radio;
    }

    public double getLongitud() {
        return 2 * PI * radio;
    }

    public double Diametro() {
        return radio * 2;
    }    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


}
