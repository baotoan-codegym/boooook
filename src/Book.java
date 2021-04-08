public class Book {
    public String name;
    public int price;
    public String language;


    public Book(String name, int price, String language) {
        this.name = name;
        this.price = price;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }





    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
public void display(){
    System.out.println("name: "+name+"languge: "+price+"Price: "+price);
}
}


