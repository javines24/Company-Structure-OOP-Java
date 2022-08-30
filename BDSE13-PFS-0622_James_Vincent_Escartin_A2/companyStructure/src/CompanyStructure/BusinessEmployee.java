package CompanyStructure;

/**
 * created by Acer on August 27, 2022
 **/
public class BusinessEmployee extends Employee{
//    private double BonusBudget;

    public BusinessEmployee(String Name){
        super(Name, 50000);
    }

//    public double getBonusBudget(){
//        return BonusBudget;
//    }

    public String employeeStatus(){
        String bonus = String.format("%.2f", getBonusBudget());
        return toString() + " with a budget of " + bonus;
    }
}
