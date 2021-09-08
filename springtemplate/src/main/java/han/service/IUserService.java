package han.service;

import han.pojo.User;

import java.util.List;

public interface IUserService {
    List<User> findAllUsersService();

    User findUserByIdService(Integer id);
}
