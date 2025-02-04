// enum - enumerator
// A special ata types used to define a set of constant variable or method
// enum classname { constants }
enum WeekDays{
    SUNDAY, MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
enum Price{
    BURGER(240), PIZZA(369);
    // to define we need to use getter setter
    private int price;
    Price(int price){
        this.price = price;
    }

    public int Getprice() {
        return price;
    }
}
public class EnumClass {
    public void display(){
        System.out.println("Week day is "+ WeekDays.FRIDAY);
        Price p = Price.BURGER;
        System.out.println("Price of the burger: " + p.Getprice());
    }
}
