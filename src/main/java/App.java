import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHL1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHL2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHL1.getMessage());
        System.out.println(beanHL2.getMessage());

        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat1.getMessage());
        System.out.println(beanCat2.getMessage());

        System.out.println(beanHL1 == beanHL2);
        System.out.println(beanCat1 == beanCat2);

    }
}