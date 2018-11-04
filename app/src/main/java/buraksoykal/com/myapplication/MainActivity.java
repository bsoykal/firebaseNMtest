package buraksoykal.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.iid.FirebaseInstanceId;
import com.netmera.Netmera;
import com.netmera.NetmeraUser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        String token = FirebaseInstanceId.getInstance().getToken();
        ((TextView)findViewById(R.id.token)).setText(token);
        Log.i("MainActivity","Firebase Token :: "+token);
        NetmeraUser nu = new NetmeraUser();
        nu.setUserId("bsoykal");
        nu.setName("burak");
        nu.setSurname("soykal");
        Netmera.updateUser(nu);

    }
}
