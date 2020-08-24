package domain;

public class Ticket implements Comparable {
    private int id;
    private int price;
    private String from;
    private String to;
    private int time;

    public Ticket(int price, String from, String to) {
        this.price = price;
        this.from = from;
        this.to = to;
    }

    public Ticket() {
    }

    @Override
    public int compareTo(Object p) {
        Ticket x = (Ticket) p;
        return price - x.price;
    }

    public int getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

}