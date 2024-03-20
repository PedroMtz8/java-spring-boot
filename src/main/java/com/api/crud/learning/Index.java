package com.api.crud.learning;
import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

import com.api.crud.learning.Person.Person;
import com.api.crud.learning.Student.Student;


public class Index {

    public static void main(String[] args) {
        // ConfigurableApplicationContext context = SpringApplication.run(CrudApplication.class, args);
        // Environment env = context.getEnvironment();
        // String port = env.getProperty("server.port");
        // String username = env.getProperty("spring.datasource.username");

        // String port = "3000";
        // String username = "pedromtz8";
        // int[] array = [2, 3];
        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento " + i + ": " + array[i]);
        }
        // Iterar sobre el array e imprimir cada elemento
        // for (int element : array) {
        //     System.out.println("Elemento: " + element);
        // }
        other();



        Object[][] keyValuePairs = {{"clave1", 123}, {"clave2", "valor2"}, {"clave3", true}};

        // Acceder a los elementos del array y mostrarlos
        for (Object[] pair : keyValuePairs) {
            System.out.println("Clave: " + pair[0] + ", Valor: " + pair[1]);
        }

        iterateArrays();

    }

    public static void other(){
        System.out.println("hola");
    }

    public static void iterateArrays(){
        List<Person> people = new ArrayList<>();

        people.add(new Person("Pedro", 21));
        Person person1 = people.get(0);

        Student student = new Student(person1, "Ingeniería en Sistemas", 5, "G1");

        // printIn studen as object

        System.out.println(student.toString());


        // System.out.println(person1);

        // people.add(new Person("Maria", 30));
        // people.add(new Person("Juan", 25));



        // Person[] peopleArray = people.toArray(new Person[people.size()]);

        // System.out.println(Arrays.toString(peopleArray));

    }
}

// class Person {
//     private String name;
//     private int age;

//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }
//     @Override
//         public String toString() {
//             return "Person{" +
//                     "name='" + name + '\'' +
//                     ", age=" + age +
//                     '}';
//         }
// }