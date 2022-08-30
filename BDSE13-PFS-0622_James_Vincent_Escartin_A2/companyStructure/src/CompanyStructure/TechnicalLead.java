package CompanyStructure;

import java.util.ArrayList;

/**
 * created by Acer on August 27, 2022
 **/
public class TechnicalLead extends TechnicalEmployee {

    ArrayList<SoftwareEngineer> team;

    public TechnicalLead(String Name) {
        super(Name);
        double TLeadSalary = getBaseSalary() * 1.3;
        setBaseSalary(TLeadSalary);
        setHeadCount(4);
        this.team = new ArrayList<SoftwareEngineer>();
    }

    public boolean hasHeadCount() {
        return (team.size() < getHeadCount());
    }

    public boolean addReport(SoftwareEngineer e) {
        if (hasHeadCount()) {
            team.add(e);
            e.setManager(this);
            return true;
        } else {
            return false;
        }
    }

    public boolean approveCheckIn(SoftwareEngineer e) {
        if (e.getManager().equals(this) && e.getCodeAccess() == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean requestBonus(Employee e, double bonus) {
        BusinessLead businessLead = (BusinessLead) getAccountantSupport().getManager();
        if (businessLead.approveBonus(e, bonus)){
        return true;}
        else {
            System.out.print("Rejected because it was over the Updated Price: ");
            return false;
            }
}

    public String getTeamStatus() {
        if (team.size() == 0) {
            return employeeStatus() + " and has no direct report yet.";
        } else {
            String TeamStatus = "";
            for (int i = 0; i < team.size(); i++) {
                TeamStatus += "      " + team.get(i).employeeStatus() + "\n";
            }
            int LeadCheckIn = 0;
            for(int i = 0; i<team.size();i++){
                LeadCheckIn += team.get(i).getCheckIns();
            }
            return  getEmployeeId() + " " + getName() + " has " +  LeadCheckIn + " successful check ins" + " and is managing: \n" + TeamStatus;
        }
    }
}


