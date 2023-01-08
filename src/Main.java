import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        var employee=new Employee();

        while(true) {
            System.out.println("Base Salary:");
            employee.setBaseSalary(sc.nextInt());
            System.out.println("Hourly Rate:");
            employee.setHourlyRate(sc.nextInt());
            System.out.println("Extra Hours:");
            if(employee.getBaseSalary()>0&&employee.getHourlyRate()>0)
                break;
            System.out.println("Enter valid inputs");
        }

        int wage=employee.calculateWage(3);
        System.out.println("wage:"+wage);
    }
}