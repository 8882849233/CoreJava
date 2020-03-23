package com.shubh.stack;

/**
 * The interface Stack.
 *
 * @param <T> the type parameter
 */
public interface StackInterface<T> {

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    public boolean isEmpty();

    /**
     * Pop t.
     *
     * @return the t
     */
    public T pop();

    /**
     * Peek t.
     *
     * @return the t
     */
    public T peek();

    /**
     * Push.
     *
     * @param t the t
     */
    public void push(T t);

    /**
     * Clear.
     */
    public void clear();
}
