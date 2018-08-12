package August_11.Search;

public class Main {
    public static void main(String[] args) {
        Osoba ania = new Osoba("Ania","Nowak",20);
        Osoba basia = new Osoba("Basia","Bauwan",21);
        Osoba kasia = new Osoba("Kasia","Grzbiet",22);
        Osoba julia = new Osoba("Julia","Kowalska",22);

        Osoba listaOsob[] = {ania,basia,kasia,julia};
        Searching searching = new Searching();
    //    System.out.println(listaOsob[searching.searchAge(listaOsob,22,0,listaOsob.length-1)]  );

        System.out.println(searching.searchAgeIfNotOnlyOne(22,listaOsob).toString());



    }


}
