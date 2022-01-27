public  abstract class  Animal {
    protected String name;
    protected int age;
    protected String gender;
    protected double  buyprice;
    protected double seeprice;

    public double getBuyprice() {
        return buyprice;
    }

    public double getSeeprice() {
        return seeprice;
    }

    public Animal(String name, int age, String gender, double buyprice, double seeprice) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.buyprice = buyprice;
        this.seeprice = seeprice;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", buyprice=" + buyprice +
                ", seeprice=" + seeprice +
                '}';
    }
}
