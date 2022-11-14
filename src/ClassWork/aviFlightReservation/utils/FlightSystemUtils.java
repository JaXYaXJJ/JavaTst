package ClassWork.aviFlightReservation.utils;

import ClassWork.aviFlightReservation.actors.Passenger;
import ClassWork.aviFlightReservation.airline.FlightTicket;
import ClassWork.aviFlightReservation.enums.EFlightDestination;
import ClassWork.aviFlightReservation.enums.EGender;
import ClassWork.aviFlightReservation.enums.ESeatClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FlightSystemUtils {


    //Holding the path to Passenger.txt file
    private static final String PASSENGERS_FILE_PATH = "src\\ClassWork\\resources\\Passengers.txt";


    //Generates flight ticket based on Passenger info
    public static FlightTicket generateFlightTicket(EFlightDestination flightDestination) {

        return new FlightTicket(
                flightDestination.getFlightNumber(),
                UUID.randomUUID().toString(),
                flightDestination.getFlightDuration()
        );

    }

    //Parsing passenger file in order to create a list of Passengers
    public static List<Passenger> parsePassengersFile() throws FileNotFoundException {

        List<Passenger> passengerList = new ArrayList<>();

        //Reading passenger.txt file, and splitting the lines based on "\n" delimiter
        String[] passengersLines = IOUtils.read(new FileInputStream(PASSENGERS_FILE_PATH)).split("\n");

        //Looping through the lines in the array
        for (String line : passengersLines) {

            //Splitting the lines, based on "\t" delimiter
            String[] variables = line.split("\t");

            passengerList.add(new Passenger(

                    //firstName
                    variables[0],
                    //lastName
                    variables[1],
                    //Flight destination
                    EFlightDestination.valueOf(variables[2]),
                    //Flight Gender
                    EGender.valueOf(variables[3]),
                    //Seat Class
                    ESeatClass.valueOf(variables[4])
            ));
        }

        return passengerList;
    }

}

