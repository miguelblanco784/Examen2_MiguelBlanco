package examen2_miguelblanco;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario extends Persona implements Serializable {

    private String usuario;
    private String contrasena;
    private ArrayList chats = new ArrayList();
    private ArrayList amigos = new ArrayList();
    private ArrayList<Integer> solicituddeamigos = new ArrayList();
    private int calidadwifi;

    public Usuario() {
    }

    public Usuario(String usuario, String contrasena, int calidadwifi, String nombre, String apellido, int telefono) {
        super(nombre, apellido, telefono);
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.calidadwifi = calidadwifi;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ArrayList getChats() {
        return chats;
    }

    public void setChats(ArrayList chats) {
        this.chats = chats;
    }

    public ArrayList getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList amigos) {
        this.amigos = amigos;
    }

    public int getCalidadwifi() {
        return calidadwifi;
    }

    public void setCalidadwifi(int calidadwifi) {
        this.calidadwifi = calidadwifi;
    }

    public ArrayList getSolicituddeamigos() {
        return solicituddeamigos;
    }

    public void setSolicituddeamigos(ArrayList solicituddeamigos) {
        this.solicituddeamigos = solicituddeamigos;
    }

    @Override
    public String toString() {
        return usuario+" "+super.getApellido();
    }

}
