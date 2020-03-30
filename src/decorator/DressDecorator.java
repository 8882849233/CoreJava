package decorator;

/**
 * The type Dress decorator.
 */
public class DressDecorator implements Dress {
    /**
     * The Dress.
     */
    protected Dress dress;

    /**
     * Instantiates a new Dress decorator.
     *
     * @param c the c
     */
    DressDecorator(Dress c) {
        this.dress = c;
    }

    @Override
    public void assemble() {
        this.dress.assemble();
    }
}
