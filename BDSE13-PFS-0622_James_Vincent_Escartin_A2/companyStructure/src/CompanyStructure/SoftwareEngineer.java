package CompanyStructure;

import java.util.ArrayList;

/**
 * created by Acer on August 27, 2022
 **/
public class SoftwareEngineer extends TechnicalEmployee {
    private boolean CodeAccess;


    public SoftwareEngineer(String Name) {
        super(Name);
        setCodeAccess(false);

    }

    public boolean getCodeAccess(){
        return CodeAccess;
    }

    public void setCodeAccess(boolean CodeAccess){
        this.CodeAccess=CodeAccess;
    }

    public int getSuccessfulCheckIns(){
        return getCheckIns();
    }

    public boolean checkInCode(){
        TechnicalLead Manager = (TechnicalLead) this.getManager();
        if (Manager.approveCheckIn(this)) {
            setCheckIns();
//            setLeadCheckIn();
            return true;
        } else {
            setCodeAccess(false);
            return false;
        }
    }
}
