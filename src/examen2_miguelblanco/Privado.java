package examen2_miguelblanco;

import java.io.Serializable;
import java.util.ArrayList;

public class Privado extends Chats implements Serializable{

    private Usuario usuario;
    private ArrayList<Mensajes> mensajes = new ArrayList();

    public Privado() {
    }

    public Privado(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Mensajes> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensajes> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "Privado{" + "usuario=" + usuario + ", mensajes=" + mensajes + '}';
    }

}
