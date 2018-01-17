package nsc.commonbean.myapp;

public enum SellStatusEnumMapping {

    FILL_USER_DETAIL(1, "fill_user_detail", "Fill seller detail", "รายละเอียด"),
    WAITING_SELLER(2, "waiting_seller","Waiting seller", "รอผู้ขาย"),
    PAYMENT(3, "payment", "Payment", "จ่ายเงิน"),
    SHIPMENT(4, "shipment", "Shipment", "ส่งของ"),
    FINISH(5, "finish", "Finish", "เสร็จ"),
    USER_CANCEL(6, "user_cancel", "User cancel", "ผู้ซื้อยกเลิก"),
    ADMIN_CANCEL_WAITING_SELLER(7,"admin_cancel_wating_seller", "Admin cancel", "ผู้ขายยกเลิก"),
    ADMIN_CANCEL_PAYMENT(8, "admin_cancel_payment", "Admin cancel", "ผู้ขายยกเลิก"),
    ADMIN_CANCEL_SHIPMENT(9, "admin_cancel_shipment", "Admin cancel", "ผู้ขายยกเลิก");

    private int statusId;
    private String statusName;
    private String enDesc;
    private String thDesc;

    SellStatusEnumMapping(int statusId, String statusName, String enDesc, String thDesc) {
        this.statusId = statusId;
        this.statusName = statusName;
        this.enDesc = enDesc;
        this.thDesc = thDesc;
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

    public static SellStatusEnumMapping getByDesc(String desc){
        if("Fill seller detail".equalsIgnoreCase(desc) || "รายละเอียด".equals(desc)){
            return FILL_USER_DETAIL;
        } else if ("Waiting seller".equalsIgnoreCase(desc) || "รอผู้ขาย".equals(desc)){
            return WAITING_SELLER;
        } else if ("Payment".equalsIgnoreCase(desc) || "จ่ายเงิน".equals(desc)){
            return  PAYMENT;
        } else if ("Shipment".equalsIgnoreCase(desc) || "ส่งของ".equals(desc)) {
            return SHIPMENT;
        } else if ("Finish".equalsIgnoreCase(desc) || "เสร็จ".equals(desc)) {
            return FINISH;
        } else if ("User cancel".equalsIgnoreCase(desc) || "ผู้ซื้อยกเลิก".equals(desc)) {
            return USER_CANCEL;
        } else if ("Admin cancel".equalsIgnoreCase(desc) || "ผู้ขายยกเลิก".equals(desc)) {
            return ADMIN_CANCEL_WAITING_SELLER;
        }
        return null;
    }
}
