package BookStore;

public class BookImpl
{

    public static void main(String[] args)
    {
        //Book book = new Book(1234,"title","Sci-Fi",1000);

        //Author author = new Author(1234,"title","Scifi",1000,"Abhi","Shek");

        BookImpl bookImpl = new BookImpl();


        Book book=new Book();
        Author author=new Author();

        book.setiSBNNo(1234);
        book.setDescription("Sci-fi");
        book.setTitle("TITLE");
        book.setPrice(1000);

        author.setAuthorName("Abhi");
        author.setAuthorPenName("Shek");

        System.out.println(book.toString());
        System.out.println(author.toString());

        // public void displayBookDetails()
       // {
        //    System.out.println();

       // }

        System.out.println(book.displayBookDetails());
        System.out.println(author.displayBookDetails());


    }
}
