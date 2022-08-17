package cw2;

public class InstrumentToSell extends  Instrument {
    private int price;
    private String sellDate;
    private int discountPercent;
    private boolean isSold;
    //constructor method//
    public InstrumentToSell(String instrumentName, int price){
        super(instrumentName);
        this.price = price;
        this.sellDate = "";
        this.discountPercent = 0;
        this.isSold = false;
    }
    //getter method//
    public int getPrice(){

        return price;
    }

    public void setPrice(int price){//setter method//
        if (isSold == true){
            System.out.println("This instrument is already sold and thus it is not possible to change the price.");
        } else{
            this.price = price;
        }
    }
    //getter method//
    public String getSellDate(){
        return sellDate;
    }
    //setter method//
    public void setSellDate(String sellDate){
        this.sellDate = sellDate;
    }
    //getter method//
    public int getDiscountPercent(){
        return discountPercent;
    }
    //setter method//
    public void setDiscountPercent(int discountPercent){
        this.discountPercent = discountPercent;
    }
    //getter method//
    public boolean getIsSold(){
        return isSold;
    }
    //setter method//
    public void setIsSold(boolean isSold){
        this.isSold = isSold;
    }
    //to shell method//
    public void toSell(String customerName, String customerPhoneNumber, int customerPAN, String sellDate, int discountPercent){
        if(isSold == true){
            System.out.println("cw2.Instrument is already sold");
            System.out.println("Customer name is "+getCustomerName());
            System.out.println("Customer phone number is "+getCustomerPhoneNumber());
            System.out.println("Customer PAN number is "+getCustomerPAN());
        }else {
            setCustomerName(customerName);
            setCustomerPhoneNumber(customerPhoneNumber);
            setCustomerPAN(customerPAN);
            setSellDate(sellDate);
            setDiscountPercent(discountPercent);
            setIsSold(true);
            price = this.price - this.price * discountPercent / 100;
            display();
        }
    }
    // display method//
    public void display(){
        super.display();
        System.out.println("Discount percent is "+ getDiscountPercent());

        System.out.println("Discounted price is  "+ price);
        if (isSold == true) {
            System.out.println("Sell Date is " + getSellDate());
        }
    }

}
