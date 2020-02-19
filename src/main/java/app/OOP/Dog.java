package app.OOP;

public class Dog extends Animal {
    String name;
    Dog(String name){
        this.name=name;
    }
    @Override
    void print() { System.out.printf("I am dog. My name is %s\n",name);
    }
}
