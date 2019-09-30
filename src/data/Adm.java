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
public class Adm {
    private String nombre;
    private int id;
    private String contraseña;

    public Adm(String nombre, int id, String contraseña) {
        this.nombre = nombre;
        this.id = id;
        this.contraseña=contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
