package br.com.centi.centiaction.modules;

import javax.inject.Singleton;

import br.com.centi.centiaction.api.services.AuthService;
import br.com.centi.centiaction.api.services.IAuthService;
import dagger.Module;
import dagger.Provides;

/**
 * Created by gleidson on 6/14/17.
 */

@Module
public class ServicesModule {

    @Provides
    @Singleton
    IAuthService authService(){
        return new AuthService();
    }
}
