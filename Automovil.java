class Automovil extends Vehiculo implements Conducible {
    private int numero_puertas;
    private String tipo_combustible;

    public Automovil(int ruedas, String marca, String modelo, int numero_puertas, String tipo_combustible) {
        super(ruedas, marca, modelo);
        this.numero_puertas = numero_puertas;
        this.tipo_combustible = tipo_combustible;
    }

    @Override
    public void obtener_informacion() {
        super.obtener_informacion();
        System.out.println("Información del automóvil:");
        System.out.println("Número de puertas: " + numero_puertas);
        System.out.println("Tipo de combustible: " + tipo_combustible);
    }

    @Override
    public void conducir() {
        System.out.println("El automóvil está en movimiento.");
    }
}
