package August_11;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlikTekstowy {
    public static void main(String[] args) throws IOException {
        List<Employee> listaPracownikow = new ArrayList<>();
        odczytpliku("C:\\Users\\toboz\\Documents\\JavaProjects\\Collections\\excercise1\\src\\August_11\\plikZDanymi.txt",listaPracownikow);


    }

    public static void odczytpliku(String nazwa, List nazwaListy) throws IOException {
        BufferedReader plik = null;

        try {
            plik = new BufferedReader(new FileReader(nazwa));
            System.out.println("\n\nOdczyt buforowany:\n");
            String l = plik.readLine();
            String[] parts;
            while (l != null) {
                System.out.println(l);
                l = plik.readLine();
                parts = l.split(";");
                Employee current = new Employee(parts[0],parts[1],parts[2],parts[3]);
                nazwaListy.add(current);

            }
        } catch (IOException e) {
            System.out.println("IOException " + e);
        } finally {
            if (plik != null) {
                plik.close();
            }
        }

    }

    static class Employee {
        String imie;
        String nazwisko;
        String Stanowisko;
        String id;

        public Employee(String imie, String nazwisko, String stanowisko, String id) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            Stanowisko = stanowisko;
            this.id = id;
        }

        public String getImie() {
            return imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public String getStanowisko() {
            return Stanowisko;
        }

        public String getId() {
            return id;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }

        public void setStanowisko(String stanowisko) {
            Stanowisko = stanowisko;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
