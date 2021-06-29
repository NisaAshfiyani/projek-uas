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
public class antrian {
    public static void main(String[] args){
		antriann antrian = new antriann(10);
        antrian.enqueue(50);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        System.out.println("yang diambil dari antrian="+ antrian.dequeue());
        System.out.println("NISA ASHFIYANI 20090146");
        antrian.display();
        antrian.enqueue(70);
        antrian.display();
        
        System.out.println("yang diambil dari antrian="+ antrian.dequeue());
        antrian.display();
        antrian.dequeue();
        antrian.display();
        System.out.println("nilai yang paling depan"+ antrian.dequeue());
        antrian.display();
    }
    

}
