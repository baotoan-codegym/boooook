import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new Book("Mot",65000,"java");
        books[1] = new Book("HAi",45000,"java");
        books[2] = new Book("Ba",35000,"java");
        books[3] = new Book("Bon",55000,"java");
        books[4] = new Book("NAm",50000,"java");
        books[5] = new Book("Sau",28000,"java");
        books[6] = new Book("BAy",25000,"java");
        books[7] = new Book("Tam",26000,"java");
        books[8] = new Book("Chin",27000,"java");
        books[9] = new Book("Muoi",55000,"java");
        int sum =0;
        int count =0;
        for (int i=0;i< books.length;i++){
            sum += books[i].getPrice();
        }
        System.out.println("tong tien 10 quyen sach la"+sum);
        for (int i =0;i<books.length;i++){
            if (books[i].language=="java"){
                System.out.println("quyen sach day co ngon ngu la java"+books[i].getName());
                count++;
            }
            System.out.println("so sach co ngon ngu java la"+count);

        }
        System.out.println("Enter your money");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        for (int i = 0; i < books.length; i++) {
            if(books[i].getPrice() < money){
                System.out.println("quyen sach gia thap hon la " + books[i].getName());
            }
        }
    }
}
