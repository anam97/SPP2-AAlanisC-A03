/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aalanisc.a03;
import java.util.Scanner ;
/**
 *
 * @author anamartha
 */
public class SPP2AAlanisCA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variable 
        double catop , catady , hip ;
        //catop = cateto opuesto , catady = cateto adyacente , hip = hipotenusa
        
        Scanner T = new Scanner (System.in);
        System.out.println("Cuanto mide el cateto opuesto");
        catop = T.nextDouble();
        System.out.println("Cuanto mide el cateto adyacente ");
        catady = T.nextDouble();
        
        // se resuelve hipotenusa
        hip = Math.sqrt(Math.pow(catop,2) + Math.pow(catady,2));
        
        
        //Mostrar resultado 
        System.out.println("La hipotenusa es " + hip);
        
    }

  
    }
    

