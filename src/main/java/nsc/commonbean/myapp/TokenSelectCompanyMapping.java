package nsc.commonbean.myapp;

import java.io.Serializable;
import java.util.List;

public class TokenSelectCompanyMapping implements Serializable {

    private TinyCompanyMapping selectCompany;
    private List<TinyCompanyMapping> allCompany;

    public TinyCompanyMapping getSelectCompany() {
        return selectCompany;
    }

    public void setSelectCompany(TinyCompanyMapping selectCompany) {
        this.selectCompany = selectCompany;
    }

    public List<TinyCompanyMapping> getAllCompany() {
        return allCompany;
    }

    public void setAllCompany(List<TinyCompanyMapping> allCompany) {
        this.allCompany = allCompany;
    }
}
