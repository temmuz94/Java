package class29.class28;

public class Entry {

    public Entry(int key, String value) {
        this.key = key;
        this.value = value;
    }

    int key;
        String value;
        public int getKey(){
            return key;

    }public String getValue(){
            return value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
