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





        Comparator<Produto> comp2 = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        list.sort(comp2);

        for (Produto p : list) {
            System.out.println(p);
        }




        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Produto p : list) {
            System.out.println(p);
        }



        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8);


        for (Integer integer : lista) {
            System.out.println(integer);
        }

        lista.stream().forEach(e -> System.out.println(e));


        lista.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println(e));
    }
}


