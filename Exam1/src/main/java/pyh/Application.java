package pyh;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import pyh.util.StartListener;
import pyh.util.StopListener;


@SpringBootApplication
@MapperScan("pyh.dao")
@EnableTransactionManagement
public class Application {

    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args){
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.addListeners(new StartListener()); //启动 输出信息
        springApplication.addListeners(new StopListener());  //停止 输出信息
        springApplication.run(args);
    }
}
