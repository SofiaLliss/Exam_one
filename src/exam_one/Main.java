package exam_one;

public class Main {
    private static Employee[] employees = new Employee[10];

     /* 1. Получить список всех сотрудников со всеми имеющимися по ним данными
        (вывести в консоль значения всех полей (toString)).
         */

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // 2. Посчитать сумму затрат на зарплаты в месяц

    public static int getTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    // 3. Найти сотрудника с минимальной зарплатой.

    public static Employee countMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    // 4. Найти сотрудника с максимальной зарплатой.

    public static Employee countMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }


    // 5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).

    public static float countAverageSalary() {
        return getTotalSalary() / Employee.getCounter();
    }

    //  6. Получить Ф. И. О. всех сотрудников (вывести в консоль).

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getNameOne() + employee.getNameTwo() + employee.getSurname());
        }
    }


    public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Константин ", "Андреевич ", "Колесников ", 1, 250_000),
                new Employee("Николай ", "Евгенич ", "Осипов ", 4, 240_000),
                new Employee("Антон ", "Павлович ", "Иванов ", 1, 209_000),
                new Employee("Марина ", "Андреевна ", "Осипова ", 3, 150_000),
                new Employee("Василий ", "Витальевич ", "Петров ", 2, 232_000),
                new Employee("Лариса ", "Альбертовна ", "Тряпочкина ", 3, 290_000),
                new Employee("Ангелина ", "Давидовна ", "Грекун ", 5, 290_000),
                new Employee("Евгений ", "Руслановна ", "Генкель ", 2, 150_000),
                new Employee("Анастасия ", "Игоревна ", "Штанг ", 4, 290_000),
                new Employee("Валерия ", "Ивановна ", "Мирошниченко ", 5, 290_000)
        };
        employees[0] = new Employee("Константин ", "Андреевич ", "Колесников ", 1, 250_000);
        printFullNames();
        printEmployees();
        System.out.println("Сумма затрат на все зарплаты в месяц = " + getTotalSalary());
        System.out.println("Минимальная зарплата сотрудника = " + countMinSalary());
        System.out.println("Максимальная зарплата сотрудника = " + countMaxSalary());
        System.out.println("Среднее значение зарплат = " + countAverageSalary());
    }
}










