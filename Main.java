import java.util.*;

public class Main {
    public static void main(String[] args) {
         List<Produto> list = new ArrayList<>();

        list.add(new Produto("TV", 900.00));
        list.add(new Produto("Gabinete", 200.00));
        list.add(new Produto("Notebook", 1200.00));
        list.add(new Produto("Tablet", 450.00));




        Comparator<Produto> comp = new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };

        list.sort(comp);

        for (Produto p : list) {
            System.out.println(p);
        }
    }
}


