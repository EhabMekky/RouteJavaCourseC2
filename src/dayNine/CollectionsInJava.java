package dayNine;

import java.util.*;

public class CollectionsInJava {
    // Arrays are fixed size — once created, you can’t resize them.
    // Collections are dynamic, more powerful, and come with built-in utility methods.
    public static void main(String[] args) {
        String[] names = new String[3]; // Fixed size array => save memory => 3 elements
        names[0] = "Nourhan";
        names[1] = "Mamhmoud";
        names[2] = "Ahmed";
        //names[3] = "Ehab"; // This will throw ArrayIndexOutOfBoundsException

        //Collections solve this problem => add, remove, search, sort
        /*
              Collection Interface
                       |
           -------------------------------
           |             |              |
         List           Set           Queue
      (ArrayList...) (HashSet...)   (LinkedList...)

      Map Interface (separate hierarchy)
                 |
      HashMap, TreeMap, LinkedHashMap
         */

        /*
        - **Collection** — base for List, Set, Queue
        - **List** — ordered, allows duplicates
        - **Set** — no duplicates, no index
       - **Queue** — FIFO order (e.g., LinkedList, PriorityQueue)
       - **Map** — key–value pairs (e.g., HashMap)
         */

        //arrayListDemo();
        //hashSetDemo();
        //hashMapDemo();
        listDemo();
        //queueDemo();
        /*
        Scenario	                        Best Choice
        ______________________________________________
        You need a simple resizable list	ArrayList
        You need to store unique elements	HashSet
        You need fast key-based lookups	    HashMap
        You need sorted unique elements	    TreeSet or  TreeMap
        You need queue-like behavior	    LinkedList or PriorityQueue
         */
    }

    //ArrayList
    public static void arrayListDemo(){
        ArrayList<String> students = new ArrayList<>(); //No size limit
        students.add("Hazem");
        students.add("Salwa");
        students.add("Nourhan");
        students.add("Lora");
        students.add("Hazem"); // Allows duplicates

        System.out.println(students);
        System.out.println(students.get(3)); // Access by index

        students.remove(1); // Remove by index
        //students.remove("Hazem"); // Remove by value (first occurrence)
        System.out.println(students);

        students.add(1, "Salwa"); // Add at specific index
        System.out.println(students);

        for(String student : students){
            System.out.println(student);
        }

        students.forEach(System.out::println); // Method reference => Lambda expression

        System.out.println("Contains Sara? " + students.contains("Sara")); // Search

        System.out.println(students.iterator());

        /*
         - Dynamic sizing ✅
         - Methods: `add()`, `get()`, `remove()`, `size()`, `contains()`.
         - Enhanced for-loop works seamlessly.
         */
    }

    //HashSet (No duplicates)
    public static void hashSetDemo()
    {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red"); // Duplicate, will be ignored
        colors.add("Yellow");
        System.out.println(colors); // No guaranteed order
        //System.out.println(colors.get(3)); // No index access, will cause error
        // Good for checking uniqueness quickly
    }

    //HashMap
    public static void hashMapDemo()
    {
        HashMap<Integer, String> idToName = new HashMap<>();
        idToName.put(1, "Route");
        idToName.put(6, "Route");
        idToName.put(5, "Nourhan");
        idToName.put(4, "Ahmed");
        idToName.put(7, "Salwa");
        System.out.println(idToName);
        System.out.println(idToName.get(3)); // Access by key
        idToName.remove(2); // Remove by key
        System.out.println(idToName);
        System.out.println(idToName.containsKey(5)); // Search by key
        System.out.println(idToName.containsKey("Ehab")); // Search by value

        //idToName.forEach((key, value) -> System.out.println(key + " -> " + value)); // Lambda expression

        // Iterate over keys not values
        for(int key : idToName.keySet()) // iterate over keys using primitive type
        {
            System.out.println("ID " + key + " is " + idToName.get(key));
        }

        idToName.putIfAbsent(8, "Ehab"); // Add only if key 8 is absent
        System.out.println(idToName);
    }

    //List => ArrayList, LinkedList, Vector, Stack
    public static void listDemo(){
        LinkedList fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);
        System.out.println(fruit.remove());
        System.out.println(fruit);
    }

    // LinkedList  - PriorityQueue
    public static void queueDemo() {
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
        System.out.println(fruit.size());
        System.out.println(fruit);
        fruit.remove(); // removes the head (first element) FiFo
        System.out.println(fruit);
        System.out.println("Peek: ");
        System.out.println(fruit.peek()); // shows duplicate of head without removing it
    }
}
