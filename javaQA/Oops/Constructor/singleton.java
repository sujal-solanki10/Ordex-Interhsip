
class singleton {

    private static singleton singleInstance = null;

    private singleton() {
        System.out.println("Single Instance Created !!");
    }

    public static singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new singleton();
        }
        return singleInstance;
    }

    public static void main(String[] args) {

        singleton s1 = singleton.getInstance();
        singleton s2 = singleton.getInstance();

        if (s1 == s2) {
            System.out.println("Both Aare same");
        }else{
            System.out.println("Diff");
        }

    }
}
