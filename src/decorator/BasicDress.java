package decorator;

/**
 * The type Basic dress.
 */
public class BasicDress implements Dress {
    @Override
    public void assemble() {
        System.out.println("Basic Dress Features");
    }
}
