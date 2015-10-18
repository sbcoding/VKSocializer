package DAO;

import entity.Account;
import interceptor.TxInterceptorBinding;

/**
 * Created by kotun on 18.10.2015.
 */
@TxInterceptorBinding
public class AccountDAO extends AbstractDAO<Account> {
    public AccountDAO() {
        super(Account.class);
    }
}
