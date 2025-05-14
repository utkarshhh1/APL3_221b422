class main {
    public static void main(String args[]) {
        // Creating an object of Mother
        Mother m = new Mother();
        m.show();  // Calling show() of Mother

        // Creating an object of Child
        Child ch = new Child();
        ch.show();  // Calling overridden show() of Child
    }
}