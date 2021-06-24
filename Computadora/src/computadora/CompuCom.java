/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author Supervisor
 */
public class CompuCom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora compu1= new Computadora("HP", "Pavillion", new CPU("AMD", "Ryzen 5", 4.2f), 
        new Monitor("BenQ", "GW2480", 24), new Mouse("Logitech", "G502", "alambrico"), new Teclado("Logitech", "G213", 105, 10));
        
        System.out.println(compu1.getMarca());
        System.out.println(compu1.getModelo());
        System.out.println(compu1.getCpu());
        System.out.println(compu1.getMonitor());
        System.out.println(compu1.getMouse());
        System.out.println(compu1.getTeclado());
    }
    
}
