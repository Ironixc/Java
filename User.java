package ENKAPSULASI;

class User {
    private String username;
    private String password;
    private int id;
    private boolean status; 

    public User(String username, String password, int id, boolean status){
        this.username = username;
        this.password = password;
        this.id = id;
        this.status = status;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setid(int id){
        this.id = id;
    }

    public void setstatus(boolean status){
        this.status = status;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public int getid(){
        return this.id;
    }

    public boolean getstatus(){
        return this.status;
    }
}