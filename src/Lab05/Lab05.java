package Lab05;

public class Lab05 {
    public static void main(String[] args) {
        Person Sam = new Person();
        Sam.name = "Sam";
        Sam.age = 34;

        Car bmw = new Car();
//        Sam.carCollection=new Car[]
        bmw.model = "bmw";
        bmw.color = "black";
        Engine bmwEngine = new Engine();
        bmwEngine.Power = 2000;
        bmw.CarEngine = bmwEngine;

        Car santro = new Car();
        santro.model = "santro";
        santro.color = "yellow";
        Engine santroEngine = new Engine();
        santroEngine.Power = 1000;
//        Sam.carCollection.CarEngine.Power = "1000 CC";
        santro.CarEngine = santroEngine;

        Car[] SamCars = {bmw, santro};
        Sam.carCollection = SamCars;

        Person Ram = new Person();
        Ram.name = "Ram";
        Ram.age = 35;
        Sam.friend = Ram;

        System.out.println(Sam.carCollection[0].CarEngine.Power);

    }
}

class Person {
    String name;
    int age;
    Car[] carCollection;
    Person friend;

}

class Car {
    String model;
    String color;
    Engine CarEngine;
}

class Engine {
    long Power;
}
