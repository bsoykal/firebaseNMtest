/*
 * Copyright (c) 2015 Inomera Research.
 */

package buraksoykal.com.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.netmera.NetmeraPushBroadcastReceiver;
import com.netmera.NetmeraPushObject;


/**
 * @author Emmar Kardeslik
 */
public class NGPushBroadcastReceiver extends NetmeraPushBroadcastReceiver {

  @Override
  protected void onPushRegister(Context context, String gcmSenderId, String pushToken) {
    Log.v("sample", "onPushRegister");

  }

  @Override
  protected void onPushReceive(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {
    Log.v("sample", "onPushReceive");

  }

  @Override
  protected void onPushOpen(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {
    Log.v("sample", "onPushOpen");

//    Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage("mobile.bkm.com.daggertest");
//    if (launchIntent != null) {
//      bundle.putBoolean("fromNotification",true);
//      bundle.putString("testerName","burak");
//      launchIntent.putExtras(bundle);
//
//      context.startActivity(launchIntent);//null pointer check in case package name was not found
//    }
  }

  @Override
  protected void onPushDismiss(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {
    Log.v("sample", "onPushDismiss");
  }

  @Override
  protected void onPushButtonClicked(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {
    Log.v("sample", "onPushButtonClicked");
  }
}
