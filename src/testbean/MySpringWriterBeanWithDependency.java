package testbean;

import org.springframework.beans.factory.annotation.Autowired;
import writer.iWriter;

public class MySpringWriterBeanWithDependency {
    private iWriter writer;

    @Autowired
    public void setWriter (iWriter pWriter){
        this.writer = pWriter;
    }

    public void run() {
        String s = "Sample string";
        writer.write(s);
    }
}
