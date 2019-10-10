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
    
    public static void menuPrincipal(){
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
                iniciarSesion();
                break;
            case 3:{
                System.out.println("No digito un valor valido");
                menuPrincipal();}
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
    public static void iniciarSesion(){
        System.out.println("1. Cliente 2.Administrador 3. cerrar");
        Scanner teclado= new Scanner(System.in);
        int j = teclado.nextInt();
        
        switch (j){
            case 1:
                //Cliente
                iniciarSesionCliente();
            case 2:
                //Administrador
                iniciarSesionAdm();
           
            case 3:
                break;
            default:
                break;
        }
        
    }
    public static void iniciarSesionCliente(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("usuario");
        String usuario = teclado.nextLine();
         System.out.println("clave");
        String clave = teclado.nextLine();
        Node<Cliente> aux = new Node<>();
        aux = comparar (clave, usuario);
        if(aux!=null){
            System.out.println("Bienvenido");
            generarClienteActual(aux.getData());
            
            
        }
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
                    break;
                }
                case 2:{
                    System.out.println("Edicion de cliente \n1. nombre\n2. id\n3 usuario\n4 cuenta");
                    int n= teclado.nextInt();
                    System.out.println(n);
                    switch (n){
                        case 1:{
                            System.out.println("Digite el nuevo "+n);
                            cliente.setNombre(teclado.next());
                            System.out.println(cliente.getNombre());
                            break;
                        }
                        case 2:{
                        System.out.println("Digite el nuevo "+n);
                        cliente.setId(teclado.nextInt());
                            break;
                        }
                        case 3: {
                        System.out.println("Digite el nuevo "+n);
                        cliente.setUsuario(teclado.next());
                            break;
                        }
                        case 4: {
                        System.out.println("Digite el nuevo "+n);
                        cliente.setCuenta(teclado.nextInt());
                            break;
                        }
                        default:{
                            System.out.println("Dato incorrecto");
                            break;
                        }
                    }
                    break;
                }
                default:  { System.out.println("Dato incorrecto");
                            }    
            }
    }
    public static Node<Cliente> comparar(String clave,String usuario){
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
     
     public static ListGeneric<Adm> listaAdms;
     public static ListGeneric<Cliente> listaClientes;
     
    public static void main(String[] args) {
        ListGeneric<Adm> listaAdms1 = new ListGeneric<>();
        listaAdms=listaAdms1;
        Adm admA = new Adm("Fabian Galindo",123,"123");
        listaAdms.insertar(admA);
        ListGeneric<Cliente> listaCLientes1 = new ListGeneric<>();
        listaClientes=listaCLientes1;
        
        Cliente cliente1 = new Cliente ("nombre1", 0, "1", "1" );
        Cliente cliente2 = new Cliente ("nombre2", 0, "3", "4");
        Cliente cliente3 = new Cliente ("nombre3", 0, "usuario", "clave");
        Cliente cliente4 = new Cliente ("nombre4", 0, "5", "6");
        
        listaClientes.insertar(cliente2);
        listaClientes.insertar(cliente3);
        listaClientes.insertar(cliente4);
        listaClientes.insertar(cliente1);
        
        
       // menuPrincipal();
       int n=14000000;
        for ( int i=0;i<=n;i++){
        listaClientes.insertar(new Cliente ("nombre1", 0, "1", "1" ));
        }
          /* System.out.println(listaClientes.getTamaño());
        int t = listaClientes.getTamaño();
       for (int i=0;i<=t;i++){
           listaClientes.remove();
       
       }
        System.out.println(listaClientes.getTamaño());
          */ 
 
            
        System.out.println(comparar("1","1").getData().toString());
        Node<Cliente> aux = new Node<>();
            
           aux=listaClientes.getFront();
           for (int i=0;i<listaClientes.getTamaño();i++){
           System.out.println(aux.getData().toString());
           aux=aux.getNext();
        
        } 
       
    
    }
    
}
