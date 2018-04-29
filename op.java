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
public class op {
    public  int stackpointer = -1;
    
    
    public void push(String name , String names[]){
        if(this.stackpointer < 10 ){
           
            names[++stackpointer] = name;
        }
    }
}
