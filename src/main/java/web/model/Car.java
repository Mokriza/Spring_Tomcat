package web.model;


public class Car {
    private String model;

    private int series;

    private int mileage;

    public Car(String model, int series, int mileage) {
        this.model = model;
        this.series = series;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", mileage=" + mileage +
                '}';
    }
}
