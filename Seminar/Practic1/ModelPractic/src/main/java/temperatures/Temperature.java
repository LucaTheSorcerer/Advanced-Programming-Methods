package temperatures;

public class Temperature {

    private double value;
    private String unit;
    private int month;

    public Temperature(double value, String unit, int month) {
        this.value = value;
        this.unit = unit;
        this.month = month;
    }

    public double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public int getMonth() {
        return month;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
