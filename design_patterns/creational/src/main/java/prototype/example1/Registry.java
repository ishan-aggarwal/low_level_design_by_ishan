package prototype.example1;

public interface Registry<K, V> {

    void register(K key, V value);

    V get(K key);

}
