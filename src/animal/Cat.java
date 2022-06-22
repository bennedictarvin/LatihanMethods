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
public class Cat extends Animal {

    public Cat() {

    }

    public Cat(String name, int age, String food, String gender, int alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public void printSound() {
        System.out.println("Meow");
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Jenis: Cat");
    }

}
