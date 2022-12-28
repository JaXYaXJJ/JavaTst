package DesignPatterns.BuilderPattern;

import java.time.LocalDate;

//We Application - Java + Spring ---> Layers

//API Layer (Controller Layer) --->
//Service Layer --->
//Repository Layer --->
//Database

//DTOs - Data Transfer Objects

public class Main {

    public static void main(String[] args) {

        User user = createUser();

        IUserDTO userWebDTO = new UserWebDTOBuilder()
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();

        System.out.println(userWebDTO);
    }

    public static User createUser() {

        User user = new User();

        user.setBirthday(LocalDate.of(1960,5,6));
        user.setFirstName("Ron");
        user.setLastName("Levi");

        Address address = new Address();

        address.setHouseNumber("10");
        address.setStreet("Almog");
        address.setCity("Haifa");

        user.setAddress(address);

        return user;
    }
}
