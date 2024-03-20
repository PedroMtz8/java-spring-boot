package com.api.crud.learning.Person;

public class Person {
    private String name;
    int age;
    final String school = "UdG";
    // {
    //     school = "UdG";
    // }

    public static void main(String[] args) {
        Person[] people = new Person[5];

        // print the variable people array
        System.out.println(people);

        people[0] = new Person("Pedro", 21);
        people[1] = new Person("Maria", 30);
        people[2] = new Person("Juan", 25);

        Person firstPerson = people[0];

        Person lastPerson = people[4];
        if (lastPerson != null) {
            

            System.out.println("Last person: " + lastPerson.getName());

        } else {

            System.out.println("No existe el objeto");

        }

        firstPerson.name = "Other";
        System.out.println("First person: " + firstPerson.getName());

        for (Person person : people) {
            System.out.println("Nombre: " + person.getName());  
        }
    }

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String setName(String name){
        return this.name = name;
    }

    public int getAge(){
        return age;
    }

}

class Main {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        // print the variable people array
        System.out.println(people);

        people[0] = new Person("Pedro", 21);
        people[1] = new Person("Maria", 30);
        people[2] = new Person("Juan", 25);

        Person firstPerson = people[0];
        // firstPerson.name = "Other";
        firstPerson.setName("Other");
        System.out.println("First person: " + firstPerson.getName());

        // for (Person person : people) {
        //     System.out.println("Nombre: " + person.getName());  
        // }
    }
}


