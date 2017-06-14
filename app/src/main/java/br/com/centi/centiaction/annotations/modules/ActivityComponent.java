package br.com.centi.centiaction.annotations.modules;

import br.com.centi.centiaction.MainActivity;
import br.com.centi.centiaction.annotations.PerActivity;
import dagger.Component;

/**
 * Created by gleidson on 6/14/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}