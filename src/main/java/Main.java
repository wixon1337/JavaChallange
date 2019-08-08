public class Main {
    public static void main(String[] args) {
        Telescope n = new NewtonTelescope(1.2, 2, 3.3);
        Telescope r = new RefactorTelescope(1.3, 3, 4);
        System.out.println(n);
        System.out.println(r);
    }
}
