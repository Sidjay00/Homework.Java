package Lesson_6;

public class program {
    public static class Notebook {
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
        public String getModel() {
            return model;
        }
        public void setModel(String model) {
            this.model = model;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public int getQuantityInStock() {
            return quantityInStock;
        }
        public void setQuantityInStock(int quantityInStock) {
            this.quantityInStock = quantityInStock;
        }
        public double getScreenSize() {
            return screenSize;
        }
        public void setScreenSize(double screenSize) {
            this.screenSize = screenSize;
        }
        public int getRamSize() {
            return ramSize;
        }
        public void setRamSize(int ramSize) {
            this.ramSize = ramSize;
        }
        public int getHddSize() {
            return hddSize;
        }
        public void setHddSize(int hddSize) {
            this.hddSize = hddSize;
        }        
    }    
}
