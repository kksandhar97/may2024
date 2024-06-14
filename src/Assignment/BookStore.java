package Assignment;

public class BookStore {
    String title;
    String Author;
    int price;
    int quantity;

    public BookStore(String title, String author, int price, int quantity) {
        this.title = title;
        Author = author;
        this.price = price;
        this.quantity = quantity;
    }
    public static double calculateBookprice(int price,int quantity){
        return price * quantity;
    }
    public void bookDetails(){
        System.out.println("Author name: " + this.Author);
        System.out.println("Title: " + this.title );
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Quantity in stock:" + calculateBookprice(this.price , this.quantity));
    }
}
