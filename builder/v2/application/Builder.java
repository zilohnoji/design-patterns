package builder.v2.application;

public interface Builder<E> {

    E build();

    void reset();
}