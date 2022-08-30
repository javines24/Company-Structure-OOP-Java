package CompanyStructure;

/**
 * created by Acer on August 29, 2022
 **/
public class Accountant extends BusinessEmployee{
    public TechnicalLead teamSupported;

    public Accountant(String Name){
        super(Name);
        this.setBonusBudget(0);
    }

    public TechnicalLead getTeamSupported(){
        return teamSupported;
    }

    public void supportTeam(TechnicalLead lead){
        this.teamSupported = lead;
        for(int i=0;i<lead.team.size();i++){
            this.setBonusBudget(this.getBonusBudget() + (lead.team.get(i).getBaseSalary()*1.1));
        }
    }


    public boolean approveBonus(double bonus){
        double RequestBonus = bonus;
        if(RequestBonus<=this.getBonusBudget()){
            return true;
        } else {
            return false;
        }
    }

    public String employeeStatus(){
        return toString() + " with a budget of " + getBonusBudget() + " is supporting " + getTeamSupported();
    }
}

