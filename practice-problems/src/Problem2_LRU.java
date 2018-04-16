import java.sql.Timestamp;
import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

/**
 * LRU (Least Recently Used) cache with a max capacity, with LRU element replaced when capacity reached
 */

public class Problem2_LRU<T> {
    int MAX_CAPACITY;
    PriorityQueue<TimestampedData> cache;


    public Problem2_LRU(int capacity) {
        MAX_CAPACITY = capacity;

        cache = new PriorityQueue<>(this.getComparator());
    }

    public void add(T e) {

        for (TimestampedData cacheItem : cache) {
            if (cacheItem.data.equals(e)) {
                cache.remove(cacheItem);
                cacheItem.updateTimestamp();
                cache.add(cacheItem);
                return;
            }
        }

        if (cache.size() == MAX_CAPACITY) {
            cache.remove(cache.peek());
        }

        TimestampedData<T> elem = new TimestampedData<>(e);
        cache.add(elem);
    }

    private Comparator<TimestampedData> getComparator() {
        return new Comparator<TimestampedData>() {
            @Override
            public int compare(TimestampedData t1, TimestampedData t2) {
                return t1.timestamp.compareTo(t2.timestamp);
            }
        };
    }

    public String toString() {
        return cache.toString();
    }


    private class TimestampedData<T> {
        T data;
        Timestamp timestamp;

        public TimestampedData(T data) {
            this.data = data;
            this.timestamp = new Timestamp(System.currentTimeMillis());
        }

        public void updateTimestamp() {
            this.timestamp = new Timestamp(System.currentTimeMillis());
        }

        public void updateTimestamp(long time) {
            this.timestamp = new Timestamp(System.currentTimeMillis());
        }

        @Override
        public String toString() {
            return "Data: " + this.data.toString() + ", Time: " + this.timestamp.toString();
        }

    }



}