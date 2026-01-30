package service;

import model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
    private Map<Long, User> map = new HashMap<>();

    public void addUser(User user){
        map.put(user.getId(),user);
    }

    public User getById(long id){
       return map.get(id);
    }

    public void removeById(long id){
        map.remove(id);
    }

    public List<User> getAllUsers(){
        List<User> list = new ArrayList<>();
        list.addAll(map.values());
        return list;
    }

}
