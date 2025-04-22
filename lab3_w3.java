public class lab3_w3 {
    public static void main(String[] args) {
        // Different hire dates
        MyDate empDate = new MyDate(1, 1, 2020);
        MyDate facultyDate = new MyDate(15, 6, 2018);
        MyDate staffDate = new MyDate(20, 9, 2022);

        Person person = new Person("Ali", "UPM", "0111234567", "ali@gmail.com");
        Student student = new Student("Fatimah", "UPM", "0117654321", "fatimah@gmail.com", Student.SOPHOMORE);
        Employee employee = new Employee("Aiman", "Kuala Lumpur", "0123456789", "aiman@gmail.com", "C101", 5000,
                empDate);
        Faculty faculty = new Faculty("Prof. Lee", "Serdang", "0198765432", "lee@gmail.com", "F202", 8000,
                facultyDate, "9-11am", "Associate Professor");
        Staff staff = new Staff("Sarah", "Seri Kembangan", "0131234567", "sarah@gmail.com", "Admin1", 4000,
                staffDate, "Admin Assistant");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);

    }

}

// MyDate.java
class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

// Person.java
class Person {
    protected String name, address, phoneNumber, email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString() {
        return "Class: Person, Name: " + name;
    }
}

// Student.java
class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    private String status;

    public Student(String name, String address, String phone, String email, String status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public String toString() {
        return "Class: Student, Name: " + name;
    }
}

// Employee.java
class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phone, String email,
            String office, double salary, MyDate dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    // Employee.java
    public String toString() {
        return "Class: Employee, Name: " + name + ", Hired: " + dateHired;
    }
}

// Faculty.java
class Faculty extends Employee {
    private String officeHours, rank;

    public Faculty(String name, String address, String phone, String email,
            String office, double salary, MyDate dateHired,
            String officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    // Faculty.java
    public String toString() {
        return "Class: Faculty, Name: " + name + ", Hired: " + dateHired;
    }
}

// Staff.java
class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phone, String email,
            String office, double salary, MyDate dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

    // Staff.java
    public String toString() {
        return "Class: Staff, Name: " + name + ", Hired: " + dateHired;
    }
}
