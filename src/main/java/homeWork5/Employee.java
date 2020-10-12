package homeWork5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private long number;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, long number, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
            System.out.println("Сотрудник: " + fullName + "\n" + "Должность: " + position + "\n" +
                    "Email: " + email + "\n" + "Телефон: " + number + "\n" +
                    "Зарплата: " + salary + " рублей" + "\n" + "Возвраст: " + age + " лет" + "\n");
    }

    public void infoOlder(int minAge){
        if (age > minAge){
            System.out.println("Сотрудник: " + fullName + "\n" + "Должность: " + position + "\n" +
                    "Email: " + email + "\n" + "Телефон: " + number + "\n" +
                    "Зарплата: " + salary + " рублей" + "\n" + "Возвраст: " + age + " лет" + "\n");
        }
    }
}
