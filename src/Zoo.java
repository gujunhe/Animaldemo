import java.util.ArrayList;
import java.util.LinkedList;

public class Zoo implements ZooInterface{

    private Integer cash;
    LinkedList<Animal> animals=new LinkedList<>();
    LinkedList<Tourist> tourists=new LinkedList<>();

    public Zoo(Integer cash) {
        this.cash = cash;
    }

    @Override
    public void fosterAnimal(Animal animal) {
        animals.add(animal);
        cash=(cash-(int)animal.buyprice);
    }

    @Override
    public void receiveTourist(Tourist tourist) throws AnimalNotFoundException, InsufficientBalanceException {
        tourists.add(tourist);
        for(int i=0;i<tourist.getTime();i++) {

            if (animals.size() <= 0) {
                throw new AnimalNotFoundException("没动物给你看啦");
            }
            else {
                Animal animal = animals.get((int) (Math.random() * animals.size()));
                System.out.println(tourist.getName()+"第"+i+"次看的动物是:"+animal.toString());

                cash += (int) animal.seeprice;

            }

        }
    }

    @Override
    public void outOfBusiness() {
        for(Tourist i:tourists)
        {
            System.out.println(i);
        }
        System.out.println(cash);
        if(cash<0)
        throw new InsufficientBalanceException("动物园要倒闭啦");
    }
}
