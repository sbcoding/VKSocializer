package DAO;

import entity.User;

/**
 * Created by kotun on 18.10.2015.
 */
public class UserDAO extends AbstractDAO<User> {
    public UserDAO() {
        super(User.class);
    }
}
