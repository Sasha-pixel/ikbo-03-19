package ru.mirea.practic12;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Каненков", "Александр", "Алексеевич");
        System.out.println(person.fullName());
        Address address = new Address("Россия, Москва, Одесская, 14, 3А, 48");
        address.splitByComma();
        address.display();
        address.setAddress("Россия; Москва; Одесская; 14; 3А; 48");
        address.splitByAnySymbol();
        address.display();
        Shirt shirt = new Shirt();
        String[] arr = new String[]{"S001,Black Polo Shirt,Black,XL", "S002,Black Polo Shirt,Black,L", "S003,Blue Polo Shirt,Blue,XL", "S004,Blue Polo Shirt,Blue,M", "S005,Tan Polo Shirt,Tan,XL", "S006,Black T-Shirt,Black,XL", "S007,White T-Shirt,White,XL", "S008,White T-Shirt,White,L", "S009,Green T-Shirt,Green,S", "S010,Orange T-Shirt,Orange,S", "S011,Maroon Polo Shirt,Maroon,S"};

        for(int i = 0; i < arr.length; ++i) {
            shirt.add(arr[i], i);
        }

        System.out.println(shirt);
        Phone number = new Phone("+79164415585");
        System.out.println(number.getPhoneNumber());
    }
}
