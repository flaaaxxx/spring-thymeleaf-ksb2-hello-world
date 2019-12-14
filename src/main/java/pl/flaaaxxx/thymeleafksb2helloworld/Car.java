package pl.flaaaxxx.thymeleafksb2helloworld;

public class Car {

    private String model;
    private String mark;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }
}
