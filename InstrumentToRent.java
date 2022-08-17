package cw2;

public class InstrumentToRent extends Instrument{
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;
    //constructor  method//
    public InstrumentToRent(int chargePerDay , String instrumentName) {
        super(instrumentName);
        this.chargePerDay = chargePerDay;
        this.dateOfRent = "";
        this.dateOfReturn = "";
        this.noOfDays = 0;
        this.isRented = false;
    }
    //getter method//
    public int getChargePerDay(){
        return chargePerDay;
    }
    //setter method//
    public void setChargePerDay(int chargePerDay){
        this.chargePerDay = chargePerDay;
    }
    //getter method//
    public String getDateOfRent(){
        return dateOfRent;
    }
    //setter method//
    public void setDateOfRent(String dateOfRent){
        this.dateOfRent = dateOfRent;
    }
    //getter method//
    public String getDateOfReturn(){
        return dateOfReturn;
    }
    //setter method//
    public void setDateOfReturn(String dateOfReturn){
        this.dateOfReturn = dateOfReturn;
    }
    //getter method//
    public int getNoOfDays(){
        return noOfDays;
    }
    //setter method//
    public void setNoOfDays(int noOfDays){
        this.noOfDays = noOfDays;
    }
    //getter method//
    public boolean getIsRented(){
        return isRented;
    }
    //setter method//
    public void setIsRented(boolean isRented){
        this.isRented = isRented;
    }

    //rentout method//

    public void toRentOut(String customerName, String customerPhoneNumber,int customerPAN,String dateOfRent, String dateOfReturn, int noOfDays ){
        if (isRented == true){
            System.out.println("This instrument is rented at the moment");
            System.out.println("Name of the person who rented the instrument is "+getCustomerName());
            System.out.println("Phone number of the customer is "+getCustomerPhoneNumber());
            System.out.println("This instrument will be returned on "+this.dateOfReturn);
        } else {
            setCustomerName(customerName);
            setCustomerPhoneNumber(customerPhoneNumber);
            setCustomerPAN(customerPAN);
            this.dateOfRent = dateOfRent;
            this.dateOfReturn = dateOfReturn;
            this.noOfDays = noOfDays;
            setIsRented(true);
            display();
            System.out.println("Total charge is "+ getNoOfDays() * getChargePerDay());
        }
    }
    //to return method//
    public void toReturn(){
        if (isRented == false){
            System.out.println("cw2.Instrument has not yet been rented");
        } else {
            setCustomerName("");
            setCustomerPhoneNumber("");
            setDateOfReturn("");
            setCustomerPAN(0);
            setDateOfRent("");
            setNoOfDays(0);
            setIsRented(false);
        }
    }
    //display method//
    public void display(){
        super.display();
        if (isRented == true){
            System.out.println("Return Date is "+ getDateOfReturn());
            System.out.println("Date of renting is "+ getDateOfRent());
            System.out.println("Number of days rented is "+ getNoOfDays());
        }
    }

}
