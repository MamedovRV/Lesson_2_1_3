import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());
        HelloWorld beanTwo =
                applicationContext.getBean("helloworld", HelloWorld.class);

        Cat one =applicationContext.getBean("cat", Cat.class);
        Cat two =applicationContext.getBean("cat", Cat.class);

        System.out.println("Hello world: " + (bean == beanTwo));
        System.out.println("Cat: " + (one == two));


    }
}