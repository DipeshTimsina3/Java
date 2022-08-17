package cw2;

public class Instrument {

    private static int instrumentID;
    private String instrumentName;
    private String customerName;
    private String customerPhoneNumber;
    private int customerPAN;
    //constructor  method//
    public Instrument(String instrumentName){
        this.instrumentName = instrumentName;
        this.customerName = "";
        this.customerPhoneNumber= "";
        this.customerPAN = 0;
        instrumentID++;
    }
    //getter method//
    public int getInstrumentID(){
        return instrumentID;
    }
    //setter method//
    public void setInstrumentID(int instrumentID){
        this.instrumentID = instrumentID;
    }
    //getter method//
    public String getInstrumentName(){
        return instrumentName;
    }
    //setter method//
    public void setInstrumentName(String instrumentName){
        this.instrumentName = instrumentName ;
    }
    //getter method//
    public String getCustomerName(){
        return customerName;
    }
    //setter method//
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    //getter method//
    public String getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }
    //setter method//
    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }
    //getter method//
    public int getCustomerPAN(){
        return customerPAN;
    }
    //setter method//
    public void setCustomerPAN(int customerPAN){
        this.customerPAN = customerPAN;
    }
    //display method//
    public void display(){
        System.out.println("cw2.Instrument ID is "+getInstrumentID());
        System.out.println("cw2.Instrument name is "+ getInstrumentName());
        if ( customerName == "" || customerPhoneNumber == "" || customerPAN == 0){

        } else {
            System.out.println("Customer name is "+ getCustomerName());
            System.out.println("Mobile number is "+ getCustomerPhoneNumber());
            System.out.println("PAN number is "+ getCustomerPAN());
        }

    }
}
