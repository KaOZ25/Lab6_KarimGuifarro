/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_karimguifarro;
import java.util.*;

public class Cliente {
  private String Id,nombre,apellido,nacionalidad,trabajo,puesto,usuario,contraseña;
  private int dinero;
  private ArrayList <String> VIN=new ArrayList();

    public Cliente() {
    }

    public Cliente(String Id, String nombre, String apellido, String nacionalidad, String trabajo, String puesto, String usuario, String contraseña, int dinero) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.trabajo = trabajo;
        this.puesto = puesto;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.dinero = dinero;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<String> getVIN() {
        return VIN;
    }

    public void setVIN(ArrayList<String> VIN) {
        this.VIN = VIN;
    }
  
}
