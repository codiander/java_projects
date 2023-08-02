class library{
    String[] books;
    int number_of_books;
   library(){
       this.books = new String[10];
       this.number_of_books = 0;
   }

   void addbook(String book){
       books[number_of_books] = book;
       number_of_books++;
   }
   void showbook(){
       for (String element:
            books) {
           if(element == null){continue;}
           else{System.out.println("-->"+element);}
       }
   }

   void issuebook(String issuedbook){
       for(int i = 0;i<books.length;i++){
           if(issuedbook ==books[i]){
               System.out.println(issuedbook+" has been issued.");
               books[i] = null;
           }

       }
   }

   void returnbook(String returnedbook){
       System.out.println(returnedbook+ " has been given back to the library.");
       addbook(returnedbook);
   }


}

public class onlinelibrary {
    public static void main(String[] args) {
        library schoollibrary = new library();
        schoollibrary.addbook("Power Of Habits");
        schoollibrary.addbook("Rich Dad Poor Dad");
        schoollibrary.issuebook("Rich Dad Poor Dad");
        schoollibrary.returnbook("Rich Dad Poor Dad");
        schoollibrary.showbook();
    }
}

