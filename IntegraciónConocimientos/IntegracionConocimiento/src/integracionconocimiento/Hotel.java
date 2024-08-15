/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integracionconocimiento;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Hotel {
    
    //Atributos//
    public String nombreHotel;
    public int numPiso;
    public int numHabitaciones;
    public String tamanio;
    public String estado;
    public double precio;
    
    
    //cosntructor//
    public Hotel(String nombreHotel, int numPiso, int numHabitaciones, String tamanio, String estado, double precio) {
        this.nombreHotel = nombreHotel;
        this.numPiso = numPiso;
        this.numHabitaciones = numHabitaciones;
        this.tamanio = tamanio;
        this.estado = estado;
        this.precio = precio;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public int getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(int numPiso) {
        this.numPiso = numPiso;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return
                "Nombre del hotel: " + nombreHotel + "\n" 
                + "Piso: " + numPiso + "\n"
                + "Numero de habitacione: " + numHabitaciones + "\n"
                + "Tamaño: " + tamanio + "\n"
                + "Estado: " + estado + "\n"
                + "Precio: " + precio;
    }
     
    //Metodo para mostrar la informacion
    public static void mostrarInfo(Hotel[] habitaciones){
        for (int i = 0; i < habitaciones.length; i++) {
            JOptionPane.showMessageDialog(null, habitaciones[i]);
        }
    }
    
    //metodo para modificar la informacion
    public static void modificarInfo (Hotel[] habitaciones){
        
    }
    
    
    // metodo para mostrar el resumen del hotel
    public static void resumenInfo (Hotel[] habitaciones){
        
        int estadoLibre = 0;
        int estadoOcupado = 0;
        int estadoSucio = 0;
        int gananciaTotal = 0;
        int porcentajeEstado = 0;
        
        // forma para saber cuantas habitaciones hay libre, ocupadas o sucias
        for (int i = 0; i < habitaciones.length; i++) {
            if  (habitaciones[i].estado.equals("libre")){
               estadoLibre = estadoLibre + 1; 
            }
            
            if (habitaciones[i].estado.equals("ocupado")){
                estadoOcupado = estadoOcupado + 1;
            }
            
             if (habitaciones[i].estado.equals("sucia")){
                estadoSucio = estadoSucio + 1;
            }   
        }
        
        
        // forma para sacar la ganancia actual del hotel
        for (int i = 0; i < habitaciones.length; i++){
            if (habitaciones[i].estado == "Ocupado"){
               gananciaTotal = (int) (habitaciones[i].precio + gananciaTotal);
            }
        }
        
        for (int i = 0; i < habitaciones.length; i++){
            if (habitaciones[i].estado == "libre"){
 
            }
        
        
        
        
       JOptionPane.showMessageDialog(null, "El total de habitaciones libres es de: " + estadoLibre + "\n"
               + "El total de habitaciones ocupados es de: " + estadoOcupado + "\n"
               + "el total de habitaciones sucias es de: " + estadoSucio);
       
       JOptionPane.showMessageDialog(null, "La ganancia actual del hotel es de: " + gananciaTotal + " dolares");
       
       JOptionPane.showMessageDialog(null, "el hotel tiene un 30 porciento de accesibilidad");
       
       
        }
    }
}
