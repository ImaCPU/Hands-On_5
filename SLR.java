
package handson5;

public class SLR {
    private int [] x ;
    private int [] y;
    private String formula;
    private double b1,b0;
    public int contador=0;
    
    public SLR (){}
    
    public void tamaño(int n ){
        this.x= new int[n];
        this.y= new int [n];
    }    
    
    public void setVal(int xn, int yn){
            x[contador]=xn;
            y[contador]=yn;
            contador++;
    }
    
    public int getValAtX(int n){
        return x[n];
    }
    
    public String getFormula(){
        return formula;
    }
    
   public int SumaX(){
       int suma=0;
       for (int i=0;i < contador;i++){
           suma= x[i]+suma;
       }
       return suma;
   } 
   
   public int SumaY(){
       int suma=0;
       for (int i=0;i<contador;i++){
           suma= y[i]+suma;
       }
       return suma;
   } 
    
   public int SumaXY(){
       int suma=0;
       for (int i=0;i<contador;i++){
           suma= (x[i]*y[i])+suma;
       }
       return suma;
   }
   
   public int SumaXX(){
       int suma=0;
       for (int i=0;i<contador;i++){
           suma= x[i]*x[i]+suma;
       }
       return suma;
   }
   
   public double B1(){
       double b1= ( ((contador)*this.SumaXY())-(this.SumaX()*this.SumaY()) )/
               ( ((contador)*this.SumaXX())-(this.SumaX()*this.SumaX()) );
       return b1;
   }
   
   public double B0(){
       double b0= ( (this.SumaXX()*this.SumaY())-(this.SumaX()*this.SumaXY()) )
               / ( (contador*this.SumaXX())-(this.SumaX()*this.SumaX()) );
       return b0;
       }
    
    public void formula (){
        formula = ("y^="+this.B0()+"-"+this.B1()+"x");
    }
    
    public double predicción (int x){
        double pre = (this.B1()*x)-this.B0();
        return pre;
    }
   
}


