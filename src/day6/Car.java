package day6;

public class Car {
        private String model;
        private String color;
        private int year;

        public void setModel(String carModel) {
            model = carModel;
        }
        public String getModel(){
            return model;
        }

        public void setColor(String carColor){
            color = carColor;
        }
        public String getColor(){
            return color;
        }
        public void setYear(int carYear){
            year = carYear;
        }
        public int getYear(){
            return year;
        }
        public void getInfo(){
            System.out.println("У меня есть автомобиль модели " + model + ", цвета " + color + ", год выпуска " + year);
         }
        public void info(){
            System.out.println("Это автомобиль" );
        }
        public int yearDifference(int inputYear){
            return Math.abs(inputYear-year); // не уверен, что правильно понял задание
        }
}
