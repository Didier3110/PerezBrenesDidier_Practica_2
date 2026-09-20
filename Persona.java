import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String codigoLicencia;
    private ArrayList<Mascota> misMascotas;

    public Persona(String pNombre, String pCodigoLicencia) {
        nombre = pNombre;
        codigoLicencia = pCodigoLicencia;
        misMascotas = new ArrayList<Mascota>();
    }

    public void asignarMascota(Mascota mascota) {
        misMascotas.add(mascota);
    }

    public String consultarNombreMisMascotas() {
        if (misMascotas.isEmpty()) {
            return "No tiene mascotas asignadas";
        }

        String nombres = "";
        for (int i = 0; i < misMascotas.size(); i++) {
            nombres = nombres + misMascotas.get(i).getNombre();
            if (i < misMascotas.size() - 1) {
                nombres = nombres + ", ";
            }
        }
        return nombres;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Persona [nombre=" + nombre
                + ", codigoLicencia=" + codigoLicencia
                + ", misMascotas=" + consultarNombreMisMascotas() + "]";
    }
}