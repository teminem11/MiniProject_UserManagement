package model;

import java.util.Objects;

public class User implements Comparable<User> {
    private long id;
    private String name;
    private int age;

    public User(long id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public String toString(){
        return "ID: "+id+" Name: "+name+" Age: "+age;
    }
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof User)) return false;
        User user = (User) o;
        return id==user.id;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    @Override
    public int compareTo(User o) {
        int result=0;
        if(this.id<o.getId()){
            result=-1;
        }else if(this.id>o.getId()){
            result=1;
        }else{
            return 0;
        }
        return result;
     }
}
