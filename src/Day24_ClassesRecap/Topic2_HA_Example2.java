package Day24_ClassesRecap;

public class Topic2_HA_Example2 {
    public static void main(String[] args) {
/*
Write a program by creating an 'Employee2' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
 */

        Employee2 MyEmployee = new Employee2();
        MyEmployee.GetInfo(90000,8);
        MyEmployee.Name = "Derya Bali";

        MyEmployee.AddSal();

        System.out.println(MyEmployee.Salary);

        MyEmployee.AddWork();

        System.out.println(MyEmployee.Salary);

        System.out.println("-------------------");

        Employee2 PoorGuy = new Employee2();

        PoorGuy.GetInfo(480, 2);
        PoorGuy.Name = "Henry Lion";

        PoorGuy.AddSal();

        System.out.println(PoorGuy.Salary);

        PoorGuy.AddSal();

        System.out.println(PoorGuy.Salary);

        PoorGuy.AddSal();

        System.out.println(PoorGuy.Salary);

        PoorGuy.AddWork();

        System.out.println(PoorGuy.Salary);





    }
}
