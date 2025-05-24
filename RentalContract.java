public class RentalContract {
    private String conTractID;
    private double rentAmount;
    private String tenantID;
    private String propertyID;
    public RentalContract(String conTractID, double rentAmount, String tenantID, String propertyID) {
        this.conTractID = conTractID;
        this.rentAmount = rentAmount;
        this.tenantID = tenantID;
        this.propertyID = propertyID;

    }
    public String getConTractID() {
        return conTractID;
    }
    public void setConTractID(String conTractID) {
        this.conTractID = conTractID;
    }
    public double getRentAmount() {
        return rentAmount;
    }
    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }
    public String getTenantID() {
        return tenantID;
    }
    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }
    public String getPropertyID() {
        return propertyID;
    }
    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    @Override
    public String toString() {
        return "RentalContract{" +
                "conTractID='" + conTractID + '\'' +
                ", rentAmount=" + rentAmount +
                ", tenantID='" + tenantID + '\'' +
                ", propertyID='" + propertyID + '\'' +
                '}';
    }
}
