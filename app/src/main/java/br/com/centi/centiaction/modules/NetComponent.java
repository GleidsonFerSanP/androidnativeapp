package br.com.centi.centiaction.modules;

import javax.inject.Singleton;

import br.com.centi.centiaction.MainActivity;
import dagger.Component;

/**
 * Created by gleidson on 6/14/17.
 */

@Singleton
@Component(modules = {ApplicationModule.class, NetModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
}
