package chapter2;

/**
 * description:
 *
 * @author 任伟
 * @date create on 2018-03-05 17:23
 **/
public interface AccountService {
    /**
    * description: 转账
    * @param sourceAccountId：转出账户 targetAccountId：转入账户 amount：转账金额
    **/
    void transferMoney(long sourceAccountId, long targetAccountId, double amount);

    void depositMoney(long accountId, double amount); //存款

    Account getAccount(long accountId);
}
