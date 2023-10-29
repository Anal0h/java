package java.Task2;

public class Tuple<E> {
    private E[] el;
    private int size;

    public Tuple(int capacity) {
        el = (E[]) new Object[capacity];
        size = 0;
    }

    public E get(int index) {
        try {
            return el[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Элемента с таким индексом нет");
            return null;
        }
    }

    public void add(E num) {
        try {
            ++size;
            for (int i = 0; i < size; ++i) {
                if (el[i] == null) {
                    this.el[i] = num;
                    break;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Массив уже полон");
        }
    }

    public void add(E num, int index) {
        try {
            if (this.el[index] == null) {
                ++size;
            }
            this.el[index] = num;
            ++size;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Элемента с таким индексом нет");
        }
    }

    public void remove(int index) {
        try {
            if (this.el[index] != null) {
                this.el[index] = null;
                if (size == index) {
                    for (int i = index; i >= 0; --i) {
                        if (this.el[i] == null) {
                            --size;
                        } else {
                            break;
                        }
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Элемента с таким индексом нет");
        }
    }

    public void remove(E num) {
        for (int i = 0; i < size; i++) {
            if (el[i] == num) {
                el[i] = null;
                break;
            }
        }
        for (int i = size - 1; i >= 0; --i) {
            if (this.el[i] == null) {
                --size;
            } else {
                break;
            }
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E orElse(int index, E num) {
        try {
            if (index >= 0 && el[index] != null) {
                return el[index];
            } else {
                return num;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Элемента с таким индексом нет");
            return num;
        }
    }
}
