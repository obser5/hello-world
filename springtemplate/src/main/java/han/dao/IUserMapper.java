package han.dao;

import han.pojo.User;

import java.util.List;

public interface IUserMapper {
    List<User> findAllUsers();

    User findUserById(Integer id);
}
