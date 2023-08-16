class Motocicleta extends Vehiculo implements Conducible {
    private int cilindrada;
    private String tipo_manejo;

    public Motocicleta(int ruedas, String marca, String modelo, int cilindrada, String tipo_manejo) {
        super(ruedas, marca, modelo);
        this.cilindrada = cilindrada;
        this.tipo_manejo = tipo_manejo;
    }

    @Override
    public void obtener_informacion() {
        super.obtener_informacion();
        System.out.println("Información de la motocicleta:");
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Tipo de manejo: " + tipo_manejo);
    }

    @Override
    public void conducir() {
        System.out.println("La motocicleta está en movimiento.");
    }
}
