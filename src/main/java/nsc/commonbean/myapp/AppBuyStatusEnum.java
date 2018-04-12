package nsc.commonbean.myapp;

public enum AppBuyStatusEnum {
    START(1),
    PREPARE(2),
    DONE(3),
    UPDATE_ICON(4),
    EXTEND_APP(5);

    private int id;

    AppBuyStatusEnum(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
