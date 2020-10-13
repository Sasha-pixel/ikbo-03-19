package ru.mirea.practic9;

public class Student implements Comparable<Student>{

    private String name;
    private int grade;

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.grade, o.grade);
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
