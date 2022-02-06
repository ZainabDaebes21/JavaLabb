package Assignment1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Charlie","male",35000);
        Person p2 = new Person("Martina","female",30000);
        Person p3 = new Person("Lovisa","female",34000);
        Person p4 = new Person("Mohamed","female",55000);
        Person p5 = new Person("Sebastian","female",25000);
        Person p6 = new Person("Melinda","female",40000);
        Person p7 = new Person("Eliah","male",37000);
        Person p8 = new Person("Simon","female",32000);
        Person p9 = new Person("Christian","male",39000);
        Person p10 = new Person("Lukas","male",44000);

        List<Person> people = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10));


        System.out.println("====================Assignment 1========================");

        Long nmbOfFemales = people.stream()
                .filter(x -> Objects.equals(x.getGender(), "female"))
                .count();

        double maleSalary = people.stream()
                .filter(x -> Objects.equals(x.getGender(), "male"))
                .map(Person::getSalary).mapToDouble(Double::doubleValue).sum();

        double femaleSalary = people.stream()
                .filter(x -> Objects.equals(x.getGender(), "female"))
                .map(Person::getSalary).mapToDouble(Double::doubleValue).sum();

        System.out.println("Average salary");
        System.out.println("Average salary for woman " + (femaleSalary / nmbOfFemales) + "kr per month");
        System.out.println("Average salary for men is " + (maleSalary /  (10 - nmbOfFemales)) +"kr per month\n");

        System.out.println("Most earned income");
        Person richest = people.stream()
                .sorted(Comparator.comparing(Person::getSalary).reversed())
                .limit(1).min(Comparator.comparing(Person::getSalary)).get();
        System.out.println(richest.getName() + " erans the most with " + (int)richest.getSalary() + "kr per month.\n");

        System.out.println("Least earned income");
        Person poorest = people.stream()
                .sorted(Comparator.comparing(Person::getSalary))
                .limit(1).min(Comparator.comparing(Person::getSalary)).get();
        System.out.println(poorest.getName() + " earns least with " + (int)poorest.getSalary() + "kr per month.\n");
    }
}
