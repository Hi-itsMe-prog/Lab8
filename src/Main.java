import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter person's name:");
        String personName = scanner.nextLine();
        System.out.println("Enter person's lastname:");
        String personLastname = scanner.nextLine();
        System.out.println("Enter person's birthyear:");
        String personBirthyear = scanner.nextLine();
        Person person = new Person(personName, personLastname, personBirthyear);

        System.out.println("Enter car's brand:");
        String carBrand = scanner.nextLine();
        System.out.println("Enter car's year of manufacture:");
        String carYear = scanner.nextLine();
        System.out.println("Enter car's engine capacity:");
        String carEngineCapacity = scanner.nextLine();
        Car car = new Car(carBrand, carYear, carEngineCapacity);

        System.out.println("Enter book's name:");
        String bookName = scanner.nextLine();
        System.out.println("Enter book's author:");
        String bookAuthor = scanner.nextLine();
        System.out.println("Enter book's year:");
        String bookYear = scanner.nextLine();
        Car.Book book = car.new Book(bookName, bookAuthor, bookYear);

        person.Display();
        car.Display();
        book.Display();

        book.DisplayRes(person, car);
    }
}

class Person {
    public String name;
    public String lastname;
    public String birthyear;

    public Person(String name, String lastname, String birthyear) {
        this.name = name;
        this.lastname = lastname;
        this.birthyear = birthyear;
    }

    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Lastname: " + lastname);
        System.out.println("Birthyear: " + birthyear);
    }
}

class Car {
    public String brand;
    public String yearOfManifacture;
    public String EngineCapacity;

    public Car(String brand, String yearOfManifacture, String EngineCapacity) {
        this.brand = brand;
        this.yearOfManifacture = yearOfManifacture;
        this.EngineCapacity = EngineCapacity;
    }

    public void Display() {
        System.out.println("Brand is: " + brand);
        System.out.println("Created in: " + yearOfManifacture);
        System.out.println("Vehicle engine capacity is: " + EngineCapacity);
    }

    public class Book {
        public String name;
        public String author;
        public String year;

        public Book(String name, String author, String year) {
            this.name = name;
            this.author = author;
            this.year = year;
        }

        public void Display() {
            System.out.println("Name: " + name);
            System.out.println("Written by: " + author);
            System.out.println("Written in: " + year);
        }

        public void DisplayRes(Person a, Car ac) {
            System.out.println(a.name + " reads book " + name + " about car " + ac.brand);
        }
    }
}