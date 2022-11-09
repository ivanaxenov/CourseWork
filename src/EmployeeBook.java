public class EmployeeBook {
    public static int customerCount = 5;
    private Employee[] employees;

    EmployeeBook() {
        this.employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 24_000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 56_000);
        employees[2] = new Employee("Сидоров Олег Геннадьевич", 3, 42_000);
        employees[3] = new Employee("Пупкин Никита Александрович", 4, 73_000);
        employees[4] = new Employee("Набоков Алексей Семенович", 5, 39_000);

    }

    public void getAllInfoAboutEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                str += employees[i].toString() + "\n";
            }
        }
        return "Данные по сотрудникам:\n" + str;
    }

    public void getNamesOfEmployees() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employees[i] == null) continue;
            System.out.println(employee.getFio());
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public float calcSalaryMonth() {
        float sumOfSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sumOfSalary += employees[i].getSalary();
            }
        }
        return sumOfSalary;
    }

    public Employee findMinSalary(Employee[] employees) {
        float minSalary = Float.POSITIVE_INFINITY;
        Employee customerWithMinSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                    customerWithMinSalary = employees[i];
                }
            }
        }
        return customerWithMinSalary;
    }

    public Employee findMaxSalary(Employee[] employees) {
        float maxSalary = Float.NEGATIVE_INFINITY;
        Employee customerWithMaxSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                    customerWithMaxSalary = employees[i];
                }
            }
        }
        return customerWithMaxSalary;
    }

    public float calcAverageSalary() {
        float averageSalary = calcSalaryMonth() / customerCount;
        return averageSalary;
    }

}
