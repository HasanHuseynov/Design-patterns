package Builder;

public class Computer {
    private final String CPU;
    private final String RAM;
    private final int storage;
    private final boolean hasGraphicsCard;
    private final boolean hasBluetooth;

    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public int getStorage() {
        return storage;
    }

    public boolean hasGraphicsCard() {
        return hasGraphicsCard;
    }

    public boolean hasBluetooth() {
        return hasBluetooth;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage=" + storage +
                ", hasGraphicsCard=" + hasGraphicsCard +
                ", hasBluetooth=" + hasBluetooth +
                '}';
    }

    public static class ComputerBuilder {
        private final String CPU;
        private final String RAM;
        private int storage = 256;
        private boolean hasGraphicsCard = false;
        private boolean hasBluetooth = false;

        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public ComputerBuilder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public ComputerBuilder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}