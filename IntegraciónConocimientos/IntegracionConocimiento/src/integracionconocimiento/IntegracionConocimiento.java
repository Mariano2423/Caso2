/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integracionconocimiento;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Caso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // arreglo de las habitaciones
        Hotel[] habitaciones = new Hotel[9];
        
        // Aqui se precarga la informacion de las habitaciones
        habitaciones[0] = new Hotel("Hotel Brisa", 1, 101, "Doble", "Ocupado", 30);
        habitaciones[1] = new Hotel("Hotel Brisa", 1, 102, "Sencilla", "Libre", 20);
        habitaciones[2] = new Hotel("Hotel Brisa", 1, 203, "Familiar", "Sucia", 50);
        habitaciones[3] = new Hotel("Hotel Brisa", 2, 201, "Doble", "Libre", 30);
        habitaciones[4] = new Hotel("Hotel Brisa", 2, 202, "Sencilla", "Ocupado", 25);
        habitaciones[5] = new Hotel("Hotel Brisa", 2, 203, "Doble", "Libre", 30);
        habitaciones[6] = new Hotel("Hotel Brisa", 3, 301, "Sencilla", "Sucia", 20);
        habitaciones[7] = new Hotel("Hotel Brisa", 3, 302, "Familiar", "Ocupado", 50);
        habitaciones[8] = new Hotel("Hotel Brisa", 3, 303, "Doble", "Ocupado", 30);
  
        // se muestras los metodos
        Hotel.mostrarInfo(habitaciones);
        Hotel.resumenInfo(habitaciones);
    }
    
}
