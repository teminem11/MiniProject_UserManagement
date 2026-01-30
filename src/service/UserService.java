package service;

import model.User;

import java.util.*;

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

    public List<User> sortByAgeAsc(){
        List <User> listAgeAsc = new ArrayList<>();
        listAgeAsc.addAll(getAllUsers());
        listAgeAsc.sort(Comparator.comparingInt(User::getAge));
        return listAgeAsc;
    }
    public List<User> sortByAgeDesc(){
        List<User> listAgeDesc = new ArrayList<>();
        listAgeDesc.addAll(getAllUsers());
        listAgeDesc.sort(Comparator.comparingInt(User::getAge).reversed());
        return listAgeDesc;
    }
    public List<User> sortByName(){
        List<User> listName = new ArrayList<>();
        listName.addAll(getAllUsers());
        listName.sort(Comparator.comparing(User::getName));
        return listName;
    }

}
