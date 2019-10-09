/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import data.*;
import data.list.ListGeneric;
import data.list.Node;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FABIa
 */

public class Ui {
    
    public static void menuPrincipal(ListGeneric listaClientes, ListGeneric listaAdms){
        System.out.println("Bienvenido a FortuneBet");
        System.out.println("Que desea realizar?");
        System.out.println("1. Crear usuario\n2. Iniciar sesion");
         Scanner teclado= new Scanner(System.in);
        int i = teclado.nextInt();
        
        switch (i){
            case 1:
                //Crear Usuario
                listaClientes.insertar(crearUsuario());
                System.out.println(listaClientes.getTamaño());
            case 2:
                //Iniciar sesion
                iniciarSesion(listaClientes);
                break;
            case 3:{
                System.out.println("No digito un valor valido");
                menuPrincipal(listaClientes,listaAdms);}
        }
    }
    public static Cliente crearUsuario(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("creando usuario");
        System.out.println("nombre:");
        String nombre= teclado.next();
        System.out.println("id:");
        int id= teclado.nextInt();
        
        System.out.println("usuario:");
        String usuario= teclado.next();
        
        System.out.println("contraseña:");
        String contraseña= teclado.next();
        return (new Cliente(nombre,id,usuario,contraseña));
        
        
        
    }
    public static void iniciarSesion(ListGeneric listaClientes){
        System.out.println("1. Cliente 2.Administrador 3. cerrar");
        Scanner teclado= new Scanner(System.in);
        int j = teclado.nextInt();
        
        switch (j){
            case 1:
                //Cliente
                iniciarSesionCliente(listaClientes);
            case 2:
                //Administrador
                iniciarSesionAdm();
           
            case 3:
                break;
            default:
                break;
        }
        
    }
    public static void iniciarSesionCliente(ListGeneric listaClientes){
        Scanner teclado= new Scanner(System.in);
        System.out.println("usuario");
        String usuario = teclado.nextLine();
         System.out.println("clave");
        String clave = teclado.nextLine();
        Node<Cliente> aux = new Node<>();
        aux = comparar (listaClientes,clave, usuario);
        if(aux!=null){
            System.out.println("Bienvenido");
            generarClienteActual(aux.getData());}
        else{
            System.out.println("contraseña incorrecta");
                
        }
            
     
    }
    public static void generarClienteActual(Cliente cliente){
        System.out.println("1. Perfil");
        System.out.println("2. Editar");
        Scanner teclado= new Scanner(System.in);
        int h = teclado.nextInt();
            switch(h){
                case 1:{
                    System.out.println(cliente.toString());
                }
                case 2:{
                    
                }
            }
        
        
        
    }
    public static Node<Cliente> comparar(ListGeneric listaClientes,String clave,
            String usuario){
        Node<Cliente> aux2 = listaClientes.getFront();
            
        while(aux2!=null){
            
            if (clave == null ? aux2.getData().getContraseña() == null : clave.equals(aux2.getData().getContraseña())){
                if (usuario == null ? aux2.getData().getUsuario() == null : usuario.equals(aux2.getData().getUsuario())){
                    return aux2;
                
                }
            }else 
                aux2=aux2.getNext();
        }
        return (aux2);
            
                
            /** if ((clave == null ? aux2.getData().getContraseña() == null : clave.
                    equals(aux2.getData().getContraseña()) )&&(usuario == null ?
                    aux2.getData().getUsuario() == null : usuario.equals(aux2.
                            getData().getUsuario()))){
                
                return (aux2);
            }else{
                aux2=aux2.getNext();
                
            }
            
        }
        return (aux2);
    */
    }
     public static void iniciarSesionAdm(){
     
     }
    public static void main(String[] args) {
        Adm admA = new Adm("Fabian Galindo",123,"123");
        ListGeneric<Cliente> listaClientes =new ListGeneric<>();
        ListGeneric<Adm> listaAdms =new ListGeneric<>();
        listaAdms.insertar(admA);
        
        
        Cliente cliente1 = new Cliente ("nombre1", 0, "1", "1" );
        Cliente cliente2 = new Cliente ("nombre2", 0, "3", "4");
        Cliente cliente3 = new Cliente ("nombre3", 0, "usuario", "clave");
        Cliente cliente4 = new Cliente ("nombre4", 0, "5", "6");
        listaClientes.insertar(cliente1);
        listaClientes.insertar(cliente2);
        listaClientes.insertar(cliente3);
        listaClientes.insertar(cliente4);
        
        menuPrincipal(listaClientes, listaAdms);
       
    
    }
    
}
