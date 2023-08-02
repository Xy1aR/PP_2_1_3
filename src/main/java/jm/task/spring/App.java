package jm.task.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        final Logger logger = Logger.getLogger(App.class.getName());

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld leaf =
                applicationContext.getBean(HelloWorld.class);

        Cat one = (Cat) applicationContext.getBean("cat");
        Cat two = applicationContext.getBean(Cat.class);

        logger.info(() -> String.valueOf(bean == leaf));
        logger.info(() -> String.valueOf(one == two));

    }
}