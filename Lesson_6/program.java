package Lesson_6;

public class program {
    public class Notebook {
        private String manufacturer;
        private String model;
        private int price;
        private int quantityInStock;
        private double screenSize;
        private int ramSize;
        private int hddSize;

        public Notebook(String manufacturer, String model, int price, int quantityInStock, double screenSize, int ramSize, int hddSize) {
            this.manufacturer = manufacturer;
            this.model = model;
            this.price = price;
            this.quantityInStock = quantityInStock;
            this.screenSize = screenSize;
            this.ramSize = ramSize;
            this.hddSize = hddSize;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
        
    }
}
