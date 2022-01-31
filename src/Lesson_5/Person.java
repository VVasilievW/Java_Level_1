package Lesson_5;

public class Person {
    String FIO;
    String position;
    String telephone;
    String email;
    int theSalary;
    int age;



    public Person(String FIO, String position, String telephone, String email, int theSalary, int age) {
        FIO = FIO;
        position = position;
        telephone = telephone;
        email = email;
        theSalary = theSalary;
        age = age;

    }
    public void printPerson (){
        System.out.println("ФИО " + FIO + "Должность " + position + "Телефон " +telephone + "email " + email + "Зарплата " + theSalary + "Возраст " + age);
    }
}
