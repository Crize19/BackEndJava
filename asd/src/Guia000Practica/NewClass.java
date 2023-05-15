/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia000Practica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Crize
 */
public class NewClass {
    public static void main(String[] args) {
        
        //System.out.println("Hola Mundo");
        
        /*ArrayList<String> list = new ArrayList<>();
        
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        
        System.out.println(list.size());
        
        list.remove("c");
        
        System.out.println(list.size());
        
        ArrayList<String> nombresArr = new ArrayList();
        
        nombresArr.add("Chiquito");
        nombresArr.add("Chiquito");
        nombresArr.add("Chiquito");
        
        
        System.out.println(nombresArr.size());
        
        nombresArr.remove("Chiquito");
        
        System.out.println(nombresArr.size());*/
        
        List <String> nombres = new ArrayList();
        
        nombres.add("Lola");
        nombres.add("Rodman");
        nombres.add("Chiquito");
        
        for (String aux : nombres) {
            System.out.println(aux);
            
        }
        System.out.println("======================");
        
        
        for (int i = 0; i < nombres.size(); i++) {
            
            System.out.println(nombres.get(i));
            
        }
        
        System.out.println("======================");
        
        nombres.forEach((e)->System.out.println(e));
        
        
        for (int i = 0; i < nombres.size(); i++) {
            String m = nombres.get(i);
            
            if (m.equals("Lola")) {       
                nombres.remove(m);   
                
            } 
            
        }
        
        System.out.println("======================");
        
        nombres.forEach((e)->System.out.println(e));
        
        Iterator<String> it = nombres.iterator();
        
        while (true) {
            
        }
    }
}
