public class Main {

    public static void main(String[] args) {
     
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();
        
       
        System.out.println(arjun.describe());
        System.out.println(arjun.fight());
        System.out.println(((Pandav) arjun).obey());
        System.out.println(((Pandav) arjun).kind());

        System.out.println("\n");

       
        System.out.println(bheem.describe());
        System.out.println(bheem.fight());
        System.out.println(((Pandav) bheem).obey());
        System.out.println(((Pandav) bheem).kind());

        System.out.println("\n");

        
        System.out.println(duryodhan.describe());
        System.out.println(duryodhan.fight());
        System.out.println(((Kaurav) duryodhan).disobey());
        System.out.println(((Kaurav) duryodhan).cruel());

        System.out.println("\n");

       
        System.out.println(vikarn.describe());
        System.out.println(vikarn.fight());
    }
}

