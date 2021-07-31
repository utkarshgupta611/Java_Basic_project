package com.ust.first;

public class Travel {

    public static void main(String[] args) {
        System.out.println("Welcome tp ABC Travel");

        Car car1 = new Car();
        System.out.print("car 1 -- ");
        car1.setTyres(5);
        System.out.println(car1.getTyres());
        System.out.println(car1);

        Car car2 = new Car();
        System.out.print("car 2 -- ");
        car1.setType("Sclass");
        System.out.println(car1.getType());
        System.out.println(car2);

        Car car3 = new Car();
        System.out.print("car 3 -- ");
        System.out.println(car3);
        car1.move();

        Liftable crane = new Crane();
        crane.lift();
    }
}