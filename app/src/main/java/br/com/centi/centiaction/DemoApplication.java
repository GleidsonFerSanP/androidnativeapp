package br.com.centi.centiaction;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import br.com.centi.centiaction.extras.Environment;
import br.com.centi.centiaction.modules.ApplicationComponent;
import br.com.centi.centiaction.modules.ApplicationModule;
import br.com.centi.centiaction.modules.DaggerApplicationComponent;
import br.com.centi.centiaction.modules.DaggerNetComponent;
import br.com.centi.centiaction.modules.NetComponent;
import br.com.centi.centiaction.modules.NetModule;
import br.com.centi.centiaction.providers.DataManager;

/**
 * Created by gleidson on 6/14/17.
 */

public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;
    private NetComponent mNetComponent;

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

        mNetComponent = DaggerNetComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .netModule(new NetModule(Environment.BASEPATH))
                .build();
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }

}
