package August_11.Sort;

import java.time.LocalDate;

public class Car {
    String name;
    LocalDate productionDate;
    Engine engine;

    @Override
    public String toString() {
        return name + " Data produkcji "+ productionDate +" , Silnik : "+ engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(String name, LocalDate productionDate, Engine engine) {
        this.name = name;
        this.productionDate = productionDate;
        this.engine = engine;


    }





}
