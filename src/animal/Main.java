/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Arvin Situmorang
 */
public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Kucing", 2, "ikan", "male", 1);
        c.isAlive();
        c.printSound();
        c.printData();
        
        Dog dog = new Dog("Anjing", 6, "daging", "female", 0);
        dog.isAlive();
        dog.printSound();
        dog.printData();
        
        Duck duck = new Duck("Bebek", 3, "roti", "male", 0);
        duck.isAlive();
        duck.printSound();
        duck.printData();
        
        Horse h = new Horse("Kuda", 5, "rumput", "female", 1);
        h.isAlive();
        h.printSound();
        h.printData();
    }
}
