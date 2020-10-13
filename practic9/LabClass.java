package ru.mirea.practic9;

import java.util.ArrayList;

public class LabClass {
    private ArrayList<Student> studentArrayList;
    private Student soughtStudent = null;

    public LabClass() {
        this.studentArrayList = new ArrayList<Student>();
    }

    public void add(Student student) {
        studentArrayList.add(student);
    }

    public Student remove(int index) {
        return studentArrayList.remove(index);
    }

    public boolean isEmpty() {
        return studentArrayList.isEmpty();
    }

    public Student find(String name) throws StudentNotFoundException {
        for (Student student : studentArrayList) {
            if (student.getName().equals(name))
                soughtStudent = student;
        }
        if (soughtStudent == null) {
            throw new StudentNotFoundException("Студент " + name + " не найден!");
        }
        return soughtStudent;
    }
}
