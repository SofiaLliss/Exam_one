package exam_one;

public class Employee {

   private static int counter = 0;
   private String nameOne;
    private String nameTwo;
    private String surname;
    private int department; //отдел
    private int salary;
    public int id;


    public Employee(String nameOne, String nameTwo, String surname, int department, int salary) {
        this.nameOne = nameOne;
        this.nameTwo = nameTwo;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.id = counter++;

    }

    public static int getCounter() {
        return counter;
    }

    // Созаем геттеры
    public String getNameOne() {
        return this.nameOne;
    }

    public String getNameTwo() {
        return this.nameTwo;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() { return id; }

    // Создем сеттеры
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        // Добавляем метод toString()
        return
                // Возвращаем строку в метод Main
                "id: " + id +
                        "; Сотрудник: " + nameOne + " " + nameTwo + " " + surname +
                        "; Зарплата: " + salary +
                        "; Отдел: " + department +
                        ";";

    }
}
