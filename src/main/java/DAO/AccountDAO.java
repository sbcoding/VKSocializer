package DAO;

import entity.Account;

/**
 * Created by kotun on 18.10.2015.
 */
public class AccountDAO extends AbstractDAO<Account> {
    public AccountDAO() {
        super(Account.class);
    }
}
