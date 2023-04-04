package it.aulab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.aulab.model.Joker;
import it.aulab.model.Macchina;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Joker joker = context.getBean("joker" , Joker.class);
        Macchina macchina = context.getBean("macchina" , Macchina.class);

        
        System.out.println(joker);
        System.out.println(macchina);

    }
}
