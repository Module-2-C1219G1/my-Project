public class ProgrammingBook extends Book {
    private String language;
    private String frameWork;

    public ProgrammingBook() {
        amountBook++;
    }

    public ProgrammingBook(String frameWork, String language) {
        this.frameWork = frameWork;
        amountBook++;
    }

    public ProgrammingBook(int bookCode, String name, double price, String author, String language, String frameWork) {
        super(bookCode, name, price, author);
        this.language = language;
        this.frameWork = frameWork;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFrameWork() {
        return frameWork;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }

    @Override
    public String toString() {
        return super.toString() +
                "language: " + this.language + "\n" +
                "frameWork: " + this.frameWork + "\n";
    }
}
