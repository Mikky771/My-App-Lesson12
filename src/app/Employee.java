package app;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int age;

    // Конструктор для ініціалізації всіх полів
    public Employee(String fullName, String position, String email, String phone, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    // Геттери
    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    // Сеттер для кожного поля
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Метод для виведення інформації про співробітника
    @Override
    public String toString() {
        return "Employee{" +
                "Full Name='" + fullName + '\'' +
                ", Position='" + position + '\'' +
                ", Email='" + email + '\'' +
                ", Phone='" + phone + '\'' +
                ", Age=" + age +
                '}';
    }
}

