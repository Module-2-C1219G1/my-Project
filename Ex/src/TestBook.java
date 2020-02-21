public class TestBook {
    public static void main(String[] args) {

        ProgrammingBook programmingBook1 = new ProgrammingBook(1,"program1",50000,"maria carley","java","GWT");
        ProgrammingBook programmingBook2 = new ProgrammingBook(2,"program2",50000,"maria carley","java","GWT");
        ProgrammingBook programmingBook3 = new ProgrammingBook(3,"program3",50000,"maria carley","java","GWT");

        FictionBook fictionBook1 = new FictionBook(4,"theNull",60000,"John Carter","Horror");
        FictionBook fictionBook2 = new FictionBook(5,"Sherlock Holmes",64000,"Conan Doyle","detective");
        FictionBook fictionBook3 = new FictionBook(6,"howl moving castle",70000,"Gihibli","Cartoon");
        Book[] library = {programmingBook1,programmingBook2,programmingBook3,fictionBook1,fictionBook2,fictionBook3};
        double result =0;
        for (Book book:library) {
            result = result +  book.getPrice();
        }
        System.out.println("amount: "+Book.amountBook);
        System.out.println("price: "+result );


    }
}
