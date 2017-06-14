package br.com.centi.centiaction.model;

/**
 * Created by gleidson on 6/14/17.
 */

public class User {

    String User;
    String Pass;
    Device Device;

    public User() {
    }

    public User(String user, String pass) {
        User = user;
        Pass = pass;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public br.com.centi.centiaction.model.Device getDevice() {
        return Device;
    }

    public void setDevice(br.com.centi.centiaction.model.Device device) {
        Device = device;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (User != null ? !User.equals(user.User) : user.User != null) return false;
        return Pass != null ? Pass.equals(user.Pass) : user.Pass == null;
    }

    @Override
    public int hashCode() {
        int result = User != null ? User.hashCode() : 0;
        result = 31 * result + (Pass != null ? Pass.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "User='" + User + '\'' +
                '}';
    }
}
