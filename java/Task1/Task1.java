package java.Task1;

public class Task1 {
    public static void main(String[] args) {
        IntSequence first = IntSequence.of(1, 2, 3, 4, 5);
        while (first.hasNext()) {
            System.out.println(first.next());
        }
        //System.out.println(first.next());
        IntSequence second = IntSequence.constant(7);
        for (int i = 0; i < 5; ++i) {
            System.out.println(second.next());
        }
    }
}

interface IntSequence {

    boolean hasNext();

    int next();

    static IntSequence of(int... n) {
        IntSequence intSequence = new IntSequence() {
            int index = 0;

            @Override
            public boolean hasNext() {
                if (index < n.length) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public int next() {
                if (index < n.length) {
                    return n[index++];
                } else {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
        };
        return intSequence;
    }

    static IntSequence constant(int n) {
        IntSequence intSequence = new IntSequence() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                return n;
            }
        };
        return intSequence;
    }
}