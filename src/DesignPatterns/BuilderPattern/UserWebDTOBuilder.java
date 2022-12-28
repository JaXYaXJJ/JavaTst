package DesignPatterns.BuilderPattern;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements IUserDTOBuilder{

    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private UserWebDTO dto;

    @Override
    public IUserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public IUserDTOBuilder withLastName(String lastName) {

        this.lastName = lastName;
        return this;
    }

    @Override
    public IUserDTOBuilder withBirthday(LocalDate date) {

        Period ageInYears = Period.between(date, LocalDate.now());
        this.age = ageInYears.getYears();
        return this;
    }

    @Override
    public IUserDTOBuilder withAddress(Address address) {

        this.address = address.getHouseNumber() + " , " + address.getStreet() + " , " + address.getCity();
        return this;
    }

    @Override
    public IUserDTO build() {

        this.dto = new UserWebDTO(firstName + " " + lastName, address, age);
        return dto;
    }

    @Override
    public IUserDTO getUserDTO() {
        return dto;
    }
}