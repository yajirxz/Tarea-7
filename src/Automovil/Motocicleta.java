public class Motocicleta implements Vehiculo {
    private int CmCubicos;
    private String Marca;

    public Motocicleta() {
    }

    public Motocicleta(int cmCubicos, String marca) {
        CmCubicos = cmCubicos;
        Marca = marca;
    }

    public int getCmCubicos() {
        return CmCubicos;
    }

    public void setCmCubicos(int cmCubicos) {
        CmCubicos = cmCubicos;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "CmCubicos=" + CmCubicos +
                ", Marca='" + Marca + '\'' +
                '}';
    }
    public void HacerCaballito(){
        System.out.println("Haciendo un caballito para romperme los huesos...");
    }


    @Override
    public void transportar() {

    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta marca " + this.Marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta marca " + this.Marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando la motocicleta de " + this.CmCubicos + " C.C.");

    }

    @Override
    public void frenar() {
        System.out.println("Frenando la motocicleta de " + this.CmCubicos + " C.C.");

    }
}
