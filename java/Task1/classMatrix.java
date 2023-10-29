package java.Task1;

public class classMatrix<T> implements matrix<T> {
    public T[][] matrix;
    public int line;
    public int column;

    public classMatrix(int line, int column) {
        this.line = line;
        this.column = column;
        this.matrix = (T[][]) new Object[line][column];
    }

    public classMatrix(T[][] matrix) {
        this.line = matrix.length;
        this.column = matrix[0].length;
        this.matrix = matrix;
    }

    @Override
    public T get(int line, int column) {
        return matrix[line][column];
    }

    @Override
    public void add(T num, int line, int column) {
        this.matrix[line][column] = num;
    }

    @Override
    public void remove(int line, int column) {
        this.matrix[line][column] = null;
    }
}
