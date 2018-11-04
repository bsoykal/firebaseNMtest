package buraksoykal.com.myapplication;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.netmera.Netmera;

public class FirebaseListener extends FirebaseMessagingService {

    final String TAG = "FirebaseListener";


    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.i(TAG,"Message received from firebase");
        Netmera.onNetmeraPushMessageReceived(remoteMessage);
    }

    @Override
    public void onDeletedMessages() {
        super.onDeletedMessages();
        Log.i(TAG,"Message deleted");
    }

    @Override
    public void onMessageSent(String s) {
        super.onMessageSent(s);
        Log.i(TAG,"Message sent :: "+s);
    }

    @Override
    public void onSendError(String s, Exception e) {
        super.onSendError(s, e);
        Log.i(TAG,"Message sent error :: " + s);
    }

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.i(TAG,"New token :: " + s);
    }
}
