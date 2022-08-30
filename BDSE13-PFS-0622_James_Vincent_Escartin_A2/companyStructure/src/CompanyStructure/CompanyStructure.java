package CompanyStructure;

/**
 * created by Acer on August 29, 2022
 **/
public class CompanyStructure {
    public static void main(String[] args){

        TechnicalLead CTO = new TechnicalLead("Satya Nadella");
        SoftwareEngineer seA = new SoftwareEngineer("Kasey");
        SoftwareEngineer seB = new SoftwareEngineer("Breana");
        SoftwareEngineer seC = new SoftwareEngineer("Eric");
        CTO.addReport(seA);
        CTO.addReport(seB);
        CTO.addReport(seC);
        seA.setCodeAccess(true);
        seA.checkInCode();
        seA.checkInCode();
        seB.setCodeAccess(true);
        seB.checkInCode();
        System.out.println(CTO.getTeamStatus());

        TechnicalLead VPofENG = new TechnicalLead("Bill Gates");
        SoftwareEngineer seD = new SoftwareEngineer("Winter");
        SoftwareEngineer seE = new SoftwareEngineer("Libby");
        SoftwareEngineer seF = new SoftwareEngineer("Gizan");
        SoftwareEngineer seG = new SoftwareEngineer("Zaynah");
        VPofENG.addReport(seD);
        VPofENG.addReport(seE);
        VPofENG.addReport(seF);
        seG.setCodeAccess(true);
        VPofENG.addReport(seG);
        seG.checkInCode();
        System.out.println(VPofENG.getTeamStatus());

        BusinessLead CFO = new BusinessLead("Amy Hood");
        Accountant actA = new Accountant("Niky");
        Accountant actB = new Accountant("Andrew");
        CFO.addReport(actA, CTO);
        CFO.addReport(actB, VPofENG);
        System.out.println(CFO.getTeamStatus());

        System.out.println(seA.toString() + " Manager is " + seA.getManager().toString());
        System.out.println(seD.toString() + " Manager is " + seD.getManager().toString());
        System.out.println(actA.toString() + " Manager is " + actA.getManager().toString() + "\n");

        System.out.println(" Testing for Bonus Approval!\n");
        System.out.print(seB.getManager() + " is asking for $10 000 bonus for " + seB.getName() + ", (The approval should be TRUE): ");
        System.out.println(CTO.requestBonus(seB, 10000));
        System.out.println("Update budget is: " + seB.getManager().getAccountantSupport().getBonusBudget() + "\n");

        System.out.print(seE.getManager() + " is asking for $5 000 bonus for " + seE.getName() + ", The approval should be TRUE): ");
        System.out.println(VPofENG.requestBonus(seE, 5000));
        System.out.println("Updated budget is: " + seF.getManager().getAccountantSupport().getBonusBudget() + "\n");

        System.out.print(seF.getManager() + " is asking for $400,000 bonus  for "+seF.getName()+", (the Approval result should be FALSE): ");
        System.out.println(VPofENG.requestBonus(seF, 400000));
        System.out.println("Updated budget is: "+seF.getManager().getAccountantSupport().getBonusBudget()+"\n");
        System.out.println();
    }
}

