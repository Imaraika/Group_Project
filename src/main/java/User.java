import java.util.ArrayList;

public class User {
    public String name;
    public String username;
    public String password;
    public String confpassword;
    public String email;
    public int phoneNo;
    public int Id;
    private static ArrayList<User> instances = new ArrayList<>();

    public User(String name, String username, String password, String confpassword,String email,int phoneNo){
        this.name = name;
        this.username = username;
        this.password = password;
        this.confpassword = confpassword;
        this.email = email;
        this.phoneNo = phoneNo;

        instances.add(this);
        this.Id = instances.size();
    }
    public String getName(){
        return this.name;
    }
    public String getUserName(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getConfpassword(){
        return this.confpassword;
    }
    public String getEmail(){
        return this.email;
    }
    public int getPhoneNo(){
        return this.phoneNo;
    }
    public static ArrayList<User> getAllInstances(){
        return instances;
    }
    public int getId(){
        return this.Id;
    }
    public static User findById(int id) {
        return instances.get(id-1);
    }
    public static User newHeroSet() {
        return new User("Alice","Imaraika","Ingabire234","Ingabire234","inange@gmail.com",785423164);
    }

}

