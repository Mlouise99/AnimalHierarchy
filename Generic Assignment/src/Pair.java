import java.util.Objects;

public class Pair <K,V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        try{
            if (key == null || value == null) {
                throw new IllegalArgumentException("Key and value cannot be null");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {

        return
                "(Key: " + key + ", Value: " + value + ")";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (!key.equals(pair.key)) return false;
        return value.equals(pair.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
    // Static factory method
    public static <K, V> Pair<K, V> create(K key, V value) {
        return new Pair<>(key, value);
    }
}
