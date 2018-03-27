package e.sanjaaykishore.mech;

/**
 * Created by Mouly Akash on 26-03-2018.
 */

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.firebase.geofire.GeoFire;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Mouly Akash on 26-03-2018.
 */

public class onAppKilled extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
String user_id="";

      if(user_id!="")
      {
        String userId = FirebaseAuth.getInstance().getCurrentUser().getUid();

           DatabaseReference ref = FirebaseDatabase.getInstance().getReference("AvailableMechanic");


           GeoFire geoFire = new GeoFire(ref);
           geoFire.removeLocation(userId);
           String user_Id="";
       }
       }
}
