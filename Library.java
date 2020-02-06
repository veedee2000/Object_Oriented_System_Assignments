 
class Book{
        private String title,authors[],publisher;
        private int pages;
        private double price;

        Book(String t,String []a,String p,int pg,double pr){
                title = t;
                authors = a;
                publisher = p;
                pages = pg;
                price = pr;
        }

        double getPrice(){
                return price;
        }

}

class Library{
        private Book Books[];
        private int count;

        Library(Book B[],int n){
                Books = B;
                count = n;
        }

        void addBook(Book B){
                Books[count] = B;
                count++;
        }

        void removeBook(int c){
                Books[c] = null;
        }

        void totalPrice(){
                float sum = 0;
                for(int i = 0;i < count;i++){
                        if(Books[i] != null) sum += Books[i].getPrice();
                }
                System.out.println("Total sum = " + sum);
        }

        public static void main(String args[]){
                String authors[] = {"Fleming","Shakespeare","O'Henry","Grey","Tagore","Blake","Wordsworth"};
                String title[] = {"As You Like It","Macbeth","TAO","CrimeLand","Pristine Culture","Harry Potter"};
                String publisher[] = {"Oxford","Stanford"};
                Book Books[] = new Book[5];
                for(int i = 0;i < 5;i++){
                        int in;
                        if(i % 2 == 0) in = 0;
                        else in = 1;
                        String b[] = {authors[i],authors[i + 1]};
                        Books[i] = new Book(title[i],b,publisher[in],100 * i  + 200,23.32 * i + 500);
                }
                Library L = new Library(Books,5);
                String b[] = {authors[2],authors[5],authors[6]};
                Book b1 = new Book(title[5],b,publisher[1],3244,234.23);
                L.addBook(b1);
                L.removeBook(3);
                L.totalPrice();
        }
}
