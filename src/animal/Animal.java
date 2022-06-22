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
public abstract class Animal implements DeadAlive {

    protected String name;
    protected int age;
    protected String food;
    protected String gender;
    protected int alive;

    public Animal(String name, int age, String food, String gender, int alive) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.alive = alive;
    }   

    public abstract void printSound();

    public boolean isAlive() {
        return alive != DeadAlive.DEAD;
    }

    public void printData() {
        System.out.println("name=" + name + ", age=" + age + ", food=" + food + ", gender=" + gender + ", alive=" + alive);
    }

    public Animal() {

    }

}
