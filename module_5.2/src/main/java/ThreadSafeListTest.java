import java.util.ArrayList;
import java.util.List;

class SafeList<T> {
    private final List<T> list = new ArrayList<>();

    public synchronized void add(T element) {
        list.add(element);
        System.out.println("Added: " + element);
    }

    public synchronized int size() {
        return list.size();
    }

    public synchronized T remove(int index) {
        if (index < list.size()) {
            T removed = list.remove(index);
            System.out.println("Removed: " + removed);
            return removed;
        }
        return null;
    }
}

class ListWorker extends Thread {
    private final SafeList<String> list;

    public ListWorker(SafeList<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        list.add(Thread.currentThread().getName());
        if (list.size() > 2) {
            list.remove(0);
        }
    }
}

public class ThreadSafeListTest {
    public static void main(String[] args) {
        SafeList<String> sharedList = new SafeList<>();

        for (int i = 0; i < 10; i++) {
            new ListWorker(sharedList).start();
        }
    }
}

