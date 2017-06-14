package br.com.centi.centiaction;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import br.com.centi.centiaction.modules.ApplicationComponent;
import br.com.centi.centiaction.modules.ApplicationModule;
import br.com.centi.centiaction.modules.DaggerApplicationComponent;
import br.com.centi.centiaction.providers.DataManager;

/**
 * Created by gleidson on 6/14/17.
 */

public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }

}
