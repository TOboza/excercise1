package August_11.Sort;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarSort {

    public static void main(String[] args) {
        Engine fsi16 = new Engine(130, 250);
        Engine tdi20 = new Engine(130, 320);
        Engine gli16 = new Engine(75, 120);
        Engine rsi35 = new Engine(330, 610);

        Car Citroen = new Car("zCitroen C5", LocalDate.of(2015, 9, 12), fsi16);
        Car vw = new Car("Volkswagen Golf", LocalDate.of(2015, 9, 12), tdi20);
        Car poldek = new Car("Polonez", LocalDate.of(1993, 1, 25), gli16);
        Car porshe = new Car("Porshe Carrera", LocalDate.of(2018, 4, 10), rsi35);

        List<Car> auta = new ArrayList<>();
        auta.add(Citroen);
        auta.add(vw);
        auta.add(poldek);
        auta.add(porshe);

        System.out.println(auta.toString() + "\n");
        //System.out.println(sortByPower(auta).toString());
        System.out.println(sortByMultipleElements(auta).toString());



    }

    public static List<Car> sortByDate(List<Car> listaAut) {
        List<Car> result = new ArrayList<>();

        result = listaAut.stream()
                .sorted((o1, o2) -> (o1.productionDate.compareTo(o2.productionDate)))
                .collect(Collectors.toList());

        return result;
    }

    public static List<Car> sortByPower(List<Car> listaAut) {
        List<Car> result = new ArrayList<>();

        result = listaAut.stream()
                .sorted((o1, o2) -> (o1.engine.horsePower - (o2.engine.horsePower)))
                .collect(Collectors.toList());

        return result;
    }

    public static List<Car> sortByMultipleElements(List<Car> listaAut) {
        List<Car> result = new ArrayList<>();

        result = listaAut.stream()
                .sorted((o1, o2) -> {
                    if (o1.productionDate.compareTo(o2.productionDate) > 0) return 1;
                    else if (o1.productionDate.compareTo(o2.productionDate) < 0) return -1;
                    else if (o1.productionDate.compareTo(o2.productionDate) == 0) {
                        if (o1.engine.horsePower > (o2.engine.horsePower)) return 1;
                        else if (o1.engine.horsePower < (o2.engine.horsePower)) return -1;
                        else{
                            if(o1.name.compareTo(o2.name)>0) return 1;
                            else if (o1.name.compareTo(o2.name)<0) return -1;
                        }
                    }

                    return 0;
                })
                .collect(Collectors.toList());

        return result;
    }


}
