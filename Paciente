import java.time.LocalDate;
import java.util.*;
 
public class Paciente {
    private String ci;
    private String nombre;
    private String apellidos;
    private LocalDate fechaDeNacimiento;
    private char sexo;
    private double peso;
    private double estatura;
    private List<Imagen> imagenes;
    private List<Enfermedad> enfermedades;
   
    public Paciente(String ci, String nombre, String apellidos, LocalDate fechaDeNacimiento, char sexo,
                    double peso, double estatura) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.estatura = estatura;
        this.imagenes = new ArrayList<>();
        this.enfermedades = new ArrayList<>();
    }
   
    public String getCi() {
        return ci;
    }
   
    public String getNombre() {
        return nombre;
    }
   
    public char getSexo() {
        return sexo;
    }
   
    public double getPeso() {
        return peso;
    }
   
    public double getEstatura() {
        return estatura;
    }
   
    public List<Imagen> getImagenes() {
        return imagenes;
    }
   
    public List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }
   
    public void agregarImagen(Imagen img) {
        imagenes.add(img);
    }
   
    public void agregarEnfermedad(Enfermedad enf) {
        enfermedades.add(enf);
    }
   
    public String dimeDatosPaciente() {
        return "Paciente [ci=" + ci + ", nombre=" + nombre + ", apellidos=" + apellidos +
            ", sexo=" + sexo + ", peso=" + peso + ", estatura=" + estatura +
            ", cantidadImagenes=" + imagenes.size() +
            ", cantidadEnfermedades=" + enfermedades.size() + "]";
    }
}
 
