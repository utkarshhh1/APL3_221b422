class Application {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show();  // Calls Mother's show()

        Child ch = new Child();
        ch.show();  // Calls Child's show()

        // Polymorphism: Mother reference, Child object
        Mother m1 = new Child();
        m1.show();  // Calls Child's show() (polymorphism in action)
    }
}