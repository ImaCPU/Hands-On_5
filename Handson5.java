/*
 * Simple Linear Regression with Agents
   Omar Israel Navarro Oliva
   Estudiante de ingenieria en sistemas computacionales
   30 de Septiembre del 2021
 */
package handson5;

import jade.core.Agent;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class Handson5 extends Agent{
    public void setup(){
        Scanner entrada = new Scanner(System.in);
        SLR tabla = new SLR();
        tabla.tamaño(9);
        tabla.setVal(23,651);
        tabla.setVal(26, 762);
        tabla.setVal(30, 856);
        tabla.setVal(34, 1063);
        tabla.setVal(43, 1190);
        tabla.setVal(48, 1298);
        tabla.setVal(52, 1421);
        tabla.setVal(57, 1440);
        tabla.setVal(58, 1518);
        
        double b1=tabla.B1();
        double b0=tabla.B0();
        
        int pre=1, n;
        
        double prediccion;
        
        while (pre==1){
            String num = JOptionPane.showInputDialog(null,"Escribe el valor a predecir:");
            n=Integer.parseInt(num);
            prediccion=b1*n-b0;
            System.out.print("Tu numero es "+prediccion);
            JOptionPane.showMessageDialog(null, "Tu numero es "+prediccion);
            int resp = JOptionPane.showConfirmDialog(null,"Quieres seguir prediciendo?",
                    "Predecir?",JOptionPane.YES_NO_OPTION);
            if (resp==1){  pre=0; }
        }
        System.exit(0);
    }   
}
