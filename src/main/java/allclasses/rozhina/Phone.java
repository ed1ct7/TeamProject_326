package allclasses.rozhina;

public class Phone {
    private String brand;
    private String model;
    private float price;
    private int memory; // в ГБ
    private int battery; // 0–100 %

    public Phone() {
        brand = "Unknown";
        model = "Unknown";
        price = 1;
        memory = 1;
        battery = 50;
    }

    public Phone(String brand, String model, float price, int memory, int battery) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.memory = memory;
        this.battery = battery;
    }

    public String ToString() {
        return brand + " " + model + ", память: " + memory + " ГБ" + ", заряд: " + battery + "%" +
                ", цена: " + price + " руб.";
    }

    // определение дешевая ли цена
    public boolean isCheapPrice() {
        return price <= 60000;
    }

    // определение мало ли ГБ
    public boolean isLittleMemory() {
        return memory <= 32;
    }

    // Зарядить до 100%
    public void chargeToFull() {
        if (battery < 100) {
            battery = 100;
        }
    }

    // разрядить до 0%
    public void dischargeFully() {
        if (battery > 0) {
            battery = 0;
        }
    }

    // определение низкий ли заряд
    public boolean isLowBattery() {
        return battery <= 20;
    }

}
