package java.Task1;

public interface matrix<T> {
    T get(int line, int colomn);

    void add(T num, int line, int column);

    void remove(int line, int column);
}
