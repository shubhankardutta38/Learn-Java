
class Item {
    private String desc;
    private double price;

    public Item() {
    }

    public Item(String desc, double price) {
        this.desc = desc;
        this.price = price;
    }

    public void display() {
        System.out.println("Item: " + desc + ", Price: $" + price);
    }
}

class Shirt extends Item {
    private char size;
    private char colorCode;

    public Shirt(double price, char size, char colorCode) {
        super("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Size: " + size + ", Color Code: " + colorCode);
    }

    public String getColor() {
        String color;
        switch (colorCode) {
            case 'R':
                color = "Red";
                break;
            case 'B':
                color = "Blue";
                break;
            case 'G':
                color = "Green";
                break;
            // Add more colorCode/color combinations as needed
            default:
                color = "Unknown";
        }
        return color;
    }
}

public class Shpcart {
    public static void main(String[] args) {
        // Exercise 12-1
        Shirt shirt1 = new Shirt(25.99, 'L', 'R');
        shirt1.display(); // This will display the shirt details (item, price, size, colorCode)

        // Exercise 12-2
        Shirt shirt2 = new Shirt(19.99, 'M', 'B');
        shirt2.display(); // This will display the shirt details (item, price, size, colorCode)

        // Exercise 12-3
        Item shirt3 = new Shirt(14.99, 'S', 'G');
        shirt3.display(); // This will display the shirt details (item, price, size, colorCode)

        if (shirt3 instanceof Shirt) {
            Shirt shirtObj = (Shirt) shirt3;
            String color = shirtObj.getColor();
            System.out.println("Color: " + color);
        } else {
            System.out.println("The item is not a shirt.");
        }

        // Testing non-Shirt object condition
        Item item = new Item("Some Item", 9.99);
        item.display(); // This will display the item details (desc, price)

        if (item instanceof Shirt) {
            Shirt shirtObj = (Shirt) item;
            String color = shirtObj.getColor();
            System.out.println("Color: " + color);
        } else {
            System.out.println("The item is not a shirt.");
        }
    }
}
