package Lesson_5;

public class Main {
    public static void main(String[] args) {
        Person [] persArray = new Person[5];
        persArray [0] = new Person("Ivanov",
                "Director",
                "89100000001",
                "Ivanov@mail.ru",
                50000,
                47);
        persArray [1] = new Person("Petrov",
                "Buhgalter",
                "89200000002",
                "petrov@mail.ru",
                45000,
                43);

        persArray [2] = new Person("Sidorov",
                "Engener",
                "89200000003",
                "Sidorov@mail.ru",
                35000,
                23);
        persArray [3] = new Person("Arbuzov",
                "Engener",
                "89200000004",
                "Arbuzov@mail.ru",
                35000,
                33);
        persArray [4] = new Person("Dynev",
                "Engener",
                "89200000005",
                "Dynev@mail.ru",
                35000,
                41);

    }
}
