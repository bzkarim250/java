//Encapsulation
public class Employee {
    private int baseSalary;
    private  int hourlyRate;
    public void setBaseSalary(int baseSalary){
        this.baseSalary=baseSalary;
    }
    //getters and setters
    public  int getBaseSalary()
    {
        return  baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        this.hourlyRate=hourlyRate;
    }

    public  int getHourlyRate()
    {
        return  hourlyRate;
    }
    public int calculateWage(int extraHours){
        return baseSalary+(hourlyRate*extraHours);
    }
}
