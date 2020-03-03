import java.util.ArrayList;
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        //create book
        ProgramingBook book1 = new ProgramingBook("1", "book1", 20000, "author1", "java", "framework1");
        ProgramingBook book2 = new ProgramingBook("2", "book2", 30000, "author2", "java", "framework2");
        ProgramingBook book3 = new ProgramingBook("3", "book3", 40000, "author3", "java", "framework3");
        ProgramingBook book4 = new ProgramingBook("4", "book4", 50000, "author4", "java", "framework4");
        ProgramingBook book5 = new ProgramingBook("5", "book5", 60000, "author5", "java", "framework5");

        FictionBook fictionBook1 = new FictionBook("6", "book6", 60000, "author5", "category1");
        FictionBook fictionBook2 = new FictionBook("7", "book7", 50000, "author5", "category2");
        FictionBook fictionBook3 = new FictionBook("8", "book8", 40000, "author5", "category3");
        FictionBook fictionBook4 = new FictionBook("9", "book9", 30000, "author5", "category4");
        FictionBook fictionBook5 = new FictionBook("10", "book10", 20000, "author5", "category5");
        
        ArrayList<Book> myBookList = new ArrayList<>();
        myBookList.add(book1);
        myBookList.add(book2);
        myBookList.add(book3);
        myBookList.add(book4);
        myBookList.add(book5);
        myBookList.add(fictionBook1);
        myBookList.add(fictionBook2);
        myBookList.add(fictionBook3);
        myBookList.add(fictionBook4);
        myBookList.add(fictionBook5);
        
        // count book and get total price of book use java language
        double result = 0;
        double countJavaBook = 0;
        for (Book object : myBookList) {
            if (object instanceof ProgramingBook) {
                if (((ProgramingBook) object).getLanguage().equals("java")) {
                    countJavaBook++;
                }
            }
            result += object.getPrice();
        }
       
        // find price with name
        Scanner scanner = new Scanner(System.in);
        System.out.println("result of price" + result);
        System.out.println("java book: " + countJavaBook);
        System.out.println("Please enter the name of book you want to know price");
        String nameInput = scanner.nextLine();
        linearSearch(nameInput, myBookList);
        //--------------------------------------------------------------------------------
        
        //sort with bubble sort
        System.out.println("bubble Sort: \n"+bubbleSort(myBookList));
        //search with binary search
        binarySearch(myBookList,nameInput,0,myBookList.size()-1);
        //sort with insert sort
        System.out.println("insert sort: \n"+insertionSort(myBookList));
        //sort with Selection sort
        System.out.println("selection sort: \n"+selectionSort(myBookList));


    }



    public static ArrayList<Book> bubbleSort(ArrayList<Book> list) {
        for (int k = 1; k < list.size(); k++) {
            for (int i = 0; i < list.size() - k; i++) {
                if (list.get(i).getPrice() > list.get(i + 1).getPrice()) {
                    Book tmp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, tmp);
                }
            }
        }
        return list;
    }

    public static ArrayList<Book> selectionSort(ArrayList<Book> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Book CurrentMin = list.get(i);
            int CurrentMinIndex = list.indexOf(list.get(i));
            for (int j = i + 1; j < list.size(); j++) {
                if (CurrentMin.getPrice() > list.get(j).getPrice()) {
                    CurrentMin = list.get(j);
                    CurrentMinIndex = list.indexOf(list.get(j));
                }
            }
            if (CurrentMinIndex != i) {
                list.set(CurrentMinIndex, list.get(i));
                list.set(i, CurrentMin);
            }
        }
        return list;
    }

    public static ArrayList<Book> insertionSort(ArrayList<Book> list) {
        for (int i = 1; i < list.size(); i++) {
            Book tmp = list.get(i);
            int j;
            for (j = i - 1; j >= 0 && list.get(j).getPrice() > tmp.getPrice(); j--) {
                list.set(j + 1, list.get(j));
            }
            list.set(j + 1, tmp);
        }
        return list;
    }

    public static double binarySearch(ArrayList<Book> list, String name,int low, int high) {
        for (int i = 1; i < list.size(); i++) {
            Book tmp = list.get(i);
            int j;
            for (j = i - 1; j >= 0 && list.get(j).getName().length() > tmp.getName().length(); j--) {
                list.set(j + 1, list.get(j));
            }
            list.set(j + 1, tmp);
        }

        if (high >= low) {
            int mid = low + (high - low) / 2;
            int result = name.compareTo(list.get(mid).getName());
            if (result == 0) {
                return list.get(mid).getPrice();
            } else if (result > 0) {
                return binarySearch(list,name,mid+1, high);
            } else {
                return binarySearch(list, name, low, mid -1);
            }

        }
        return -1;
    }

    private static void linearSearch(String nameInput, ArrayList<Book> myBook) {
        boolean isHasBook = false;
        Book bookWantFind = new Book();
        for (Book book : myBook) {
            if (book.getName().equals(nameInput)) {
                isHasBook = true;
                bookWantFind = book;
                break;
            }
        }
        if (isHasBook) {
            double result = bookWantFind.getPrice();
            System.out.println("Your book has price: " + result);
        } else {
            System.out.println("Your book you want find existed !");
        }
    }

}
