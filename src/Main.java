public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.getAllInfoAboutEmployees();
        //базовый уровень
        float sum = employeeBook.calcSalaryMonth();
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
        Employee customerWithMinSalary = employeeBook.findMinSalary(employeeBook.getEmployees());
        System.out.println("Информация о сотруднике с минимальной ЗП: " + customerWithMinSalary);
        Employee customerWithMaxSalary = employeeBook.findMaxSalary(employeeBook.getEmployees());
        System.out.println("Информация о сотруднике с максимальной ЗП: " + customerWithMaxSalary);
        float averageSalary = employeeBook.calcAverageSalary();
        System.out.println("Информация о средних затратах на ЗП: " + averageSalary);
        employeeBook.getNamesOfEmployees();


    }
}