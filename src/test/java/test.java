
import cn.edu.hncj.demo.Calculation;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void demotest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Calculation calculation = context.getBean(Calculation.class);
        calculation.add();
        calculation.subtract();
    }
}
