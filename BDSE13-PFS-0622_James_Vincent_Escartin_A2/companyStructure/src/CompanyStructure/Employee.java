package CompanyStructure;

/**
 * created by Acer on August 27, 2022
 **/
abstract public class Employee {
    private double BaseSalary;
    private String Name;
    private Employee Manager;
    private int EmployeeId;
    private static int IdCount;
    private int HeadCount;
    private double BonusBudget;
    private double Bonus;

    private Accountant AccountantSupport;

    public Employee(String Name, double BaseSalary) {
        this.Name=Name;
        this.BaseSalary=BaseSalary;
        IdCount++;
        this.EmployeeId = IdCount;
    }

    public Accountant getAccountantSupport() {
        return AccountantSupport;
    }

    public void setAccountantSupport(Accountant accountantSupport) {
        AccountantSupport = accountantSupport;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }

    public double getBonusBudget() {
        return BonusBudget;
    }

    public void setBonusBudget(double bonusBudget) {
        BonusBudget = bonusBudget;
    }

    public int getHeadCount() {
        return HeadCount;
    }

    public void setHeadCount(int headCount) {
        HeadCount = headCount;
    }

    public double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(double BaseSalary){
        this.BaseSalary=BaseSalary;
    }

    public String getName() {
        return Name;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public Employee getManager() {
        return Manager;
    }

    public void setManager(Employee Manager){
        this.Manager=Manager;
    }

    public boolean equals(Employee other){
        if(this.getEmployeeId() == other.getEmployeeId()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return getEmployeeId()+ " " + getName();
    }

    public abstract String employeeStatus();
}
