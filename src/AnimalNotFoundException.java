public class AnimalNotFoundException  extends RuntimeException{

    private String message;

    public AnimalNotFoundException(String message)
    {
        super(message);
        this.message=message;
    }
}
