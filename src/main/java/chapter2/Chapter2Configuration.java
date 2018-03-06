package chapter2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 *
 * @author 任伟
 * @date create on 2018-03-05 17:40
 **/

@Configuration
public class Chapter2Configuration {

    @Bean
    public AccountService accountService(){
        AccountServiceImpl bean = new AccountServiceImpl();
        bean.setAccountDao(accountDao());
        return bean;
    }

    @Bean
    public AccountDao accountDao(){
        AccountDaoInMemoryImpl bean = new AccountDaoInMemoryImpl();
        //需要accountDao依赖的类会将这个bean注入进去
        return bean;
    }
}
