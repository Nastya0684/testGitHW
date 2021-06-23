public class Employee {
    private String name;//class field
    private String surname;
    private String middleName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    // }
//это конструктор
    public Employee(String name, String surname, String middleName, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getMiddleName() {
        return middleName;
    }

    String getPosition() {
        return position;
    }

    String getEmail() {
        return email;
    }

    String getPhone() {
        return phone;
    }

    int getSalary() {
        return salary;
    }

    int getAge() {
        return age;
    }




}
