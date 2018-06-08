package nsc.commonbean.myapp;

import java.io.Serializable;
import java.util.Date;

public class PersonalMapping implements Serializable {
    private int id;
    private String name;
    private String personalPosition;
    private int companyId;
    private String education;
    private String experiment;
    private String interestingTopic;
    private String contact;
    private String resourceId;
    private Date createDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalPosition() {
        return personalPosition;
    }

    public void setPersonalPosition(String personalPosition) {
        this.personalPosition = personalPosition;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperiment() {
        return experiment;
    }

    public void setExperiment(String experiment) {
        this.experiment = experiment;
    }

    public String getInterestingTopic() {
        return interestingTopic;
    }

    public void setInterestingTopic(String interestingTopic) {
        this.interestingTopic = interestingTopic;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
