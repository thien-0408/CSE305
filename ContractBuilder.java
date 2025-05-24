 public  class ContractBuilder implements Contract {
    protected String contractID;
    protected String propertyID;
    protected String tenantID;
    protected double rentAmount;

     @Override
     public void BuildContractID(String id) {
         contractID = id;
     }

     @Override
     public void BuildPropertyID(String id) {
         propertyID = id;
     }

     @Override
     public void BuildTenantID(String id) {
         tenantID = id;
     }

     @Override
     public void BuildRentAmount(double amount) {
         rentAmount = amount;
     }

     @Override
     public RentalContract SignContract(String type) {
         return new RentalContract(contractID, rentAmount, tenantID, propertyID);
     }
 }