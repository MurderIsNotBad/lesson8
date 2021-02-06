public class Month {

    public static Month JANUARY = new Month("January");
    public static Month FEBRUARY = new Month("February");
    public static Month MARCH = new Month("March");
    public static Month APRIL = new Month("April");
    public static Month MAY = new Month("May");
    public static Month JUNE = new Month("June");
    public static Month JULY = new Month("July");
    public static Month AUGUST = new Month("August");
    public static Month SEPTEMBER = new Month("September");
    public static Month OCTOBER = new Month("October");
    public static Month NOVEMBER = new Month("November");
    public static Month DECEMBER = new Month("December");


    String name;

    private Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                '}';
    }
}
