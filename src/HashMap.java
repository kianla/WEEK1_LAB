class Node<Integer,LinkList> {

    Integer key;
    LinkList value;
    Node<Integer,LinkList> next;

    public Node(Integer key, LinkList value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

// HashMap class that implements

class HashMap<Integer,LinkList>  {

    int capacity;

    int size;
    Node<Integer,LinkList>[] table;

    // Constructor that initializes
    //the fields with given parameters
    //and creates a new array of nodes
    public HashMap(int capacity) {
        this.capacity = capacity;

        this.size = 0;
        this.table = new Node[capacity];
    }

    // Hash function that calculates
    //the index of a key in the array
    private int hash(int key) {
        return key % capacity;
    }
    public LinkList put(Integer key, LinkList.Node node) {

        if (key == null) {
            throw new NullPointerException("Key cannot be null");
        }
        // Calculate the hash value of the key and use it to access the index
        int index = hash((java.lang.Integer) key);
        Node<Integer,LinkList> node = table[index];
        // If the index is empty, create a new node and store it in the array
        if (node == null) {
            table[index] = new Node<Integer,LinkList>(key, value);
            size++;
        } else {
            // If the index is not empty, traverse the linked list of nodes
            Node<Integer,LinkList> prev = null;
            while (node != null) {
                // If a node with the same key is found, update its value and return the old value
                if (node.key.equals(key)) {
                    LinkList oldValue = node.value;
                    node.value = value;
                    return oldValue;
                }
                prev = node;
                node = node.next;
            }
            // If no node with the same key is found, create a new node and append it to the list
            prev.next = new Node<Integer,LinkList>(key, value);
            size++;
        }

        // Return null if no old value was replaced
        return null;
    }

    // Get method that returns the value associated with a given key in the HashMap
    public LinkList get(Integer key) {
        // Check if the key is null and throw an exception
        if (key == null) {
            throw new NullPointerException("Key cannot be null");
        }
        // Calculate the hash value of the key and use it to access the index
        int index = hash((java.lang.Integer) key);
        Node<Integer,LinkList> node = table[index];
        // If the index is empty, return null
        if (node == null) {
            return null;
        } else {
            // If the index is not empty, traverse the linked list of nodes
            while (node != null) {
                // If a node with the same key is found, return its value
                if (node.key.equals(key)) {
                    return node.value;
                }
                node = node.next;
            }
            // If no node with the same key is found, return null
            return null;
        }
    }

    // Other methods for the HashMap class ...
}
