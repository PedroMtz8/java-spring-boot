package com.api.crud.learning.Student;

import com.api.crud.learning.Person.Person;

public class Student extends Person {
    private String career;
    private int semester;
    private String group;

    public Student(String name, Integer age, String career, int semester, String group){
        super(name, age);
        this.career = career;
        this.semester = semester;
        this.group = group;
    }

    public  Student(Person person, String career, int semester, String group){
        super(person.getName(), person.getAge());
        this.career = career;
        this.semester = semester;
        this.group = group;
    }

    public String getCareer(){
        return career;
    }

    public String setCareer(String career){
        return this.career = career;
    }

    public int getAge(){
        return super.getAge();
    }

    public int getSemester(){
        return semester;
    }

    public String getGroup(){
        return group;
    }

    // @Override
    public String toString() {
        return "Student { " +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", career='" + career + '\'' +
                ", semester=" + semester +
                ", group='" + group + '\'' +
                " }";
    }

}