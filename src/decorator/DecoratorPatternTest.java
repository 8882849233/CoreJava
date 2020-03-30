package decorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {

        Dress sportyDress = new SportyDress(new BasicDress());
        sportyDress.assemble();
        System.out.println();

        Dress casualDress = new CasualDress(new BasicDress());
        casualDress.assemble();
        System.out.println();

        Dress dress = new FancyDress(new CasualDress(new BasicDress()));
        dress.assemble();
        System.out.println();
    }


}
