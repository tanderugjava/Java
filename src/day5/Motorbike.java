package day5;

public class Motorbike {
        private String model;
        private String color;
        private int year;

        public Motorbike(String model, String color, int year){
            this.model = model;
            this.color = color;
            this.year = year;
        }
        public String getModel(){
            return model;
        }
        public String getColor(){
            return color;
        }
        public int getYear(){
            return year;
        }

        public void getInfo(){
            System.out.println("У меня есть мотоцикл модели " + model + ", цвета " + color + ", год выпуска " + year);
        }
}
