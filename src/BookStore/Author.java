package BookStore;

public class Author extends Book
{
    private String authorName;
    private String authorPenName;

   /* public Author(int iSBNNo, String title, String description, int price, String authorName, String authorPenName) {
        super(iSBNNo, title, description, price);
        this.authorName = authorName;
        this.authorPenName = authorPenName;
    }

    */

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorPenName() {
        return authorPenName;
    }

    public void setAuthorPenName(String authorPenName) {
        this.authorPenName = authorPenName;
    }

    public void displayBookDetails()
    {
        System.out.println("Author Name : " +getAuthorName());
        System.out.println("AuthorPenName : " +getAuthorPenName());

    }

    public String toString()
    {
        return "Author Name : " +authorName + " " + " Author PenName : " +authorPenName;

    }
}
