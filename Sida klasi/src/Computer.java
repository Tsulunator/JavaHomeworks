public class Computer{
    String countryOfManufacture;
    String brand;
    double price;
    boolean hasWarranty;

    public class Monitor{
        int diagonalInches;
        String resolution;
        int hertz;

        Monitor(int diagonalInches, String resolution, int hertz){
            this.diagonalInches = diagonalInches;
            this.resolution = resolution;
            this.hertz = hertz;
        }
    }

    public class Motherboard{
        int ramSlots;
        String ramType;
        int frequency;

        Motherboard(int ramSlots, String ramType, int frequency){
            this.ramSlots = ramSlots;
            this.ramType = ramType;
            this.frequency = frequency;
        }
    }

    Monitor monitor;
    Motherboard motherboard;

    public Computer(String countryOfManufacture, String brand, double price, boolean hasWarranty, int diagonalInches, String resolution, int hertz, int ramSlots, String ramType, int frequency){
        this.countryOfManufacture = countryOfManufacture;
        this.brand = brand;
        this.price = price;
        this.hasWarranty = hasWarranty;
        this.monitor = new Monitor(diagonalInches, resolution, hertz);
        this.motherboard = new Motherboard(ramSlots, ramType, frequency);
    }

    public void printComputerInfo(){
        System.out.println("Computer Info:");
        System.out.println("Country of Manufacture: " + countryOfManufacture);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Has Warranty: " + (hasWarranty ? "Yes" : "No"));

        System.out.println("Monitor Info:");
        System.out.println("Diagonal: " + monitor.diagonalInches + " inches");
        System.out.println("Resolution: " + monitor.resolution);
        System.out.println("Hertz: " + monitor.hertz);

        System.out.println("Motherboard Info:");
        System.out.println("RAM Slots: " + motherboard.ramSlots);
        System.out.println("RAM Type: " + motherboard.ramType);
        System.out.println("Speed: " + motherboard.frequency);
    }
}