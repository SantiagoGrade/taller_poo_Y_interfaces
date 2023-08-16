public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil(4, "Toyota", "Corolla", 4, "Gasolina");
        Motocicleta moto = new Motocicleta(2, "Harley-Davidson", "Sportster", 1200, "Deportivo");

        Propietario propietarioAuto = new Propietario("Juan", "Perez", auto);
        Propietario propietarioMoto = new Propietario("María", "González", moto);

        propietarioAuto.mostrar_informacion();
        propietarioMoto.mostrar_informacion();

        // Prueba de la interfaz Conducible
        Conducible[] conductores = {auto, moto};
        for (Conducible conductor : conductores) {
            conductor.conducir();
        }
    }
}