/*
 * Copyright (c) 2015 Inomera Research.
 */

package buraksoykal.com.myapplication;

import android.app.Application;
import com.netmera.Netmera;

/**
 * @author Emmar Kardeslik
 */
public class NGApplication extends Application {

  public static String userId;
  final String API_KEY = "c55bbAR3gCy6w4cNsD2IndS7i6m2H_vDyY1gEvc2iYxfpi5jS0HIzw";
  final String API_KEY1 = "7jrKeeaLdw6A6BAelv-RLl29bXm6qSVUYZnkIplijTPYWfaQxM2UqRfTio035PQXkR322in-_CM";

  @Override
  public void onCreate() {
    super.onCreate();
    Netmera.logging(true);
    Netmera.init(this,"3804694368",API_KEY1);
//    Netmera.setBaseUrl("http://nova.sdpaas.com");
  }
}
