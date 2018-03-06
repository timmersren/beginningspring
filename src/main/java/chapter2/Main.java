package chapter2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * description:
 *
 * @author 任伟
 * @date create on 2018-03-05 17:44
 **/
public class Main {
    public static void main(String[] args) {

        //得到基于注解配置的容器
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Chapter2Configuration.class);
        //通过容器获取accountService的bean
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        System.out.println("转账之前...");
        System.out.println("Account1 balance :" + accountService.getAccount(1).getBalance());
        System.out.println("Account2 balance :" + accountService.getAccount(2).getBalance());
        accountService.transferMoney(1, 2, 5.0);
        System.out.println("转账之后...");
        System.out.println("Account1 balance :" + accountService.getAccount(1).getBalance());
        System.out.println("Account2 balance :" + accountService.getAccount(2).getBalance());
    }
}
