import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleHashTableTest {

    @Test
    void testPutAndGet() {
        SimpleHashTable<String, Integer> hashTable = new SimpleHashTable<>();
        hashTable.put("one", 1);
        hashTable.put("two", 2);
        hashTable.put("three", 3);

        System.out.println("Value for 'one': " + hashTable.get("one"));
        System.out.println("Value for 'two': " + hashTable.get("two"));
        System.out.println("Value for 'three': " + hashTable.get("three"));

        assertEquals(1, hashTable.get("one"));
        assertEquals(2, hashTable.get("two"));
        assertEquals(3, hashTable.get("three"));
    }

    @Test
    void testRemove() {
        SimpleHashTable<String, Integer> hashTable = new SimpleHashTable<>();
        hashTable.put("one", 1);
        hashTable.put("two", 2);
        hashTable.put("three", 3);

        hashTable.remove("two");
        System.out.println("Value for 'two' after removal: " + hashTable.get("two"));

        assertNull(hashTable.get("two"));
    }
}
