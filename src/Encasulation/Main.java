package Encasulation;

import Encasulation.passenger.Taxi;

public class Main {
        public static void main(String[] args) {
            Taxi taxi = new Taxi();

            Taxi anotherTaxi = new Taxi(
                    6,
                    "Haim",
                    "getTaxi"
            );

            anotherTaxi.setDriverName("Moshe");
            anotherTaxi.setSits(10);

        }
}
