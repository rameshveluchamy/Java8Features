package main.java.java8feature.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ramesh on 15/07/17.
 */
public class StreamFeature {

    public static void main(String[] args) {
        List<Person> contestants = Arrays.asList(
                new Person("Mark", "Antony", 23, 'M', "Italian"),
                new Person("Mahi", "Dhoni", 35, 'M', "Indian"),
                new Person("Gayu", "Ram", 28, 'F', "Indian"),
                new Person("Aaru", "Kumar", 25, 'M', "Indian"),
                new Person("Julie", "Kruger", 23, 'F', "Indian"),
                new Person("Kate", "Winslet", 40, 'F', "British"));

        /*for (Person p : contestants) {
            System.out.println(p.toString());
        }*/

        System.out.println("---------------List all contestants------------------");

        contestants.stream()
                .forEach(person -> System.out.println(person.toString()));

        System.out.println("---------------List all Male contestants------------------");
        contestants.stream()
                .filter(person -> person.getSex() == 'M')
                .forEach(person -> System.out.println(person.toString()));

        System.out.println("---------------Youngest Female contestants------------------");

        contestants.stream()
                .filter(p -> p.getSex() == 'F')
                .sorted((person, t1) -> person.getAge())
                .forEach(person -> System.out.println(person.toString()));//TODO: to be corrected

        System.out.println("---------------Eldest Male contestants------------------");
        System.out.println("---------------Average Age of Female contestants------------------");
        System.out.println("---------------List contestants sorted by nationality------------------");
    }
}

class Person {

    private String fname;
    private String lname;
    private int age;
    private char sex;
    private String nationality;

    public Person(String fname, String lname, int age, char sex, String nationality) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.sex = sex;
        this.nationality = nationality;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
