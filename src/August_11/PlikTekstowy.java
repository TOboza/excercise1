package August_11;

import java.util.ArrayList;
import java.util.List;

public class PlikTekstowy {
    public static void main(String[] args) {
        List<Employee> listaPracownikow = new ArrayList<>();

    }



    static class Employee{
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
