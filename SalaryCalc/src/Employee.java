public class Employee {
    String name;
    double salary;
    int workHours, hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 1000) {
            return salary * 0.03;
        }
        return 0.0;
    }

    public double bonus() {
        double extra = this.workHours - 40;
        if (extra > 0) {
            return extra * 30;
        }
        return 0.0;
    }

    public double increase() {
        double year = 2021 - this.hireYear;
        if (year < 10) {
            return salary * 0.05;
        } else if (year > 9 && year < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    void printInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work Hour : " + this.workHours);
        System.out.println("Hire Year : " + this.hireYear);
        System.out.println("Tax : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Salary Increase : " + this.increase());
        System.out.println("Salary with Taxes and Bonus : " + (this.salary - tax() + bonus()));
        System.out.println("Total salary  : " + (this.salary - tax() + bonus() + increase()));
    }
}
