public class AnimalTest {
    public static void main(String[] args) {
        Zoo zoo=new Zoo(-500000);
        zoo.fosterAnimal(new Panda("花花",1,"女",200));
        zoo.fosterAnimal(new Panda("兰兰",2,"男",200));
        zoo.fosterAnimal(new Shark("红红",3,"女",300));
        zoo.fosterAnimal(new Shark("绿绿",7,"女",300));
        zoo.fosterAnimal(new Shark("黄黄",3,"男",150));
        zoo.receiveTourist(new Tourist("小刘",50000,20));
        zoo.receiveTourist(new Tourist("小王",5000,20));
        zoo.receiveTourist(new Tourist("小陈",8000,20));
        zoo.outOfBusiness();

    }
}
