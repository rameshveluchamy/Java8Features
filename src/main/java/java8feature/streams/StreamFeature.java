package main.java.java8feature.streams;

import java.util.stream.Stream;

/**
 * Created by ramesh on 15/07/17.
 */
public class StreamFeature {

    public static void main(String[] args) {

        Stream.of(
                new Person("Mark", "Antony", 40, 'M', "Italian")
        ).count();
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

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
