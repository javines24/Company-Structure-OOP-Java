package CompanyStructure;

/**
 * created by Acer on August 27, 2022
 **/
public class TechnicalEmployee extends Employee{
    private int checkIns;
//    private static int LeadCheckIn;

    public TechnicalEmployee(String Name){
        super(Name, 75000);
        checkIns = 0;
    }

    public void setCheckIns(){
        checkIns++;
    }

//    public int getLeadCheckIn() {
//        return LeadCheckIn;
//    }
//
//    public void setLeadCheckIn() {
//        LeadCheckIn++;
//    }

    public int getCheckIns(){
        return checkIns;
    }

//    public String LeadStatus(){
//        return getEmployeeId() + " " + getName() + " has " + getLeadCheckIn() + " successful check ins";
//    }

    @Override
    public String employeeStatus() {
        return getEmployeeId() + " " + getName() + " has " + getCheckIns() + " successful check ins";
    }
}
