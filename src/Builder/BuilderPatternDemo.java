package Builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.ComputerBuilder("Intel i7", "16GB")
                .setStorage(512)
                .setGraphicsCard(true)
                .setBluetooth(true)
                .build();

        Computer officeComputer = new Computer.ComputerBuilder("Intel i5", "8GB")
                .setStorage(256)
                .build();

        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }
}