/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeck_uas;

/**
 *
 * @author HP
 */
public class stack {
    
    public static void main (String [] args){
        pile tumpukan=new pile(10);
        tumpukan.push(30);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(10);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(30);
        tumpukan.baca();
        System.out.println(" ");
        
        long nilaitop = tumpukan.push();
        System.out.println("nilai teratas = " + nilaitop);
        System.out.print("Nisa Ashfiyani (20090146)");
        long nilai = tumpukan.pop();
        System.out.println("nilai yang dihapus = " + nilai);
        tumpukan.pop();
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(40);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
        
        
}
}
