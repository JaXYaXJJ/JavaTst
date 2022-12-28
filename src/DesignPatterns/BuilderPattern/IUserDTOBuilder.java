package DesignPatterns.BuilderPattern;

import java.time.LocalDate;

public interface IUserDTOBuilder {

    IUserDTOBuilder withFirstName(String firstName);
    IUserDTOBuilder withLastName(String lastName);
    IUserDTOBuilder withBirthday(LocalDate date);
    IUserDTOBuilder withAddress(Address address);

    IUserDTO build();
    IUserDTO getUserDTO();
}
