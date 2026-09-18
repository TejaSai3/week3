class IdCard {
    String name;
    int booksIssued;

    public IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }
}

public class MainM4 {
    public static void main(String[] args) {
        IdCard ravi = new IdCard("Ravi", 0);
        IdCard duplicate = ravi; // Reference copy pointing to the same object[cite: 1]

        duplicate.booksIssued = 3;

        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));

        IdCard separate = new IdCard("Ravi", 3); // Distinct object with identical values[cite: 1]
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}