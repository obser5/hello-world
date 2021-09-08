package han.service;

import han.dao.IUserMapper;
import han.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserMapper userMapper;
    @Override
    public List<User> findAllUsersService() {
        return userMapper.findAllUsers();
    }

    @Override
    public User findUserByIdService(Integer id) {
        return userMapper.findUserById(id);
    }
}
