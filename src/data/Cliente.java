/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author FABIa
 */
public class Cliente {
    private String nombre;
    private int id;
    private String usuario;
    private String contraseña;
    private int cuenta;

    public Cliente(String nombre, int id, String usuario, String contraseña) {
        this.nombre = nombre;
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cuenta = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    public boolean iniciarSesion(String contraseña, String usuario,Cliente cliente){
        return (contraseña==cliente.getContraseña()&&usuario==cliente.getUsuario());
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", id=" + id + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", cuenta=" + cuenta + '}';
    }
    
    
    
}
