public class Listener implements Comparable<Listener> {

    private String ticketHolder;
    private String sex;
    private int brooch;
    private int mustache;

    public Listener(String ticketHolder, String sex, int brooch, int mustache) {
        this.ticketHolder = ticketHolder;
        this.sex = sex;
        this.brooch = brooch;
        this.mustache = mustache;
    }

    public String getTicketHolder() {
        return ticketHolder;
    }

    public void setTicketHolder(String ticketHolder) {
        this.ticketHolder = ticketHolder;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getBrooch() {
        return brooch;
    }

    public void setBrooch(int brooch) {
        this.brooch = brooch;
    }

    public int getMustache() {
        return mustache;
    }

    public void setMustache(int mustache) {
        this.mustache = mustache;
    }

    @Override
    public String toString() {
        if (sex.equals("lady")) {
            return " Владелец билета: " + this.ticketHolder + '\'' +
                    " Пол: " + this.sex + '\'' +
                    " Брошь: " + this.brooch;
        }
        if (sex.equals("gentleman")) {
            return " Владелец билета: " + this.ticketHolder + '\'' +
                    " Пол: " + this.sex + '\'' +
                    " Размер усов: " + this.mustache;
        }
        return" Владелец билета: " + ticketHolder + '\'' +
                " Пол: " + sex + '\'' +
                " Брошь: " + brooch+ '\''+
                " Размер усов: " + mustache;
    }

    @Override
    public int compareTo(Listener p) {
        int ret = Integer.compare(brooch,p.getBrooch());
        if (ret == 0) {
            ret = Integer.compare(mustache,p.getMustache());
        }
        return ret;

    }
}
