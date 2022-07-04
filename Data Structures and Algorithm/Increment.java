public class Increment {
    public static void main(String[] args) {
        int a = 7;
        a = 7 + (a++ + ++a + --a + a--);
        System.out.println(a);
    }
}
