package examen2_miguelblanco;

import java.io.Serializable;
import java.util.ArrayList;

public class Mensajes implements Serializable{

    private String mensaje;
    private String hora;
    private String fecha;
    private int leido;

    public Mensajes() {
    }

    public Mensajes(String mensaje, String hora, String fecha, int leido) {
        this.mensaje = mensaje;
        this.hora = hora;
        this.fecha = fecha;
        this.leido = leido;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getLeido() {
        return leido;
    }

    public void setLeido(int leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "Mensajes{" + "mensaje=" + mensaje + ", hora=" + hora + ", fecha=" + fecha + ", leido=" + leido + '}';
    }

}
