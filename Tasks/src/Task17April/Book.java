package Task17April;

public class Book {

    String name;
    String category;
    String author;
    String bookID;
    int shelfNum;

    static int bookCount;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void getShelfNum() {
        switch (category.toLowerCase()) {
            case "adventure" -> shelfNum = 1;
            case "classics" -> shelfNum = 2;
            case "comics" -> shelfNum = 3;
            case "fantasy" -> shelfNum = 4;
            case "history" -> shelfNum = 5;
            default -> shelfNum = 0;
        }
    }
    static {
         int bookCount = 0;
     }
     public Book(String name){
        this.name = name;
     }
     public Book(String name, String category){
         this(name);
         this.category = category;
     }
     public Book(String name, String category, String author){

         this(name,category);
         this.author = author;

     }
     public String IDgenerator(){
        getShelfNum();
         return bookID = shelfNum+"_"+author.charAt(0)+name.substring(0,2);
         }

    @Override
    public String toString() {
        return "Book-->\n" +
                ("Name:" + name + "\n"
                        + "Category:" + category + "\n"
                        + "Author:" + author + "\n"
                        + "BookID:" + bookID);
    }
}


