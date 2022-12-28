package SOLID.Dependency;

public interface IDatabaseInterface {

    <E> E get();
    <T> T insert();
    <T> T update();
    <T> T delete();
}
