package br.com.centi.centiaction.model;

import java.util.Objects;

/**
 * Created by gleidson on 6/14/17.
 */

public class Device{

    private String DeviceId;
    private String SessionId;
    private String User;

    public String getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(String deviceId) {
        DeviceId = deviceId;
    }

    public String getSessionId() {
        return SessionId;
    }

    public void setSessionId(String sessionId) {
        SessionId = sessionId;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (DeviceId != null ? !DeviceId.equals(device.DeviceId) : device.DeviceId != null)
            return false;
        if (SessionId != null ? !SessionId.equals(device.SessionId) : device.SessionId != null)
            return false;
        return User != null ? User.equals(device.User) : device.User == null;
    }

    @Override
    public int hashCode() {
        int result = DeviceId != null ? DeviceId.hashCode() : 0;
        result = 31 * result + (SessionId != null ? SessionId.hashCode() : 0);
        result = 31 * result + (User != null ? User.hashCode() : 0);
        return result;
    }
}
