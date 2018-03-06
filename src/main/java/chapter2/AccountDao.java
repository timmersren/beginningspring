package chapter2;

import java.util.List;

/**
 * description:
 *
 * @author 任伟
 * @date create on 2018-03-05 17:06
 **/
public interface AccountDao {
    public void insert(Account account);
    public void update(Account account);
    public void update(List<Account> accounts);
    public void delete(long accountId);
    public Account find(long accountId);
    public List<Account> find(List<Long> accountIds);
    public List<Account> find(String ownerName);
    public List<Account> find(boolean locked);
}
