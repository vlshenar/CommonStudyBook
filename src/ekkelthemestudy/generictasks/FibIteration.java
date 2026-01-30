package ekkelthemestudy.generictasks;

import java.util.Iterator;

//адаптер для Fibanachi, реализующий Iterable
//путем композиции

public class FibIteration implements Iterable<Integer> {
    private final int limit;
    private Fibanachi fib;

    public FibIteration(int lim) {
        this.limit = lim;
    }
    @Override
    public Iterator<Integer> iterator() {
        fib = new Fibanachi();
        return new FibIterator();
    }

    class FibIterator implements Iterator<Integer> {
        private int currentPoint = 0;
        @Override
        public boolean hasNext() {
            return currentPoint <= limit;
        }

        @Override
        public Integer next() {
            currentPoint++;
            return FibIteration.this.fib.next();
        }
    }
}
