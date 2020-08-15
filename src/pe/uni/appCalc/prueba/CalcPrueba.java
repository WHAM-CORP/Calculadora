
package pe.uni.appCalc.prueba;

import pe.uni.appCalc.service.CalcService;


public class CalcPrueba {
    
    public static void main(String[] args) {
        
        //variables
    double num1,num2,suma ,resta,multi,divi;
    //datos
    num1=100;
    num2=10;
    //proceso
    CalcService calcver=new CalcService();
    suma=calcver.suma(num1, num2);
    resta=calcver.resta(num1, num2);
    multi=calcver.multi(num1, num2);
    divi=calcver.divi(num1, num2);
    //salida
        System.out.println("suma"+suma);
        System.out.println("resta:"+resta);
        System.out.println("multiplicacion:" +multi);
        System.out.println("division:"+divi);
    }
    
    
    
}
