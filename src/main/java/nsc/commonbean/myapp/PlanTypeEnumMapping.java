package nsc.commonbean.myapp;

public enum PlanTypeEnumMapping {
    FREE(0),
    M(1),
    L(2),
    XL(3);

    private int planTypeId;

    PlanTypeEnumMapping(int planTypeId){
        this.planTypeId = planTypeId;
    }

    public int getPlanTypeId() {
        return planTypeId;
    }

    public void setPlanTypeId(int planTypeId) {
        this.planTypeId = planTypeId;
    }
}
