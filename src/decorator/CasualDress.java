package decorator;

public class CasualDress extends DressDecorator {
    /**
     * Instantiates a new Dress decorator.
     *
     * @param c the c
     */
    CasualDress(Dress c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding casual dress features");
    }
}
