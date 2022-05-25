
import cn.edu.hncj.demo.Calculation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Calculation calculation = context.getBean(Calculation.class);
        calculation.add();
        calculation.subtract();
    }
}
