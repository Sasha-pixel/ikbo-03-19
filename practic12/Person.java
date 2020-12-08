package ru.mirea.practic12;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Person(String lastName) {
        this.lastName = lastName;
    }

    public String fullName() {
        if (this.firstName == null && this.middleName == null)
        return this.lastName;
    else
        return this.lastName + " " + this.firstName.charAt(0) + '.' + this.middleName.charAt(0) + '.';
    }
}
