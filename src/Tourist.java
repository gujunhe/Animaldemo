public class Tourist {
    private String name;
    private int money;
    private int time;

    public int getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public Tourist(String name, int money, int time) {
        this.name = name;
        this.money = money;
        this.time = time;
    }

    @Override
    public String toString() {
       return "name of tourist is "+name+",\n"+"He want to see "+time+" kinds of animals,"+"\n"
               +"and has "+money+" dollars in cash.";
    }
}
