package app;

public class Car {
    // Публічний метод для запуску автомобіля
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    // Приватний метод для запуску електроніки
    private void startElectricity() {
        System.out.println("Electricity system started.");
    }

    // Приватний метод для запуску командного управління
    private void startCommand() {
        System.out.println("Command system started.");
    }

    // Приватний метод для запуску паливної системи
    private void startFuelSystem() {
        System.out.println("Fuel system started.");
    }

        public static void main (String[]args){
            Car car = new Car();
            car.start(); // Запуск автомобіля
        }
    }
