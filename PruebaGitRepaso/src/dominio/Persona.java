package dominio;

public class Persona implements IPersona{

    @Override
    public void caminar(String nombre, String apellido, int edad) {
        System.out.println(nombre + " " + apellido + " de " + edad + " está caminando.");
    }

    @Override
    public void manejar(String vehiculo) {
        System.out.println("En el vehículo: " + vehiculo);
    }
}
