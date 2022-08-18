package BookStore;

public class Book
{
    private int iSBNNo;
    private String title;
    private String description;
    private int price;


   /* public Book(int iSBNNo, String title, String description, int price) {
        this.iSBNNo = iSBNNo;
        this.title = title;
        this.description = description;
        this.price = price;
    } */

    public int getiSBNNo() {
        return iSBNNo;
    }

    public void setiSBNNo(int iSBNNo) {
        this.iSBNNo = iSBNNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void displayBookDetails()
    {
        System.out.println("ISBN Number : " +getiSBNNo());
        System.out.println("Title : " +getTitle());
        System.out.println("Description : " +getDescription());
        System.out.println("Price : " +getPrice());

    }

    public String toString()
    {
        return "ISBN : " +iSBNNo +" " +"Title : " +title + "" + "Description : " +description + " " + "Price : " +price;

    }

}
