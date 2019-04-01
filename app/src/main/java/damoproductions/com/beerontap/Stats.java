package damoproductions.com.beerontap;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


public class Stats extends Activity {


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.statswindow);


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .65), (int) (height * .55));
        Intent intentExtras = getIntent();
        Bundle bundleStats = intentExtras.getExtras();
        final Integer intWorkerCount = bundleStats.getInt("intWorkerCount", 0);
        final Integer moneyPerClick = bundleStats.getInt("moneyPerClick", 0);
        final Integer breweryValue = bundleStats.getInt("breweryValue", 0);

        MainActivity.btnStats.setScaleY(1);
        MainActivity.btnStats.setScaleX(1);

        TextView txtViewWorkerCount;
        TextView txtViewMoneyPerTap;
        TextView stats;
        TextView workers;
        TextView incomePerTap;
        TextView beerValue;
        TextView txtViewBreweryValue;
        TextView intViewBreweryValue;
        TextView txtViewBeerValue;


        txtViewWorkerCount = (TextView) findViewById(R.id.textViewWorkerCount2);
        txtViewMoneyPerTap = (TextView) findViewById(R.id.textViewMoneyPerTap);
        txtViewBreweryValue = (TextView) findViewById(R.id.textViewBreweryValue);
        intViewBreweryValue = (TextView) findViewById(R.id.intViewBreweryValue);
        txtViewBeerValue = (TextView) findViewById(R.id.textViewBeerValue);


        workers = (TextView) findViewById(R.id.workers);
        incomePerTap = (TextView) findViewById(R.id.incomePerTap);
        beerValue = (TextView) findViewById(R.id.beerValue);
        stats = (TextView) findViewById(R.id.stats);

        txtViewWorkerCount.setText(String.valueOf(intWorkerCount));
        txtViewMoneyPerTap.setText(String.valueOf("$ " + moneyPerClick));
        intViewBreweryValue.setText(String.valueOf("$ " + breweryValue));
        txtViewBeerValue.setText(String.valueOf("$ " + MainActivity.floatBeerValue));

        Typeface mTypeface = Typeface.createFromAsset(getAssets(), "rootbeer.otf");
        txtViewWorkerCount.setTypeface(mTypeface);
        txtViewMoneyPerTap.setTypeface(mTypeface);
        txtViewBreweryValue.setTypeface(mTypeface);
        intViewBreweryValue.setTypeface(mTypeface);
        workers.setTypeface(mTypeface);
        incomePerTap.setTypeface(mTypeface);
        beerValue.setTypeface(mTypeface);
        stats.setTypeface(mTypeface);
        txtViewBeerValue.setTypeface(mTypeface);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Stats Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://damoproductions.com.beerontap/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Stats Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://damoproductions.com.beerontap/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
