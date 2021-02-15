package EmailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Burak","Kepuc");

        em1.setAlternateEmail("bk@gmail.com");
        System.out.println(em1.showInfo());
        System.out.println(em1.getMailBoxCapacity());


    }
}
