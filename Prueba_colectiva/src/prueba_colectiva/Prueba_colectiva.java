
package prueba_colectiva;

import Colectico.Clase;
import javax.swing.JOptionPane;


public class Prueba_colectiva {

    
    public static void main(String[] args) {
        int n1,n2;
        
        n1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero1"));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero2"));
        
        Clase objeto = new Clase(n1,n2);
        
        objeto.calcular();
    }
    
}
