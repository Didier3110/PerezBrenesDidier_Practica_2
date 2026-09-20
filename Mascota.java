import java.time.LocalDate;
public class Mascota {

    private String nombre;
    private String raza;
    private int anioNacimiento = 0;
    private Persona miVeterinario;

    public Mascota(String pNombre, String pRaza) {
        nombre = pNombre;
        raza = pRaza;
        anioNacimiento = 0;
    }

    public Mascota(String pNombre, String pRaza, int pAnioNacimiento) {
        nombre = pNombre;
        raza = pRaza;
        anioNacimiento = pAnioNacimiento;
    }

    public String consultarNombreVeterinario() {
        if (miVeterinario == null) {
            return "No tiene veterinario asignado";
        }
        return miVeterinario.getNombre();
    }

    public void asignarVeterinario(Persona veterinario) {
        miVeterinario = veterinario;
    }

    private int calcularEdadCanina() {
        if (anioNacimiento == 0) {
            return 0;
        }
        return obtenerAnioActual() - anioNacimiento;
    }

    private int calcularEdadHumana() {
        if (anioNacimiento == 0) {
            return 0;
        }
        return calcularEdadCanina() * 7;
    }

    private int obtenerAnioActual() {
        return LocalDate.now().getYear();
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Mascota [nombre=" + nombre
                + ", raza=" + raza
                + ", anioNacimiento=" + anioNacimiento
                + ", edadCanina=" + calcularEdadCanina()
                + ", edadHumana=" + calcularEdadHumana()
                + ", veterinario=" + consultarNombreVeterinario() + "]";
    }
}