package damoproductions.com.beerontap;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Damon on 23/10/2016.
 */
public class BeerTypes extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.beertypeswindow);


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .75), (int) (height * .55));

        Intent intentExtras = getIntent();
        Bundle bundleBeers = intentExtras.getExtras();
        final Integer intWorkerCount = bundleBeers.getInt("intWorkerCount", 0);
        final Integer moneyPerClick = bundleBeers.getInt("moneyPerClick", 0);
        final Integer breweryValue = bundleBeers.getInt("breweryValue", 0);

        final ImageView currentBeer;

        final TextView txtViewBeerTypesTitle;
        TextView txtViewBreweryValue;
        final TextView txtViewBeerType;
        final TextView txtViewBeerValue;
        final TextView txtViewBeerDesc;
        final Button btnPrestige;
       ImageButton btnRightArrow;
        ImageButton btnLeftArrow;

        currentBeer = (ImageView) findViewById(R.id.currentBeer);

        txtViewBeerTypesTitle = (TextView) findViewById(R.id.beers);
        txtViewBreweryValue = (TextView) findViewById(R.id.txtViewPrestigeBreweryValue);
        txtViewBeerType = (TextView) findViewById(R.id.textViewBeerType);
        txtViewBeerValue = (TextView) findViewById(R.id.textViewBeerValue);
        txtViewBeerDesc = (TextView) findViewById(R.id.textViewBeerDesc);

        btnPrestige =(Button) findViewById(R.id.buttonPrestige);
        btnRightArrow = (ImageButton) findViewById(R.id.buttonRightArrow);
        btnLeftArrow =(ImageButton) findViewById(R.id.buttonLeftArrow);


         Typeface mTypeface = Typeface.createFromAsset(getAssets(), "rootbeer.otf");
        txtViewBeerTypesTitle.setTypeface(mTypeface);
        txtViewBeerValue.setTypeface(mTypeface);
        txtViewBreweryValue.setTypeface(mTypeface);
        txtViewBeerType.setTypeface(mTypeface);
        txtViewBeerDesc.setTypeface(mTypeface);
        btnPrestige.setTypeface(mTypeface);

        txtViewBreweryValue.setText(String.valueOf("Brewery Value: $" + MainActivity.breweryValue));

        if (MainActivity.breweryValue >= 5000000){
btnPrestige.setText(R.string.prestigeButtonHealingBeer);
            btnPrestige.setAlpha(1.0f);
            btnPrestige.setEnabled(true);
        } else {
            btnPrestige.setText(R.string.prestigeButtonHealingBeerDisabled);
            btnPrestige.setEnabled(false);
        }

        if (MainActivity.prestiges == 1){
           btnPrestige.setEnabled(false);
            btnPrestige.setText(String.valueOf("MORE PRESTIGES COMING SOON"));
        }

        btnPrestige.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                MainActivity.prestiges ++;
                Toast.makeText(getApplicationContext(), "New Brewery Purchased", Toast.LENGTH_LONG).show();
                btnPrestige.setText(String.valueOf("MORE PRESTIGES COMING SOON"));
                MainActivity.btnBeerIcon.setImageResource(R.drawable.healschooner);
                MainActivity.btnBeerTypes.setImageResource(R.drawable.healschooner);

                MainActivity.intWorkerCount = 0;
                MainActivity.intViewMoneyCount = 0;
                MainActivity.moneyPerSec = 0;
                MainActivity.breweryValue = 0;
                MainActivity.floatMoneyPerWorker = 1;
                MainActivity.floatBeerValue = 2;
                MainActivity.moneyPerClick = 2;
                MainActivity.extras = 0;

                MainActivity.maxWorkers = 10;
                MainActivity.maxLevelBeerValueUpgrade = 0; //5
                MainActivity.maxLevelWorkerCapacityUpgrade = 0; //5
                MainActivity.btnIncreaseWorkerSpeedMaxLevel = 0; //5
                MainActivity.maxLevelBeerSalesUpgrade = 0; //5
                MainActivity.maxLevelBiggerKegs = 0; //5
                MainActivity.maxLevelTripleTapValue = 0; //1
                MainActivity.maxLevelDoubleWorkerOutput = 0; //5
                MainActivity.maxLevelHireRobots = 0; //5
                MainActivity.maxLevelWizardSchool = 0; //5

                MainActivity.intIncreaseBeerValuePrice = 100;

                MainActivity.intAddWorkerPrice = 10;

                MainActivity.intIncreaseWorkerSpeedUpgradePrice = 500;
                MainActivity.getIntIncreaseWorkerCapacityUpgradePrice = 2500;

                MainActivity.intIncreaseBeerSalesUpgradePrice = 5000;

                MainActivity.intBiggerKegsUpgradePrice = 20000;

                MainActivity.intTripleTapValue = 100000;

                MainActivity.intDoubleWorkerOutput = 500000;

                MainActivity.intHireRobotsUpgradePrice = 1000000;

                MainActivity.intWizardSchoolUpgradePrice = 6666666;

               MainActivity.txtViewAddWorkerPrice.setText(R.string.initialaddworkerprice);
                MainActivity.txtViewWorkerCount.setText(R.string.initialworkerCount);
                MainActivity.txtViewMoneyCountPerSec.setText(R.string.initialmoneyPerSec);

            }
        });

        btnRightArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentBeer.setImageResource(R.drawable.healschooner);
                txtViewBeerType.setText(R.string.healingBeerTitle);
                txtViewBeerValue.setText(R.string.healingBeerValue);
                txtViewBeerDesc.setText(R.string.healingBeerDesc);
            }
        });

        btnLeftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentBeer.setImageResource(R.drawable.schooner);
                txtViewBeerType.setText(R.string.standardBeerTitle);
                txtViewBeerValue.setText(R.string.standardBeerValue);
                txtViewBeerDesc.setText(R.string.standardBeerDesc);
            }
        });

    }
}