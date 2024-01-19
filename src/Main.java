import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);


        Thread thread = new Thread(() -> {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));


                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        thread.start();


        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Lista afisata complet cam asa.");
    }
}