class Main{
    public static void main(String args[]){
        Offering offering = new Coffee();
        //Offering offering = new Tea();
        //Offering offering = new IceCream();
        offering = new Rum(offering);
        offering = new Rum(offering);
        offering = new Soda(offering);
        offering = new Gin(offering);
        System.out.println(offering.getName()+ " " + offering.getPrice());
    }
}