package decorator;

public class SportyDress extends DressDecorator {
    /**
     * Instantiates a new Dress decorator.
     *
     * @param c the c
     */
    SportyDress(Dress c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding sporty dress features");
    }
}
