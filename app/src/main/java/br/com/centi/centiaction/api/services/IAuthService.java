package br.com.centi.centiaction.api.services;

import br.com.centi.centiaction.model.User;

/**
 * Created by gleidson on 6/14/17.
 */

public interface IAuthService {

    public User login(User user);
}
