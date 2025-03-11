import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;
 
public class Hospital {
    private List<Paciente> pacientes;
   
    public Hospital() {
        pacientes = new ArrayList<>();
    }
   
 
    public void agregarPaciente(Paciente p) {
        pacientes.add(p);
    }
   
    public void eliminarPaciente(String ci) {
        pacientes.removeIf(p -> p.getCi().equals(ci));
    }
   
    public Paciente buscarPaciente(String ci) {
        for (Paciente p : pacientes) {
            if (p.getCi().equals(ci)) {
                return p;
            }
        }
        return null;
    }
   
    public List<String> obtenerCIPacientesMayorEstatura() {
        double maxEstatura = pacientes.stream()
                .mapToDouble(Paciente::getEstatura)
                .max()
                .orElse(0);
        List<String> listaCI = new ArrayList<>();
        for (Paciente p : pacientes) {
            if (p.getEstatura() == maxEstatura) {
                listaCI.add(p.getCi());
            }
        }
        return listaCI;
    }
   
   
    public int contarPacientesFemeninosConDengue() {
        int count = 0;
        for (Paciente p : pacientes) {
            if (Character.toUpperCase(p.getSexo()) == 'F') {
                for (Enfermedad enf : p.getEnfermedades()) {
                    if (enf.getNombreEnfermedad().equalsIgnoreCase("dengue")) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
   
    public List<Paciente> ordenarPacientesPorNombre() {
        return pacientes.stream()
                .sorted(Comparator.comparing(Paciente::getNombre))
                .collect(Collectors.toList());
    }
   
    public List<Paciente> ordenarPacientesPorPeso() {
        return pacientes.stream()
                .sorted(Comparator.comparing(Paciente::getPeso).reversed())
                .collect(Collectors.toList());
    }
   
    public void modificarPaciente(Paciente pModificado) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getCi().equals(pModificado.getCi())) {
                pacientes.set(i, pModificado);
                return;
            }
        }
    }
}
