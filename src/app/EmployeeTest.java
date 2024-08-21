package app;

public class EmployeeTest {
    // Головний метод для демонстрації роботи класу
    public static void main(String[] args) {

        Employee employee = new Employee("Bil Doews", "Software Engineer", "bill.doews@example.com", "+1234567890", 30);

        // Перевірка геттерів
        System.out.println("Name: " + employee.getFullName()); // Очікується: John Doe
        System.out.println("Position: " + employee.getPosition()); // Очікується: Software Engineer
        System.out.println("Email: " + employee.getEmail()); // Очікується: john.doe@example.com
        System.out.println("Phone: " + employee.getPhone()); // Очікується: +1234567890
        System.out.println("Age: " + employee.getAge()); // Очікується: 30

        // Перевірка сеттерів
        employee.setFullName("Jane Doews");
        employee.setPosition("Senior Software Engineer");
        employee.setEmail("jane.doews@example.com");
        employee.setPhone("+0987654321");
        employee.setAge(35);

        // Перевірка оновлених значень
        System.out.println("Updated Name: " + employee.getFullName()); // Очікується: Jane Doe
        System.out.println("Updated Position: " + employee.getPosition()); // Очікується: Senior Software Engineer
        System.out.println("Updated Email: " + employee.getEmail()); // Очікується: jane.doe@example.com
        System.out.println("Updated Phone: " + employee.getPhone()); // Очікується: +0987654321
        System.out.println("Updated Age: " + employee.getAge()); // Очікується: 35

        // Перевірка методу toString
        System.out.println(employee.toString());
        // Очікується: Employee{Full Name='Jane Doe', Position='Senior Software Engineer', Email='jane.doe@example.com', Phone='+0987654321', Age=35}
    }

}
