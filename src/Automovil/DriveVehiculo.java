public class DriveVehiculo {
    public static void main (String[] args){
        Camion camion = new Camion("Gasolina", 3);
        System.out.println(camion);
        System.out.println(camion.encender());
        camion.avanzar();
        camion.transportar();
        camion.frenar();
        System.out.println(camion.apagar());

        System.out.println("--- Motocicleta ---");
        Motocicleta motocicleta = new Motocicleta(150, "Mortalika");
        System.out.println(motocicleta);
        motocicleta.encender();
        motocicleta.avanzar();
        motocicleta.HacerCaballito();
        motocicleta.frenar();
        motocicleta.apagar();

    }
}
