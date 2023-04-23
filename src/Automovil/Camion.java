public class Camion implements Vehiculo {
    private String combustible;
    private double peso;

    public Camion() {
    }

    public Camion(String combustible, double peso) {
        this.combustible = combustible;
        this.peso = peso;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Camion{" +
                "combustible='" + combustible + '\'' +
                ", peso=" + peso +
                '}';
    }

    @Override
    public void transportar() {
        System.out.println("Transportando algo...");

    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo el camión de combustible " + this.combustible);
        return Math.random() >= 0.2;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando el camión de combustible " + this.combustible);
        return Math.random() >= 0.05;
    }

    @Override
    public void avanzar() {
        System.out.println("El camión está avanzando");

    }

    @Override
    public void frenar() {
        System.out.println("Frenando...");

    }
}
