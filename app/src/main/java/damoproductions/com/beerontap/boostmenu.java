package damoproductions.com.beerontap;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by Damon on 23/10/2016.
 */
public class boostmenu extends Activity {


    InterstitialAd mInterstitialAd;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.boostwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .75), (int) (height * .55));

        ImageButton adboost;
        TextView txtViewWatchAd;
        TextView txtViewTwoHourBoost;
        TextView txtViewBoost;

        adboost = (ImageButton) findViewById(R.id.adboost);
        txtViewBoost = (TextView) findViewById(R.id.textViewBoost);
        txtViewTwoHourBoost = (TextView) findViewById(R.id.textViewTwoHourBoost);
        txtViewWatchAd = (TextView) findViewById(R.id.textViewWatchAd);

        Typeface mTypeface = Typeface.createFromAsset(getAssets(), "rootbeer.otf");
        txtViewBoost.setTypeface(mTypeface);
        txtViewTwoHourBoost.setTypeface(mTypeface);
        txtViewWatchAd.setTypeface(mTypeface);


        adboost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                    Toast.makeText(getApplicationContext(), "Bonus Added!", Toast.LENGTH_LONG).show();
                    MainActivity.intViewMoneyCount += MainActivity.moneyPerSec * 120;
                    //MainActivity.moneyPerSec = MainActivity.moneyPerSec*2;
                    //MainActivity.txtViewMoneyCountPerSec.setText(String.valueOf("$" + Math.round(MainActivity.moneyPerSec) + " Per Sec."));
                }

            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-5336619418792002/5507131770");
        AdRequest request = new AdRequest.Builder()
                // .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mInterstitialAd.loadAd(request);


    }
}


