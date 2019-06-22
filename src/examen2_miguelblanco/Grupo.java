/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_miguelblanco;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class Grupo extends Chats implements Serializable{

    private String nombre;
    private ArrayList<Usuario> miembros = new ArrayList();
    private Usuario admin;
    private ArrayList<Mensajes> mensajes = new ArrayList();

    public Grupo() {
    }

    public Grupo(String nombre, Usuario admin) {
        this.nombre = nombre;
        this.admin = admin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Usuario getAdmin() {
        return admin;
    }

    public void setAdmin(Usuario admin) {
        this.admin = admin;
    }

    public ArrayList<Mensajes> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensajes> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "Grupo{" + "nombre=" + nombre + ", miembros=" + miembros + ", admin=" + admin + ", mensajes=" + mensajes + '}';
    }

}
