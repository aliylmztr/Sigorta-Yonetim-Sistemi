package insuranceManagementSystem;

import java.time.LocalDate;

public abstract class Insurance {
    private String name;
    private double price;
    private LocalDate startDate;
    private LocalDate finishDate;

    public abstract double calculate();

    public Insurance(int price) {
        super();
        this.name = name;
        this.price = price;
        this.startDate = LocalDate.now();
        this.finishDate = startDate.plusYears(1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }
}
