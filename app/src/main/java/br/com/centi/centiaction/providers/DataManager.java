package br.com.centi.centiaction.providers;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import br.com.centi.centiaction.annotations.ApplicationContext;

/**
 * Created by gleidson on 6/14/17.
 */
@Singleton
public class DataManager {

    private Context mContext;
    private DbHelper mDbHelper;
    private SharedPrefsHelper mSharedPrefsHelper;

    @Inject
    public DataManager(@ApplicationContext Context context,
                       DbHelper dbHelper,
                       SharedPrefsHelper sharedPrefsHelper) {
        mContext = context;
        mDbHelper = dbHelper;
        mSharedPrefsHelper = sharedPrefsHelper;
    }

    public void saveAccessToken(String accessToken) {
        mSharedPrefsHelper.put(SharedPrefsHelper.PREF_KEY_ACCESS_TOKEN, accessToken);
    }

    public String getAccessToken(){
        return mSharedPrefsHelper.get(SharedPrefsHelper.PREF_KEY_ACCESS_TOKEN, null);
    }

//    public Long createUser(User user) throws Exception {
//        return mDbHelper.insertUser(user);
//    }
//
//    public User getUser(Long userId) throws Resources.NotFoundException, NullPointerException {
//        return mDbHelper.getUser(userId);
//    }
}
