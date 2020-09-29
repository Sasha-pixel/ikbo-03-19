package ru.mirea.practic6;

public class Student implements Comparable<Student> {
    private int grade;

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.grade, o.grade);
    }

    public Student(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                '}';
    }
}
