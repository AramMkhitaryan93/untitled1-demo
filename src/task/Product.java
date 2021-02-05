package task;

public class Product {
    private String name;
    private String uniqueId = "P0";
    private static int count = 1;
    private int weight;
    private int value;

    public Product(String name, int weight, int value) {
        this.name = name;
        this.uniqueId = uniqueId + count;
        count++;
        setWeight(weight);
        setValue(value);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0 && weight < 100) {
            this.weight = weight;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value > 0 && value < 100000) {
            this.value = value;
        }
    }

}
