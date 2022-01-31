package Lesson_5;

public class Person {
    String FIO;
    String position;
    String telephone;
    String email;
    int theSalary;
    int age;



    public Person(String FIO, String position, String telephone, String email, int theSalary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.telephone = telephone;
        this.email = email;
        this.theSalary = theSalary;
        this.age = age;

    }
    public void printPerson (){
        System.out.println("ФИО " + FIO + "Должность " + position + "Телефон " +telephone + "email " + email + "Зарплата " + theSalary + "Возраст " + age);
    }
}
