package nsc.commonbean.myapp;

public enum PlanTypeEnumMapping {
    FREE(1),
    M(2),
    L(3),
    XL(4);

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
