package br.com.centi.centiaction.api;

import javax.inject.Inject;

/**
 * Created by gleidson on 6/13/17.
 */

public class NetworkApi {

    @Inject
    public NetworkApi(){
    }

    public boolean validateUser(String username, String password) {
        if (username == null || username.length() == 0) {
            return false;
        } else {
            return true;
        }
    }


}
