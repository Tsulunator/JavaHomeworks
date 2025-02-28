import java.util.ArrayList;

public class Main {
    public static void printListNicely(ArrayList<Integer> list){
        System.out.print("List of {");
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i));
            if(i != list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        //1
        /*
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        while(true){
            int num = rand.nextInt(51);
            list.add(num);
            if(num == 40) break;
        }

        System.out.print(list.size() + ", ");
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 != 0){
                System.out.print(list.get(i) + " ");
            }
        }

        System.out.println();
        list.removeIf(n->n%2==0);
        System.out.println(list);
         */

        //2
        /*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(25);
        list.add(2);
        list.add(4);
        list.add(11);
        list.add(87);

        printListNicely(list);
         */

        //3
        /*
        int[] array = new int[5];
        Random rand = new Random();

        for(int i = 0; i<array.length; i++){
            array[i] = rand.nextInt(51);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<array.length; i++){
            list.add(array[i]);
        }

        int max = list.get(0);
        int truemax = 0;
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) > max){
                max = list.get(i);
                truemax = i;
            }
        }
        System.out.println(list);
        System.out.println(truemax);
         */

        //4
        Library library = new Library();
        library.populateList("books.txt");
        for(Book book : library.getBooks()){
            System.out.println(book);
        }
    }
}