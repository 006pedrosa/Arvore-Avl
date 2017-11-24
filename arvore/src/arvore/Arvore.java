/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;
import java.util.*;
/**
 *
 * @author PT
 */
public class Arvore {
    
    public static ArvoreAvl avl;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        avl = new ArvoreAvl();
        avl.inserir(0);
        System.out.println("HELLO WORLD");
        
        // TODO code application logic here
    }
    
}
