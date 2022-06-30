public class Main {

    public static void countMinSalary(Employee[] employees) {
        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employee : employees) {
                if (emp.getSalaryStaff() > employee.getSalaryStaff())
                    emp = employee;
            }
            System.out.println("Minimum wage employee: " + emp.getSalaryStaff() + emp.getStaff() + emp.getId());
        }
        else {
            System.out.println("The array is empty");
        }
    }

    public static void countMaxSalary(Employee[] employees) {
        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employee : employees) {
                if (emp.getSalaryStaff() < employee.getSalaryStaff())
                    emp = employee;
            }
            System.out.println("Employee with the maximum salary: " + emp.getSalaryStaff() + emp.getStaff() + emp.getId());
        }
        else {
            System.out.println("The array is empty");
        }

    }

    public static int countStaffSalary(Employee[]employees){
        int sum = 0;
        for (Employee employee:employees){
            sum+=employee.getSalaryStaff();
        }
        System.out.println("The amount of monthly salary costs for all employees: " + sum);
        return sum;
    }

    public static void tupeAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static void countAllStaff(Employee[]employees){
        for (Employee employee: employees){
            System.out.println("Company employees: "+employee.getStaff());
        }
    }

    public static void averageSalary (Employee[] employees){
        int sum = countStaffSalary(employees);
        int average = sum / employees.length;
        System.out.println("Average salary " + average);
    }


    public static void main(String[] args) {
        System.out.println("Course assignment. Employee Book ");

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Ivanov Ivan Ivanovich ", 55_000,  1);
        employee[1] = new Employee("Petrov Petr Petrovich ", 65_000,  2);
        employee[2] = new Employee("Sidorov Michail Michailovich ", 99_800,  3);
        employee[3] = new Employee("Smirnov Semen Evgenievich ", 98_000,  4);
        employee[4] = new Employee("Rogov Denis Denisovich ", 120_000,  5);
        employee[5] = new Employee("Lee Denis ", 138_000, 1);
        employee[6] = new Employee("An Vadim ", 200_000, 2);
        employee[7] = new Employee("Fedorov Roman Igorevich ", 330_000, 3);
        employee[8] = new Employee("Simonov Vadim Vadimovich ", 78_000, 4);
        employee[9] = new Employee("Totov Roman Denisovich ", 140_000, 5);

        tupeAllStaff(employee);
        countMinSalary(employee);
        countMaxSalary(employee);
        countStaffSalary(employee);
        averageSalary(employee);
        countAllStaff(employee);




    }
}