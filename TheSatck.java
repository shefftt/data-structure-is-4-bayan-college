/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thesatck;

/**
 *
 * @author shefftt
 */
public class TheSatck {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String names[] = new String[10];
        op o = new op();
        o.push("ali", names);
        o.push("ahmed", names);
        o.push("ahmed 2", names);
        o.push("ahmed 3", names);
        o.push("ahmed 4", names);
        
        for(int i =0; i < names.length; i++){
            System.out.println(names[i]);
        }

        
    }
    
    
    
}
