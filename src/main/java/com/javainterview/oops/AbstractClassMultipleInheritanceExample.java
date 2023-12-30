package com.javainterview.oops;

//Abstract class representing Flying ability
abstract class Flying {
 abstract void fly();
}

//Abstract class representing Swimming ability
abstract class Swimming {
 abstract void swim();
}

//Class Bird extending Flying abstract class
class Bird extends Flying {
 @Override
 void fly() {
     System.out.println("Bird is flying.");
 }
}

//Class Fish extending Swimming abstract class
class Fish extends Swimming {
 @Override
 void swim() {
     System.out.println("Fish is swimming.");
 }
}

//Class Duck extending both Flying and Swimming abstract classes (Multiple Inheritance)
class Duck extends Flying {
 @Override
 void fly() {
     System.out.println("Duck is flying.");
 }
}

class DuckSwimming extends Swimming {
 @Override
 void swim() {
     System.out.println("Duck is swimming.");
 }
}

public class AbstractClassMultipleInheritanceExample {
 public static void main(String[] args) {
     Bird bird = new Bird();
     Fish fish = new Fish();
     Duck duck = new Duck();
     DuckSwimming duckSwimming = new DuckSwimming();

     bird.fly();
     fish.swim();
     duck.fly();
     duckSwimming.swim();
 }
}

