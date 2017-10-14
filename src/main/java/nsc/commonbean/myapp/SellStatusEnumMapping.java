package nsc.commonbean.myapp;

public enum SellStatusEnumMapping {
    FILL_USER_DETAIL(1, "fill_user_detail"),
    WAITING_SELLER(2, "waiting_seller"),
    PAYMENT(3, "payment"),
    SHIPMENT(4, "shipment"),
    FINISH(5, "finish"),
    USER_CANCEL(6, "user_cancel"),
    ADMIN_CANCEL_WAITING_SELLER(7,"admin_cancel_wating_seller"),
    ADMIN_CANCEL_PAYMENT(8, "admin_cancel_payment"),
    ADMIN_CANCEL_SHIPMENT(9, "admin_cancel_shipment");

    private int statusId;
    private String statusName;

    SellStatusEnumMapping(int statusId, String statusName) {
        this.statusId = statusId;
        this.statusName = statusName;
    }

    public int getStatusId() {
        return statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public static SellStatusEnumMapping getById(int sellId) {
        switch (sellId) {
            case 1:
                return FILL_USER_DETAIL;
            case 2:
                return WAITING_SELLER;
            case 3:
                return PAYMENT;
            case 4:
                return SHIPMENT;
            case 5:
                return FINISH;
            case 6:
                return USER_CANCEL;
            case 7:
                return ADMIN_CANCEL_WAITING_SELLER;
            case 8:
                return ADMIN_CANCEL_PAYMENT;
            case 9:
                return ADMIN_CANCEL_SHIPMENT;
            default:
                return FILL_USER_DETAIL;
        }
    }
}
