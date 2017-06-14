package br.com.centi.centiaction.api.services;

import javax.inject.Inject;

import br.com.centi.centiaction.model.User;

/**
 * Created by gleidson on 6/14/17.
 */

public class AuthService implements IAuthService{

    @Inject
    public AuthService() {
    }

    @Override
    public User login(User user) {
        return null;
    }
}
