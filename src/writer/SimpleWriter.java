package writer;

public class SimpleWriter implements iWriter {
    public void write (String s) {
        System.out.println("+++++-->" + s);
    }
}
