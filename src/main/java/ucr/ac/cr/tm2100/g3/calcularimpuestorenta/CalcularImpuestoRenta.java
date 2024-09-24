/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucr.ac.cr.tm2100.g3.calcularimpuestorenta;

import javax.swing.JOptionPane;

/**
 *
 * @author lab2-23
 */
public class CalcularImpuestoRenta {

    public static void main(String[] args) {
    Factura factura= null;
    String numeroFactura, fecha;
    int monto, option;
    String controlFactura1= "";
    String controlFactura2= "";
    double totalIngresos = 0.0;
    double totalGastos = 0.0;
    do{
        option =Integer.parseInt(JOptionPane.showInputDialog("Hola, por favor ingresa la opcion que se adapte a tus necesidades.<3 \n" +
                                                                "1. Ingrese las facturas por servicios profesionales.\n" +
                                                                "2. Ingresar gastos.\n" +
                                                                "3. Listado de ingresos.\n" +
                                                                "4. Listado de gastos.\n" +
                                                                "5. CÃ¡lculo del impuesto de renta.\n" +
                                                                "6. Salir "));
        switch (option){
            case 1 -> {
                numeroFactura=JOptionPane.showInputDialog("Ingrese el numero de la factura: ");
                fecha=JOptionPane.showInputDialog("Ingrese la fecha de la factura: (Con diagonales de por medio, por ejemplo, DD/MM/YY) ");
                monto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de la factura: "));
                
                totalIngresos += monto;
                factura = new Factura( monto, numeroFactura, fecha);
                controlFactura1+=factura.toString(1);
                JOptionPane.showMessageDialog(null, factura.toString(1));
                
            }
            case 2 -> {
                numeroFactura=JOptionPane.showInputDialog("Ingrese el numero de factura: ");
                fecha=JOptionPane.showInputDialog("Ingrese la fecha de la factura: (Con diagonales de por medio, por ejemplo, DD/MM/YY)     ");
                monto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de la factura: "));
                
                totalGastos += monto;
                factura = new Factura( monto, numeroFactura, fecha);
                controlFactura2+=factura.toString(2);
                JOptionPane.showMessageDialog(null, factura.toString(2));
                
            }
            case 3 -> {
                
                JOptionPane.showMessageDialog(null, controlFactura1);
            }
            
            case 4 -> {
                
                JOptionPane.showMessageDialog(null, controlFactura2);
            }
            
            case 5 -> {
                double utili= totalIngresos - totalGastos ;
                double impuesto = factura.calcularImpuestos(utili);
                double montoTotal = utili + impuesto;
                int hijos =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de hijos que tiene: "));
                int conyuge = JOptionPane.showConfirmDialog(null,"Â¿Tienes usted un cÃ³nyuge?","",JOptionPane.YES_NO_OPTION);
                if (conyuge == JOptionPane.YES_OPTION){
                    montoTotal = factura.descuento(hijos,true, montoTotal);
                    
                    
                }else{
                    montoTotal = factura.descuento(hijos,false, montoTotal);
                }
                JOptionPane.showMessageDialog(null, "Total de ingresos: " + totalIngresos + "\n" +
                        "Total de gastos: " + totalGastos + "\n" +
                                "Utilidad: " + utili + "\n" +
                                        "Impuesto a pagar: " + impuesto +"\n"+
                                                "Monto total a pagar: " + montoTotal);
            }
            
            case 6 -> JOptionPane.showMessageDialog(null, "Nos vemos pronto, un placer haberte ayudado, muak. <3");
        
            }
        }while(option != 6);
    
    }
}
