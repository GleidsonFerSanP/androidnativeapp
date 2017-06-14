package br.com.centi.centiaction.modules;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import br.com.centi.centiaction.DemoApplication;
import br.com.centi.centiaction.annotations.ApplicationContext;
import br.com.centi.centiaction.providers.DataManager;
import br.com.centi.centiaction.providers.DbHelper;
import br.com.centi.centiaction.providers.SharedPrefsHelper;
import dagger.Component;

/**
 * Created by gleidson on 6/14/17.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}
