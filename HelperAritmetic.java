/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slr;

/**
 *
 * @author PC
 */
public class HelperAritmetic {
    
    String formula;
    DataSet tabla= new DataSet();
    double B0,B1;
    
    
    
    public int SumaX(){
       int suma=0;
       for (int i=0;i<=tabla.getMatrizX().length-1;i++){
           suma= tabla.getMatrizX()[i]+suma;
       }
       return suma;
   } 
   
   public int SumaY(){
       int suma=0;
       for (int i=0;i<=tabla.getMatrizY().length-1;i++){
           suma= tabla.getMatrizY()[i]+suma;
       }
       return suma;
   } 
    
   public int SumaXY(){
       int suma=0;
       for (int i=0;i<=tabla.getMatrizX().length-1;i++){
           suma= (tabla.getMatrizX()[i]*tabla.getMatrizY()[i])+suma;
       }
       return suma;
   }
   
   public int SumaXX(){
       int suma=0;
       for (int i=0;i<=tabla.getMatrizX().length-1;i++){
           suma= tabla.getMatrizX()[i]*tabla.getMatrizX()[i]+suma;
       }
       return suma;
   }
   
   public double B1(){
       double b1= ( ((tabla.getMatrizX().length)*this.SumaXY())-(this.SumaX()*this.SumaY()) )/
               ( ((tabla.getMatrizX().length)*this.SumaXX())-(this.SumaX()*this.SumaX()) );
       B1=b1;
       return b1;
   }
   
   public double B0(){
       double b0= ( (this.SumaXX()*this.SumaY())-(this.SumaX()*this.SumaXY()) )
               / ( (tabla.getMatrizX().length*this.SumaXX())-(this.SumaX()*this.SumaX()) );
       B0=b0;
       return b0;
       }
   
   public String formula (){
        formula = ("Regresion Lineal Simple: y="+this.B0()+"-"+this.B1()+"x");
        return formula;
    }
  
   
}
