abstract class Beverage{
    private void pour(int qty){
        System.out.println("Add"+ qty + "ml of beverage");
    }
    
    protected abstract void addContiment();
    protected void stir(){ }; //hook
    private void serve(){
        System.out.println("Serve through waiter");
    }
    
    
   public final void templateMethod(int qty){
        pour(qty);
        addContiment();
        stir();
        serve();
    }
}