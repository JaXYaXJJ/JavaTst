package DesignPatterns.BuilderPattern;

public class UserWebDTO implements IUserDTO{

    private String fullName;
    private String address;
    private int age;

    public UserWebDTO(String fullName, String address, int age) {
        this.fullName = fullName;
        this.address = address;
        this.age = age;
    }

    @Override
    public String getName() {
        return fullName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserWebDTO{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
