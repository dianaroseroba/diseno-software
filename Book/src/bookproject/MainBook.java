package bookproject;

public class MainBook {
    public static void main(String[] args) {
        Author author = new Author("DianaBastidas", "diana.caro11@hotmail.com", 'f');
        bookproject libro1 = new bookproject("Mètodos de calidad de material acerado", author, 35000,1);
        bookproject libro2 = new bookproject("Logistica", author, 70000, 3);
        
        System.out.println(libro1);
        System.out.println(libro2);
    }
}
