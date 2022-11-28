package pt.uma.tspi.arqd;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int number;
    private String name;

    private Student(){
        number = 0;
        name = "";
    }

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student other = (Student) obj;
        return this.number == other.number;
    }


    @Override
    public int compareTo(Student o) {
        int diff = this.number-o.number;
        return diff;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number,name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
