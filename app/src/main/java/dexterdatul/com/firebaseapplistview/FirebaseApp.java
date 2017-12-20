package dexterdatul.com.firebaseapplistview;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Dexter John Datul on 20/12/2017.
 */

public class FirebaseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
