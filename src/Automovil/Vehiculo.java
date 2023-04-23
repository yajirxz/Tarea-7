public interface Vehiculo {
    public static final int VELOCIDADMAXIMA = 160;
    public static final char CLASIFICACIONEFICIENCIA = 'A';

    void transportar();

    public boolean encender();
    public boolean apagar();
    public void avanzar();
    public void frenar();


}
