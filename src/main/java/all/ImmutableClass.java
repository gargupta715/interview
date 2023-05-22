import java.util.HashMap;
import java.util.Map;

public final class ImmutableClass {

    // The class must be declared as final so that child classes can’t be created.
    //Data members in the class must be declared private so that direct access is not allowed.
    //Data members in the class must be declared as final so that we can’t change the value of it after object creation.
    //A parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified with an object reference.
    //Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference)

    private final String name;
    Object t;
    private final int regNo;
    private final Map<String, String> metadata;
    public ImmutableClass(String name, int regNo, Map<String, String> metadata) {
        // This keyword refers to current instance itself
        this.name = name;
        this.regNo = regNo;

        // Creating Map object with reference to HashMap
        // Declaring object of string type
        Map<String, String> tempMap = new HashMap<>();

        // Iterating using for-each loop
        for (Map.Entry<String, String> entry :
                metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }

        this.metadata = tempMap;
    }


    // Method 1
    public String getName() { return name; }

    // Method 2
    public int getRegNo() { return regNo; }


    // Method 3
    // User -defined type
    // To get meta data
    public Map<String, String> getMetadata()
    {

        // Creating Map with HashMap reference
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry :
                this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}
