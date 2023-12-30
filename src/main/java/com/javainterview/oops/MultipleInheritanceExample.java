package com.javainterview.oops;


//Interface for Flying ability
interface Flying1 {
 void fly1();
}

//Interface for Swimming ability
interface Swimming1 {
 void swim1();
}

//Class Bird implementing Flying interface
class Bird1 implements Flying1 {
 @Override
 public void fly1() {
     System.out.println("Bird is flying.");
 }
}

//Class Fish implementing Swimming interface
class Fish1 implements Swimming1 {
 @Override
 public void swim1() {
     System.out.println("Fish is swimming.");
 }
}

//Class Duck implementing both Flying and Swimming interfaces (Multiple Inheritance)
class Duck1 implements Flying1, Swimming1 {
 @Override
 public void fly1() {
     System.out.println("Duck is flying.");
 }

 @Override
 public void swim1() {
     System.out.println("Duck is swimming.");
 }
}

public class MultipleInheritanceExample {
 public static void main(String[] args) {
     Bird1 bird = new Bird1();
     Fish1 fish = new Fish1();
     Duck1 duck = new Duck1();

     bird.fly1();
     fish.swim1();
     duck.fly1();
     duck.swim1();
 }
}
