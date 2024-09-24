/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.calcularimpuestorenta;

/**
 *
 * @author lab2-23
 */
public class Factura {
    private double monto;
    private String numFactura;
    private String fecha;
    
    public Factura (){
        this.monto = 0.0;
        this.numFactura = "";
        this.fecha = "";
    
    }
    
    public Factura(double monto, String numFactura, String fecha){
        this.monto = monto;
        this.numFactura = numFactura;
        this.fecha = fecha;
    }
    
    public double getMonto(){
        
        return monto;
    
    }
    
    public String getNumFactura(){
        
        return numFactura;
    
    }
    
    public String getFecha(){
        
        return fecha;
    }
    
    public double calcularImpuestos(double utili ){
    
    if(utili<=4127000){
        
        return 5 ;     
        
        }else if (utili > 4127000.0 &  utili <= 6164000.0){
            
        return (utili * (10.0/100.0));    
        
        }else{
            
         if (utili > 6164000.0 & utili <=  10281000.0){
             
        return (utili * (15.0/100.0));
        
    }else{
             
          if( utili > 10281000.0 & utili <= 20605000.0){
              
        return (utili * (20.0/100.0));
        
    }else{
              
            if ( utili > 20605000.0){
                
        return (utili * (25.0/100.0));
        
        }else{
                
                return 1.0;
                
           }
          }
         }
        }
       }
    
    public double descuento(int hijos,boolean conyuge, double montoTotal){
        hijos = hijos * 20760;
        montoTotal = montoTotal - hijos;
        
        if (conyuge){
            
            montoTotal = montoTotal - 31440;
        }
        
        return montoTotal;
    } 
    
    public String toString(int option){
         if(option==1){
             
             return "NÃºmero de factura: " + numFactura + "\n"
                    +"Fecha: " + fecha + "\n"
                    +"Monto ingresado: " + monto + "\n\n";
         }else if(option==2){
             
           return   "NÃºmero de factura: " + numFactura + "\n"
                    +"Fecha: " + fecha + "\n"
                    +"Monto egresado: " + monto + "\n\n";
         
         }else{
             
             return "Perdona, esta no es una opcion valida, pipipi :<";
         
            }
         
        }
         
    }