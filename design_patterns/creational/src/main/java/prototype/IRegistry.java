package prototype;

public interface IRegistry<K, V> {

    void register(K key, V value);

    V get(K key);

}
