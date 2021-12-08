/*Ejercicio 13: Hacer un programa que simule un cajero automatico
con un saldo inicial de $1000, con el siguiente menú: 
1. Ingresar dinero a la cuenta; 2. Retirar dinero de la cuenta; 3. Salir.*/
package cajeroingresaretirosalir;

import javax.swing.JOptionPane;

public class CajeroIngresaRetiroSalir {

    public static void main(String[] args) {
        //Declarar la constante
        final int sI = 1000;
        //Declarar variables
        int opcion;
        float ingreso, sA, retiro;
        //Solicitar ingreso de datos por medio de ventanas emergentes
        opcion = Integer.parseInt(JOptionPane.showInputDialog ("Bienvenido al cajero automático\n"
        + "1. Ingresar dinero a la cuenta\n"
        + "2. Retirar dinero de la cuenta\n"
        + "3. Salir\n"));
        
        switch (opcion){
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog ("Digite la cantidad que desea consignar en la cuenta: "));
                sA = sI+ingreso;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+sA);
                break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog ("Digite la cantidad que desea retirar de la cuenta: "));
                if (retiro > sI){
                   JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente en la cuenta"); 
                }
                else {
                    sA = sI -retiro;
                    JOptionPane.showMessageDialog(null, "Saldo en cuenta: "+sA);
                    }
                break;
            case 3: break;
            default: JOptionPane.showMessageDialog(null, "Se equivoco de opción");
                break;
                
        }
                
    }
    
}
