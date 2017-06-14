package br.com.centi.centiaction.modules;

import br.com.centi.centiaction.annotations.PerActivity;
import br.com.centi.centiaction.api.NetworkApi;
import dagger.Component;

/**
 * Created by gleidson on 6/14/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = NetworkApiModule.class)
public interface NetworkApiComponent {
    void inject(NetworkApi networkApi);
}