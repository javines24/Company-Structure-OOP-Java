package CompanyStructure;

import java.util.ArrayList;

/**
 * created by Acer on August 29, 2022
 **/
public class BusinessLead extends BusinessEmployee{
    ArrayList<Accountant> team;

    public BusinessLead(String Name){
        super(Name);
        double BLeadSalary = getBaseSalary()*2;
        setBaseSalary(BLeadSalary);
        setHeadCount(10);
        this.team = new ArrayList<Accountant>();
    }

    public boolean hasHeadCount(){
        return (this.team.size()<this.getHeadCount());
    }

    public boolean addReport(Accountant e, TechnicalLead supportTeam) {
        if(hasHeadCount()){
            team.add(e);
            e.setManager(this);
            double base = this.getBonusBudget() + e.getBaseSalary()*1.1;
            this.setBonusBudget(base);
            e.supportTeam(supportTeam);
            supportTeam.setAccountantSupport(e);
            return true;
        } else {
            return false;
        }
    }

    public boolean requestBonus(Employee e, double bonus) {
        if(bonus<=getBonusBudget()){
            double deductedBonus = this.getBonusBudget()-bonus;
            this.setBonusBudget(deductedBonus);
            double addedBonus = e.getBonusBudget()+bonus;
            e.setBonusBudget(addedBonus);
            return true;
        } else {
            return false;
        }
    }

    public boolean approveBonus(Employee e, double bonus){
        for(int i=0;i<team.size();i++){
            if((team.get(i).getTeamSupported()).equals(e.getManager()) && team.get(i).approveBonus(bonus)){
                double addedBonus = e.getBonus() + bonus;
                e.setBonus(addedBonus);
                double subBonus = team.get(i).getBonusBudget() - bonus;
                team.get(i).setBonus(subBonus);
                team.get(i).setBonusBudget(subBonus);
                return true;
            }
        } return false;
    }

    public String getTeamStatus(){
        if(team.size()==0){
            return this.employeeStatus() + " and no direct report yet";
        } else {
            String teamStatus="";
            for(int i=0;i<team.size();i++) {
                teamStatus+=("      "+team.get(i).employeeStatus()+"\n");
            }
            double LeadBonusBudget = getBonusBudget() + getBaseSalary();
            String bonus = String.format("%.2f", LeadBonusBudget);
            String LeadStatus = toString() + " with a budget of " + bonus;
            return LeadStatus +" and is managing: \n"+teamStatus;
        }
    }
}
