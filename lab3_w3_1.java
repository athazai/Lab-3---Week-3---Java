import java.util.Calendar;

public class lab3_w3_1 {
    public static class MyDate {
        private int year;
        private int month;
        private int day;

        public MyDate() {
            Calendar calendar = Calendar.getInstance();
            this.year = calendar.get(Calendar.YEAR);
            this.month = calendar.get(Calendar.MONTH) + 1;
            this.day = calendar.get(Calendar.DAY_OF_MONTH);
        }

        public MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public String toString() {
            return day + "/" + month + "/" + year;
        }
    }

    public static class Person {
        protected String name;
        protected String address;
        protected String phone;
        protected String email;

        public Person(String name, String address, String phone, String email) {
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.email = email;
        }

        @Override
        public String toString() {
            return "Class: Person, Name: " + name + ", Address: " + address +
                    ", Phone: " + phone + ", Email: " + email;
        }
    }

    public static class Student extends Person {
        public static final String FRESHMAN = "Freshman";
        public static final String SOPHOMORE = "Sophomore";
        public static final String JUNIOR = "Junior";
        public static final String SENIOR = "Senior";

        private final String status;

        public Student(String name, String address, String phone, String email, String status) {
            super(name, address, phone, email);
            this.status = status;
        }

        @Override
        public String toString() {
            return "Class: Student, Name: " + name + ", Status: " + status;
        }

    }

    public static class Employee extends Person {
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

        @Override
        public String toString() {
            return "Class: Employee, Name: " + name + ", Office: " + office + ", Hired: " + dateHired.toString();
        }

    }

    public static class Faculty extends Employee {
        private String officeHours;
        private String rank;

        public Faculty(String name, String address, String phone, String email,
                String office, double salary, MyDate dateHired,
                String officeHours, String rank) {
            super(name, address, phone, email, office, salary, dateHired);
            this.officeHours = officeHours;
            this.rank = rank;
        }

        @Override
        public String toString() {
            return "Class: Faculty, Name: " + name +
                    ", Rank: " + rank +
                    ", Office Hours: " + officeHours +
                    ", Hired: " + dateHired;
        }

    }

    public static class Staff extends Employee {
        private String title;

        public Staff(String name, String address, String phone, String email,
                String office, double salary, MyDate dateHired, String title) {
            super(name, address, phone, email, office, salary, dateHired);
            this.title = title;
        }

        @Override
        public String toString() {
            return "Class: Staff, Name: " + name + ", Title: " + title + ", Hired: " + dateHired;
        }

    }

    public static void main(String[] args) {
        Person person = new Person("Atha", "Jakarta", "012-3456789", "atha@email.com");
        Student student = new Student("Aiman", "KMR", "011-2233445", "aiman@email.com", Student.SENIOR);
        Employee employee = new Employee("Charlie", "South Jakarta", "010-9988776", "charlie@email.com",
                "SCBD", 5000, new MyDate(2022, 9, 1));
        Faculty faculty = new Faculty("Dr. Khairul", "UPM", "011-2345678", "khairul@upm.edu",
                "Room 202", 7000, new MyDate(2021, 8, 15), "9AM-5PM", "Associate Professor");
        Staff staff = new Staff("Indah Asri", "Admin Social Media", "017-3344556", "indah@uni.edu",
                "Office 12", 4000, new MyDate(2023, 1, 5), "Indah");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
