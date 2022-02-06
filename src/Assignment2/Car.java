package Assignment2;

public  abstract class Car {
    private String name;
    private String model;
    private Double price;
    private int year;
    private int milage;

    public Car(String name, String model, Double price, int year, int milage) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.year = year;
        this.milage = milage;
    }

    public void printCar(){
        System.out.println("Car name-model-year: "+ name+"-"+model+ "-"+ year +": \n\t" + " With Milage= "+ milage + " is: $"+price );
    }

}

