package boletin5_7;
import javax.swing.JOptionPane;
public class Figuras {
    public Figuras(){        
    }
    public void area (){   
    int tipo=Integer.parseInt(JOptionPane.showInputDialog("introduzca tipo \n 1:cuadrado \n 2:triangulo \n 3:circulo"));;
    float area;
    switch (tipo){
        case 1:
        float lado=Float.parseFloat(JOptionPane.showInputDialog("lado"));
        // area= lado*lado;
        System.out.println("area = " + lado*lado);
        break;
        case 2:     
        float altura=Float.parseFloat(JOptionPane.showInputDialog("altura"));
        float base=Float.parseFloat(JOptionPane.showInputDialog("base"));
        //area=base*altura/2;
        System.out.println("area = " + (base*altura/2));
        break;
        case 3:
        float radio=Float.parseFloat(JOptionPane.showInputDialog("radio"));
       // area=(float) (2*3.14*radio);
        System.out.println("area = " + (2*3.14*radio));
        break;
        default:
        System.out.println("incorrecto");    
    }   
    }  
}
