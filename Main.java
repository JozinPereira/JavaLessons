package Lesson14;

public class Main {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.putProducts("Apple", 2);
        holodilnik.putProducts("Pear", 1);
        holodilnik.putProducts("Plum", 3);
        holodilnik.putProducts("Apple", 6);
        holodilnik.putProducts("Banana", 8);

        holodilnik.printAllProducts();
        holodilnik.getProduct("Pineapple", 2);
        holodilnik.printAllProducts();

        holodilnik.printAllNetto();

        holodilnik.getProductsInOrder();
        holodilnik.productWithMaxAmount();
        holodilnik.productWithMinAmount();
        holodilnik.productAmount("Pear");
        holodilnik.getMinSet(7);
        holodilnik.productAmount("Pineapple");
        holodilnik.productAmount("Pear");
    }
}
