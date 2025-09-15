import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Adam", "Bernd", "Cäsar"};

        System.out.println(Arrays.toString(names));

        //neu // String, weil Strings rein sollen
        List<String> namesListe = new ArrayList<>();
        namesListe.add("Mirrra");
        System.out.println("namesListe = " + namesListe);
        System.out.println(namesListe.getLast());

    }



}
