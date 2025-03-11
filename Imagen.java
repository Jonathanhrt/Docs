import java.time.LocalDate;
 
public class Imagen {
    private String nombreArchivo;
    private LocalDate fechaDeToma;
    private String tipoImagen;
    private String comentariosDoc;
   
    public Imagen(String nombreArchivo, LocalDate fechaDeToma, String tipoImagen, String comentariosDoc) {
        this.nombreArchivo = nombreArchivo;
        this.fechaDeToma = fechaDeToma;
        this.tipoImagen = tipoImagen;
        this.comentariosDoc = comentariosDoc;
    }
   
    public String getNombreArchivo() {
        return nombreArchivo;
    }
   
    public LocalDate getFechaDeToma() {
        return fechaDeToma;
    }
   
    public String getTipoImagen() {
        return tipoImagen;
    }
   
    public String getComentariosDoc() {
        return comentariosDoc;
    }
   
    public String dameInfoImg () {
        return "Imagen [nombreArchivo=" + nombreArchivo + ", fechaToma=" + fechaDeToma +
            ", tipoImagen=" + tipoImagen + "]";
    }
}
