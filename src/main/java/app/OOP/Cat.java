package app.OOP;

public class Cat extends Animal {
    String name;
    Cat(String name){
            this.name=name;
    }
    @Override
    void print() { System.out.printf("I am cat. My name is %s\n",name);
    }

}
