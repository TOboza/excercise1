package August_11.Sort;

public class Engine {
    int horsePower;
    int maxTorque;

    @Override
    public String toString() {
        return "Moc silnika : "+horsePower+" , Max moment obrotowy : "+maxTorque+ "\n";
    }

    public Engine(int horsePower, int maxTorque) {
        this.horsePower = horsePower;
        this.maxTorque = maxTorque;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxTorque() {
        return maxTorque;
    }

    public void setMaxTorque(int maxTorque) {
        this.maxTorque = maxTorque;
    }

}

