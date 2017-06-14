package br.com.centi.centiaction.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import br.com.centi.centiaction.annotations.ApplicationContext;
import br.com.centi.centiaction.annotations.DatabaseInfo;
import dagger.Module;
import dagger.Provides;

/**
 * Created by gleidson on 6/14/17.
 */
@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application app) {
        mApplication = app;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return "centi-action.db";
    }

    @Provides
    @DatabaseInfo
    Integer provideDatabaseVersion() {
        return 2;
    }

    @Provides
    SharedPreferences provideSharedPrefs() {
        return mApplication.getSharedPreferences("app-prefs", Context.MODE_PRIVATE);
    }
}
