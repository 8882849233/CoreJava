package decorator;

public class FancyDress extends DressDecorator {
    /**
     * Instantiates a new Dress decorator.
     *
     * @param c the c
     */
    FancyDress(Dress c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Fancy dress features");
    }
}
