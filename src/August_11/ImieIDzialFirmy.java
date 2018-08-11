package August_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ImieIDzialFirmy {

    public static void main(String[] args) {

        List<Wpis> bazaOsob = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String imie = "";
        String dzial = "";

        while(!imie.equals("exit")) {
            System.out.println("Podaj imie i dział firmy (\"exit\" w polu Imie kończy wprowadzanie)");
            System.out.println("Imie :");
            imie = scan.nextLine();
            if(imie.equals("exit")) break;
            System.out.println(" Dział Firmy :");
            dzial = scan.nextLine();
            bazaOsob.add(new Wpis(imie,dzial));
        }

        System.out.println("Lista dzialow :");
        List<String> listaDzialow =  bazaOsob.stream()
                                         .map(Wpis::getDzial)
                                         .distinct()
                                         .collect(Collectors.toList());
        System.out.println(listaDzialow);

        while(!dzial.equals("exit")) {
            System.out.println("Podaj dzial ktory chcesz wypisac (\"exit\" kończy program)");
            System.out.println("Dział Firmy :");
            dzial = scan.nextLine();
            String dzial1 = dzial;
            if(dzial.equals("exit")) break;
            List<String> listaOsobZDzialu = bazaOsob.stream()
                                            .filter(s -> dzial1.equals(s.getDzial()))
                                            .map(Wpis::getImie)
                                            .collect(Collectors.toList());
            System.out.println(listaOsobZDzialu);
        }


    }

    List bazaOsob = new ArrayList();

    static class Wpis{
        String imie;
        String dzial;

        public Wpis(String imie, String dzial) {
            this.imie = imie;
            this.dzial = dzial;
        }

        public String getImie() {
            return imie;
        }

        public String getDzial() {
            return dzial;
        }
    }
}
