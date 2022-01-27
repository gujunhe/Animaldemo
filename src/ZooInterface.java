public interface ZooInterface {
    public void fosterAnimal(Animal animal);
    public void receiveTourist(Tourist tourist) throws AnimalNotFoundException, InsufficientBalanceException;
    public void outOfBusiness();
}
