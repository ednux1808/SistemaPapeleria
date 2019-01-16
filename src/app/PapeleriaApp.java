/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Eduardo
 */
public class PapeleriaApp {
    
    public double ganancia = 0;
    public double ganaciaPorUna = 0;
    
    public PapeleriaApp(){
    }
    
    public void calcularGanacia(double precioCompra,double precioVenta, int NumPiezas){
        
        this.ganaciaPorUna = precioVenta - precioCompra;
        this.ganancia = this.ganaciaPorUna * NumPiezas;
        
    }
    public void limpiarVar(){
        this.ganancia = 0;
    }
    
}
