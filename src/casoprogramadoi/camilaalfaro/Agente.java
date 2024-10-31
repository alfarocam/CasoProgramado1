/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoprogramadoi.camilaalfaro;

/**
 *
 * @author camil
 */
public class Agente {
    //ENUM SURCUSAL LISTA
    public enum SUCURSAL {
        Heredia,Alajuela,SanJose,Cartago
    }
    //ATRIBUTOS
    public String name;
    public double ID;
    public SUCURSAL Sucu;
    public String code;
    public String vehicule;
    
    //SET SUCURSAL
    public void setSucu(SUCURSAL Sucu) {
        this.Sucu = Sucu;
    }
    
    //GET SUCURSAL
    public SUCURSAL getSucu() {
        return Sucu;
    }
    
    //CONSTRUCTORES
    //con parametros
    public Agente(String name, double ID, SUCURSAL Sucu, String code, String vehicule) {
        this.name = name;
        this.ID = ID;
        this.Sucu = Sucu;
        this.code = code;
        this.vehicule = vehicule;
    }
    //sin parametros

    public Agente() {
        this.name = "No ingresado.";
        this.ID = 0;
        this.code = "No ingresado";
        this.vehicule = "No ingresado";
    }
    
    //METODOS
    public void setVehicule(String vehicule) {
        if ("SI".equals(vehicule)){
            this.vehicule = vehicule;
            System.out.print("El agente "+name+" no cuenta con vehiculo.");
        }  
        else {
            this.vehicule = vehicule;
            System.out.println("El agente "+name+" si cuenta con vehiculo.");
        }
    }
    
    
    
    
    
    
    

 

    
    
}
