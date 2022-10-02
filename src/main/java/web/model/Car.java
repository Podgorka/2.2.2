package web.model;

public class Car {
    private String carModel;
    private String carColor;
    private int carMaxSpeed;

    public Car() {}

    public Car(String carModel, String carColor, int carMaxSpeed) {
        this.carModel = carModel;
        this.carColor = carColor;
        this.carMaxSpeed = carMaxSpeed;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarMaxSpeed() {
        return carMaxSpeed;
    }

    public void setCarMaxSpeed(int carMaxSpeed) {
        this.carMaxSpeed = carMaxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carMaxSpeed=" + carMaxSpeed +
                '}';
    }
}
