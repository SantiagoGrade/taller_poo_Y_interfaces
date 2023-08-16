public class Propietario {
    private String nombre;
    private String apellido;
    private Vehiculo vehiculo;

    public Propietario(String nombre, String apellido, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.vehiculo = vehiculo;
    }

    public void mostrar_informacion() {
        System.out.println("Información del propietario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        vehiculo.obtener_informacion();
    }
}
