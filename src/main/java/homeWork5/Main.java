package homeWork5;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ксения Боброва", "Ведущий аналитик",
                "jira.number@gmail.com", 84953334455L, 78000, 18);

/*        employee.info();*/

        Employee[] employees = new Employee[] {
                new Employee("Доминик Фан Биз", "БОГ",
                        "jira.number0@gmail.com", 84950000000L, 999999, 999),
                new Employee("James Amstrong", "Генеральный инспектор Hogwarts",
                        "jira.number1@gmail.com", 84953334456L, 240000, 32),
                new Employee("Дима Биляев", "Разарботчик",
                        "jira.number2@gmail.com", 84953334457L, 144000, 23),
                new Employee("Greg Ostin", "PR-Менеджер",
                        "jira.number3@gmail.com", 84953334458L, 300000, 28),
                new Employee("Алиса Винтерхолл", "Финансовый директор",
                        "jira.number4@gmail.com", 84953334459L, 178000, 41),
        };

/*      for (int i = 0; i < employees.length ; i++) {
            employees[i].info();
        }*/
        for (Employee employee1 : employees) {
            employee1.infoOlder();
        }
    }
}
