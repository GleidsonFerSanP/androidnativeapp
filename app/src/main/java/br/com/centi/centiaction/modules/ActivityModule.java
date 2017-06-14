package br.com.centi.centiaction.modules;

import android.app.Activity;
import android.content.Context;

import br.com.centi.centiaction.annotations.ActivityContext;
import dagger.Module;
import dagger.Provides;

/**
 * Created by gleidson on 6/14/17.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }
}
