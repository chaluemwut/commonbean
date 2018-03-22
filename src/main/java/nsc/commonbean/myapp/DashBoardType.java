package nsc.commonbean.myapp;

import java.io.Serializable;

public enum DashBoardType implements Serializable{
    SPECIAL(1),
    USER(2),
    OTHER(3),
    PROMOTION(4);

    private int dashboardId;

    DashBoardType(int id){
        this.dashboardId = id;
    }

    public int getId(){
        return dashboardId;
    }

    public static DashBoardType getById(int id){
        switch (id){
            case 1:
                return SPECIAL;
            case 2:
                return USER;
            case 3:
                return OTHER;
            case 4:
                return PROMOTION;
        }
        return null;
    }
}
