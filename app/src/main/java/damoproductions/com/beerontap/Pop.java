package damoproductions.com.beerontap;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


public class Pop extends Activity {


    public ProgressBar progressBarGoldenTouch;
    public ProgressBar progressBarSteroids;
    public ProgressBar progressBarWorkerHousing;
    public ProgressBar progressBarAdvertisment;
    public ProgressBar progressBarBiggerKegs;
    public ProgressBar progressBarProTapper;
    public ProgressBar progressBar24hrShifts;
    public ProgressBar progressBarHireRobots;
    public ProgressBar progressBarWizardSchool;



    private GoogleApiClient client;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popwindow);


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .85), (int) (height * .68));


        MainActivity.moneyPerSec = MainActivity.floatMoneyPerWorker * MainActivity.floatBeerValue * MainActivity.intWorkerCount + MainActivity.extras;



        //MainActivity.progressStatusGoldenTouch = progressBarGoldenTouch.getProgress();
        //int maxValue =progressBar.getMax();
        Intent intentExtras = getIntent();
        Bundle bundle = intentExtras.getExtras();
        final Integer intIncreaseBeerValuePrice = bundle.getInt("intIncreaseBeerValuePrice", 0);
        final Integer intIncreaseWorkerSpeedPrice = bundle.getInt("intIncreaseWorkerSpeedPrice", 0);
        final Integer intIncreaseWorkerCapacityPrice = bundle.getInt("intIncreaseWorkerCapacityPrice", 0);
        final Integer intIncreaseBeerSalesPrice = bundle.getInt("intIncreaseBeerSalesPrice", 0);
        final Integer intBiggerKegsUpgradePrice = bundle.getInt("intBiggerKegsUpgradePrice", 0);
        final Integer intHireRobotsUpgradePrice = bundle.getInt("intHireRobotsUpgradePrice", 0);
        final Integer intWizardSchoolUpgradePrice = bundle.getInt("intWizardSchoolUpgradePrice", 0);
        final Integer goldenBeers = bundle.getInt("goldenBeers", 0);
        //final Integer progressStatusGoldenTouch = bundle.getInt("progressStatusGoldenTouch", 0);





        final Button btnIncreaseBeerValue2;
        final Button btnIncreaseWorkerSpeedUpgrade2;
        final Button btnIncreaseWorkerCapacityUpgrade2;
        final Button btnIncreaseBeerSalesUpgrade2;
        final Button btnBiggerKegsUpgrade;
        final Button btntripleTapValue;
        final Button btnDoubleWorkerOutput;
        final Button btnHireRobots;
        final Button btnWizardSchool;
        final TextView txtViewIncreaseBeerValuePriceUpgradePrice2;
        final TextView txtViewIncreaseWorkerSpeedUpgradePrice2;
        final TextView txtViewIncreaseWorkerCapacityUpgradePrice2;
        final TextView txtViewIncreaseBeerSalesUpgradePrice2;


        final int intBiggerKegsPrice = 20000;

        final int intTripleTapValuePrice = 100000;
        final TextView txtViewTripleTapValuePrice;

        final int intDoubleWorkerOutputPrice = 500000;
        final TextView txtViewDoubleWorkerOutputPrice;

        final int intHireRobotsPrice = 1000000;
        final TextView txtViewHireRobotsPrice;

        final int intWizardSchoolPrice = 6666666;

        //PROGRESS

        progressBarGoldenTouch = (ProgressBar) findViewById(R.id.progressBarGoldenTouch);
        progressBarSteroids = (ProgressBar) findViewById(R.id.progressBarSteroids);
        progressBarWorkerHousing = (ProgressBar) findViewById(R.id.progressBarWorkerHousing);
        progressBarAdvertisment = (ProgressBar) findViewById(R.id.progressBarAdvertisment);
        progressBarBiggerKegs = (ProgressBar) findViewById(R.id.progressBarBiggerKegs);
        progressBarProTapper = (ProgressBar) findViewById(R.id.progressBarProTapper);
        progressBar24hrShifts = (ProgressBar) findViewById(R.id.progressBar24hrShifts);
        progressBarHireRobots = (ProgressBar) findViewById(R.id.progressBarHireRobots);
        progressBarWizardSchool = (ProgressBar) findViewById(R.id.progressBarWizardSchool);

        progressBarGoldenTouch.setProgress(MainActivity.progressStatusGoldenTouch);
        progressBarSteroids.setProgress(MainActivity.progressStatusSteroids);
        progressBarWorkerHousing.setProgress(MainActivity.progressStatusWorkerHousing);
        progressBarAdvertisment.setProgress(MainActivity.progressStatusAdvertisment);
        progressBarBiggerKegs.setProgress(MainActivity.progressStatusBiggerKegs);
        progressBarProTapper.setProgress(MainActivity.progressStatusProTapper);
        progressBar24hrShifts.setProgress(MainActivity.progressStatus24hrShifts);
        progressBarHireRobots.setProgress(MainActivity.progressStatusHireRobots);
        progressBarWizardSchool.setProgress(MainActivity.progressStatusWizardSchool);

        btnIncreaseBeerValue2 = (Button) findViewById(R.id.buttonIncreaseBeerValueUpgrade2);
        btnIncreaseWorkerSpeedUpgrade2 = (Button) findViewById(R.id.buttonIncreaseWorkerSpeedUpgrade2);
        btnIncreaseWorkerCapacityUpgrade2 = (Button) findViewById(R.id.buttonIncreaseWorkerCapacityUpgrade2);
        btnIncreaseBeerSalesUpgrade2 = (Button) findViewById(R.id.buttonIncreaseBeerSalesUpgrade2);
        btnBiggerKegsUpgrade = (Button) findViewById(R.id.buttonBiggerKegsUpgrade2);
        btntripleTapValue = (Button) findViewById(R.id.buttonTripleTapValueUpgrade2);
        btnDoubleWorkerOutput = (Button) findViewById(R.id.buttonDoubleWorkerOutputUpgrade2);
        btnHireRobots = (Button) findViewById(R.id.buttonHireRobots);
        btnWizardSchool = (Button) findViewById(R.id.buttonWizardSchool);

        //txtViewIncreaseBeerValuePriceUpgradePrice2 = (TextView) findViewById(R.id.textViewIncreaseBeerValueUpgradePrice2);
        //txtViewIncreaseWorkerSpeedUpgradePrice2 = (TextView) findViewById(R.id.textViewIncreaseWorkerSpeedUpgradePrice2);
        //txtViewIncreaseWorkerCapacityUpgradePrice2 = (TextView) findViewById(R.id.textViewIncreaseWorkerCapacityUpgradePrice2);
        //txtViewIncreaseBeerSalesUpgradePrice2 = (TextView) findViewById(R.id.textViewIncreaseBeerSalesUpgradePrice2);
        //txtViewTripleTapValuePrice = (TextView) findViewById(R.id.textViewTripleTapValueUpgradePrice2);
        //txtViewDoubleWorkerOutputPrice = (TextView) findViewById(R.id.textViewDoubleWorkerOutputUpgradePrice2);
       // txtViewHireRobotsPrice = (TextView) findViewById(R.id.textViewHireRobotsPrice);

        TextView upgradesHeader;
        TextView goldenTouchDesc;
        TextView steroidsDesc;
        TextView workerHousingDesc;
        TextView advertisingDesc;
        TextView biggerKegsDesc;

        TextView proTapperDesc;
        TextView twentyfourhrShiftsDesc;
        TextView hireRobotsDesc;
        TextView wizardSchoolDesc;
        TextView goldenTouch;
        TextView steroids;
        TextView workerHousing;
        TextView advertising;
        TextView biggerKegs;
        TextView proTapper;
        TextView twentyfourhrshifts;
        TextView hireRobots;
        TextView wizardSchool;


        upgradesHeader = (TextView) findViewById(R.id.upgradesHeader);
        goldenTouchDesc = (TextView) findViewById(R.id.goldenTouchDesc);
        steroidsDesc = (TextView) findViewById(R.id.steroidsDesc);
        workerHousingDesc = (TextView) findViewById(R.id.workerHousingDesc);
        advertisingDesc = (TextView) findViewById(R.id.advertisingDesc);
        biggerKegsDesc = (TextView) findViewById(R.id.biggerKegsDesc);
        proTapperDesc = (TextView) findViewById(R.id.proTapperDesc);
        twentyfourhrShiftsDesc = (TextView) findViewById(R.id.twentyfourhrShiftsDesc);
       hireRobotsDesc = (TextView) findViewById(R.id.hireRobotsDesc);
        wizardSchoolDesc = (TextView) findViewById(R.id.wizardSchoolDescription);
        goldenTouch = (TextView) findViewById(R.id.goldenTouch);
        steroids = (TextView) findViewById(R.id.steroids);
        workerHousing = (TextView) findViewById(R.id.workerHousing);
        advertising = (TextView) findViewById(R.id.advertisment);
        biggerKegs = (TextView) findViewById(R.id.biggerKegs);
        proTapper = (TextView) findViewById(R.id.protapper);
        twentyfourhrshifts = (TextView) findViewById(R.id.twentyfourhrShifts);
       hireRobots = (TextView) findViewById(R.id.hireRobots);
        wizardSchool = (TextView) findViewById(R.id.wizardSchool);


        Typeface mTypeface = Typeface.createFromAsset(getAssets(), "rootbeer.otf");
        upgradesHeader.setTypeface(mTypeface);
        goldenTouchDesc.setTypeface(mTypeface);
        steroidsDesc.setTypeface(mTypeface);
        workerHousingDesc.setTypeface(mTypeface);
        advertisingDesc.setTypeface(mTypeface);
        biggerKegsDesc.setTypeface(mTypeface);
        proTapperDesc.setTypeface(mTypeface);
        twentyfourhrShiftsDesc.setTypeface(mTypeface);
        hireRobotsDesc.setTypeface(mTypeface);
        wizardSchoolDesc.setTypeface(mTypeface);
        goldenTouch.setTypeface(mTypeface);
        steroids.setTypeface(mTypeface);
        workerHousing.setTypeface(mTypeface);
        advertising.setTypeface(mTypeface);
        biggerKegs.setTypeface(mTypeface);
        proTapper.setTypeface(mTypeface);
        twentyfourhrshifts.setTypeface(mTypeface);
        hireRobots.setTypeface(mTypeface);
        wizardSchool.setTypeface(mTypeface);

        //txtViewIncreaseBeerValuePriceUpgradePrice2.setTypeface(mTypeface);
       //txtViewIncreaseWorkerCapacityUpgradePrice2.setTypeface(mTypeface);
        //txtViewIncreaseWorkerSpeedUpgradePrice2.setTypeface(mTypeface);
        //txtViewIncreaseBeerSalesUpgradePrice2.setTypeface(mTypeface);
       // txtViewTripleTapValuePrice.setTypeface(mTypeface);
        //txtViewDoubleWorkerOutputPrice.setTypeface(mTypeface);
        //txtViewHireRobotsPrice.setTypeface(mTypeface);

        btnIncreaseBeerValue2.setTypeface(mTypeface);
        btnIncreaseWorkerSpeedUpgrade2.setTypeface(mTypeface);
        btnIncreaseWorkerCapacityUpgrade2.setTypeface(mTypeface);
        btnIncreaseBeerSalesUpgrade2.setTypeface(mTypeface);
        btnBiggerKegsUpgrade.setTypeface(mTypeface);
        btntripleTapValue.setTypeface(mTypeface);
        btnDoubleWorkerOutput.setTypeface(mTypeface);
        btnHireRobots.setTypeface(mTypeface);
        btnWizardSchool.setTypeface(mTypeface);

        MainActivity.btnUpgrades.setScaleY(1);
        MainActivity.btnUpgrades.setScaleX(1);

       if (MainActivity.maxLevelTripleTapValue < 1){
           btntripleTapValue.setText(String.valueOf("$" + intTripleTapValuePrice));
       } else {
           btntripleTapValue.setText(getString(R.string.maxLevel));
       }

        if (MainActivity.maxLevelHireRobots <= 4){
            btnHireRobots.setText(String.valueOf("$" + intHireRobotsUpgradePrice));
        } else {
           btnHireRobots.setText(getString(R.string.maxLevel));
        }

        if (MainActivity.maxLevelBeerValueUpgrade <= 4)
        {btnIncreaseBeerValue2.setText(String.valueOf("$" + intIncreaseBeerValuePrice));}
        else {
           btnIncreaseBeerValue2.setText(getString(R.string.maxLevel));
        }

        if (MainActivity.btnIncreaseWorkerSpeedMaxLevel <= 4) {
            btnIncreaseWorkerSpeedUpgrade2.setText(String.valueOf("$" + intIncreaseWorkerSpeedPrice));
        } else {
            btnIncreaseWorkerSpeedUpgrade2.setText(getString(R.string.maxLevel));
        }

        if (MainActivity.maxLevelWorkerCapacityUpgrade <= 4) {
            btnIncreaseWorkerCapacityUpgrade2.setText(String.valueOf("$" + intIncreaseWorkerCapacityPrice));
        } else {
            btnIncreaseWorkerCapacityUpgrade2.setText(getString(R.string.maxLevel));
        }
        if (MainActivity.maxLevelBeerSalesUpgrade <= 4) {
            btnIncreaseBeerSalesUpgrade2.setText(String.valueOf("$" + intIncreaseBeerSalesPrice));
        } else {
            btnIncreaseBeerSalesUpgrade2.setText(getString(R.string.maxLevel));
        }
        if (MainActivity.maxLevelBiggerKegs <= 4) {
            btnBiggerKegsUpgrade.setText(String.valueOf("$" + intBiggerKegsUpgradePrice));
        } else {
            btnBiggerKegsUpgrade.setText(getString(R.string.maxLevel));
        }
        if (MainActivity.maxLevelDoubleWorkerOutput < 1) {
            btnDoubleWorkerOutput.setText(String.valueOf("$" + intDoubleWorkerOutputPrice));
        } else {
            btnDoubleWorkerOutput.setText(getString(R.string.maxLevel));
        }
        if (MainActivity.maxLevelWizardSchool <= 4) {
            btnWizardSchool.setText(String.valueOf("$" + intWizardSchoolUpgradePrice));
        } else {
            btnWizardSchool.setText(getString(R.string.maxLevel));
        }

        btnIncreaseBeerValue2.setEnabled(false);
        btnIncreaseWorkerSpeedUpgrade2.setEnabled(false);
        btnIncreaseWorkerCapacityUpgrade2.setEnabled(false);
        btnIncreaseBeerSalesUpgrade2.setEnabled(false);
        btnBiggerKegsUpgrade.setEnabled(false);
        btntripleTapValue.setEnabled(false);
        btnDoubleWorkerOutput.setEnabled(false);
        btnHireRobots.setEnabled(false);
        btnWizardSchool.setEnabled(false);


        if (MainActivity.intViewMoneyCount >= intIncreaseBeerValuePrice && MainActivity.maxLevelBeerValueUpgrade <= 4){
            btnIncreaseBeerValue2.setAlpha(1.0f);
        } else {
            btnIncreaseBeerValue2.setAlpha(0.3f);
        }

        if (MainActivity.intViewMoneyCount >= intIncreaseWorkerSpeedPrice && MainActivity.btnIncreaseWorkerSpeedMaxLevel <= 4){
            btnIncreaseWorkerSpeedUpgrade2.setAlpha(1.0f);
        } else {
            btnIncreaseWorkerSpeedUpgrade2.setAlpha(0.3f);
        }

        if (MainActivity.intViewMoneyCount >= intIncreaseWorkerCapacityPrice && MainActivity.maxLevelWorkerCapacityUpgrade <= 4){
            btnIncreaseWorkerCapacityUpgrade2.setAlpha(1.0f);
        } else {
            btnIncreaseWorkerCapacityUpgrade2.setAlpha(0.3f);
        }

        if (MainActivity.intViewMoneyCount >= intIncreaseBeerSalesPrice && MainActivity.maxLevelBeerSalesUpgrade <= 4){
            btnIncreaseBeerSalesUpgrade2.setAlpha(1.0f);
        } else {
            btnIncreaseBeerSalesUpgrade2.setAlpha(0.3f);
        }

        if (MainActivity.intViewMoneyCount >= intBiggerKegsPrice && MainActivity.maxLevelBiggerKegs <= 4){
            btnBiggerKegsUpgrade.setAlpha(1.0f);
        } else {
            btnBiggerKegsUpgrade.setAlpha(0.3f);
        }

        if (MainActivity.intViewMoneyCount >= intTripleTapValuePrice && MainActivity.maxLevelTripleTapValue < 1){
            btntripleTapValue.setAlpha(1.0f);
        } else {
            btntripleTapValue.setAlpha(0.3f);
        }

        if (MainActivity.intViewMoneyCount >= intDoubleWorkerOutputPrice && MainActivity.maxLevelDoubleWorkerOutput < 1){
            btnDoubleWorkerOutput.setAlpha(1.0f);
        } else {
            btnDoubleWorkerOutput.setAlpha(0.3f);
        }

        if (MainActivity.intViewMoneyCount >= intHireRobotsPrice && MainActivity.maxLevelHireRobots <= 4){
            btnHireRobots.setAlpha(1.0f);
        } else {
            btnHireRobots.setAlpha(0.3f);
        }


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        btnIncreaseBeerValue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseBeerValuePrice && MainActivity.maxLevelBeerValueUpgrade < 5) {

                    MainActivity.moneyPerClick *= 2;
                    MainActivity.intViewMoneyCount -= MainActivity.intIncreaseBeerValuePrice;
                    MainActivity.intIncreaseBeerValuePrice *= 2;
                    MainActivity.maxLevelBeerValueUpgrade++;
                    int intIncreaseBeerValuePrice2 = MainActivity.intIncreaseBeerValuePrice;
                    //txtViewIncreaseBeerValuePriceUpgradePrice2.setText(String.valueOf("$ " + intIncreaseBeerValuePrice2));
                    //MainActivity.txtViewIncreaseBeerValuePrice.setText(String.valueOf(intIncreaseBeerValuePrice));
                    //MainActivity.intViewMoneyCount.setText(String.valueOf("$ " + MainActivity.intViewMoneyCount));
                    MainActivity.goldenBeers+=1;
                    MainActivity.progressStatusGoldenTouch += 1;
                    progressBarGoldenTouch.setProgress(MainActivity.progressStatusGoldenTouch);


                    btnIncreaseBeerValue2.setText(String.valueOf("$" + MainActivity.intIncreaseBeerValuePrice));

                    MainActivity.txtViewGoldenBeers.setText(String.valueOf("Golden Beers: " + MainActivity.goldenBeers));


                } else {

                    btnIncreaseBeerValue2.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= intIncreaseBeerValuePrice && MainActivity.maxLevelBeerValueUpgrade < 5){
                    btnIncreaseBeerValue2.setAlpha(1.0f);
                } else {
                    btnIncreaseBeerValue2.setAlpha(0.3f);
                }

                if (MainActivity.maxLevelBeerValueUpgrade == 5) {
                    btnIncreaseBeerValue2.setText(getString(R.string.maxLevel));
                    String txtViewIncreaseBeerValueUpgradePrice2 = ("MAX LEVEL");
                    btnIncreaseBeerValue2.setText(txtViewIncreaseBeerValueUpgradePrice2);
                    btnIncreaseBeerValue2.setEnabled(false);
                    MainActivity.txtViewIncreaseBeerValuePrice.setTextSize(10);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseWorkerSpeedUpgradePrice && MainActivity.btnIncreaseWorkerSpeedMaxLevel <= 4) {
                    btnIncreaseWorkerSpeedUpgrade2.setEnabled(true);
                } else {
                    btnIncreaseWorkerSpeedUpgrade2.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.getIntIncreaseWorkerCapacityUpgradePrice) {
                    btnIncreaseWorkerCapacityUpgrade2.setEnabled(true);
                } else {
                    btnIncreaseWorkerCapacityUpgrade2.setEnabled(false);
                }

                if (MainActivity.intWorkerCount != MainActivity.maxWorkers && MainActivity.intViewMoneyCount >= MainActivity.intAddWorkerPrice) {
                    MainActivity.btnAddWorker.setEnabled(true);
                } else {
                    MainActivity.btnAddWorker.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseBeerValuePrice) {
                    btnIncreaseBeerValue2.setEnabled(true);
                } else {
                    btnIncreaseBeerValue2.setEnabled(false);
                }


            }

        });

        btnIncreaseWorkerSpeedUpgrade2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseWorkerSpeedUpgradePrice && MainActivity.btnIncreaseWorkerSpeedMaxLevel < 5) {
                    MainActivity.intViewMoneyCount -= MainActivity.intIncreaseWorkerSpeedUpgradePrice;
                    MainActivity.floatMoneyPerWorker *= 2;
                    MainActivity.moneyPerSec = MainActivity.intWorkerCount * MainActivity.floatMoneyPerWorker;
                    MainActivity.moneyPerSec = MainActivity.floatMoneyPerWorker * MainActivity.floatBeerValue * MainActivity.intWorkerCount + MainActivity.extras;
                    MainActivity.txtViewMoneyCountPerSec.setText(String.valueOf("$ " + Math.round(MainActivity.moneyPerSec) + " Per Sec."));
                    MainActivity.intIncreaseWorkerSpeedUpgradePrice *= 2;
                    MainActivity.txtViewIncreaseWorkerSpeedPrice.setText(String.valueOf(MainActivity.intIncreaseWorkerSpeedUpgradePrice));
                    MainActivity.btnIncreaseWorkerSpeedMaxLevel++;
                    int intIncreaseWorkerSpeedPrice2 = MainActivity.intIncreaseWorkerSpeedUpgradePrice;
                    btnIncreaseWorkerSpeedUpgrade2.setText(String.valueOf("$ " + intIncreaseWorkerSpeedPrice2));
                    MainActivity.txtViewIncreaseWorkerSpeedPrice.setText(String.valueOf(intIncreaseWorkerSpeedPrice));

                    MainActivity.goldenBeers+=1;
                    MainActivity.progressStatusSteroids += 1;
                    progressBarSteroids.setProgress(MainActivity.progressStatusSteroids);

                    MainActivity.txtViewGoldenBeers.setText(String.valueOf("Golden Beers: " + MainActivity.goldenBeers));
                } else {
                    btnIncreaseWorkerSpeedUpgrade2.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= intIncreaseWorkerSpeedPrice && MainActivity.btnIncreaseWorkerSpeedMaxLevel < 5){
                    btnIncreaseWorkerSpeedUpgrade2.setAlpha(1.0f);
                } else {
                    btnIncreaseWorkerSpeedUpgrade2.setAlpha(0.3f);
                }

                if (MainActivity.btnIncreaseWorkerSpeedMaxLevel == 5) {
                    btnIncreaseWorkerSpeedUpgrade2.setText(getString(R.string.maxLevel));
                    btnIncreaseBeerValue2.setEnabled(false);
                    MainActivity.txtViewIncreaseBeerValuePrice.setTextSize(10);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseWorkerSpeedUpgradePrice && MainActivity.btnIncreaseWorkerSpeedMaxLevel < 5) {
                    btnIncreaseWorkerSpeedUpgrade2.setEnabled(true);
                } else {
                    btnIncreaseWorkerSpeedUpgrade2.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.getIntIncreaseWorkerCapacityUpgradePrice) {
                    btnIncreaseWorkerCapacityUpgrade2.setEnabled(true);
                } else {
                     btnIncreaseWorkerCapacityUpgrade2.setEnabled(false);
                }

                if (MainActivity.intWorkerCount != MainActivity.maxWorkers && MainActivity.intViewMoneyCount >= MainActivity.intAddWorkerPrice) {
                    MainActivity.btnAddWorker.setEnabled(true);
                } else {
                    MainActivity.btnAddWorker.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseBeerValuePrice) {
                    btnIncreaseBeerValue2.setEnabled(true);
                } else {
                    btnIncreaseBeerValue2.setEnabled(false);
                }


            }
        });

        btnIncreaseWorkerCapacityUpgrade2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.maxLevelWorkerCapacityUpgrade < 5) {
                    MainActivity.intViewMoneyCount -= MainActivity.getIntIncreaseWorkerCapacityUpgradePrice;
                    MainActivity.maxWorkers *= 2;
                    MainActivity.getIntIncreaseWorkerCapacityUpgradePrice *= 4;
                    MainActivity.txtViewIncreaseWorkerCapacityPrice.setText(String.valueOf(MainActivity.getIntIncreaseWorkerCapacityUpgradePrice));
                    MainActivity.txtViewMoneyCount.setText(String.valueOf("$ " + MainActivity.intViewMoneyCount));
                    MainActivity.txtViewAddWorkerPrice.setText(String.valueOf("$ " + MainActivity.intAddWorkerPrice));
                    MainActivity.maxLevelWorkerCapacityUpgrade++;
                    int intIncreaseWorkerCapacityPrice2 = MainActivity.getIntIncreaseWorkerCapacityUpgradePrice;
                    btnIncreaseWorkerCapacityUpgrade2.setText(String.valueOf("$ " + intIncreaseWorkerCapacityPrice2));
                    MainActivity.txtViewIncreaseWorkerCapacityPrice.setText(String.valueOf("$ " + intIncreaseWorkerCapacityPrice));
                    MainActivity.txtViewAddWorkerPrice.setTextSize(16);

                    MainActivity.goldenBeers+=1;

                    MainActivity.progressStatusWorkerHousing += 1;
                    progressBarWorkerHousing.setProgress(MainActivity.progressStatusWorkerHousing);

                    MainActivity.txtViewGoldenBeers.setText(String.valueOf("Golden Beers: " + MainActivity.goldenBeers));
                } else {
                    btnIncreaseWorkerCapacityUpgrade2.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= intIncreaseWorkerCapacityPrice && MainActivity.maxLevelWorkerCapacityUpgrade < 5){
                    btnIncreaseWorkerCapacityUpgrade2.setAlpha(1.0f);
                } else {
                    btnIncreaseWorkerCapacityUpgrade2.setAlpha(0.3f);
                }

                if (MainActivity.maxLevelWorkerCapacityUpgrade == 5) {
                    btnIncreaseWorkerCapacityUpgrade2.setEnabled(false);
                   btnIncreaseWorkerCapacityUpgrade2.setText(getString(R.string.maxLevel));
                    MainActivity.txtViewIncreaseWorkerCapacityPrice.setTextSize(10);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseWorkerSpeedUpgradePrice && MainActivity.btnIncreaseWorkerSpeedMaxLevel < 5) {
                    btnIncreaseWorkerSpeedUpgrade2.setEnabled(true);
                } else {
                    btnIncreaseWorkerSpeedUpgrade2.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.getIntIncreaseWorkerCapacityUpgradePrice) {
                    btnIncreaseWorkerCapacityUpgrade2.setEnabled(true);
                } else {
                    btnIncreaseWorkerCapacityUpgrade2.setEnabled(false);
                }

                if (MainActivity.intWorkerCount != MainActivity.maxWorkers && MainActivity.intViewMoneyCount >= MainActivity.intAddWorkerPrice) {
                    MainActivity.btnAddWorker.setEnabled(true);
                } else {
                    MainActivity.btnAddWorker.setEnabled(false);
                }

                if (intIncreaseBeerValuePrice <= MainActivity.intViewMoneyCount && MainActivity.maxLevelBeerValueUpgrade < 5) {
                    btnIncreaseBeerValue2.setEnabled(true);
                } else {
                    btnIncreaseBeerValue2.setEnabled(false);
                }



            }
        });

        btnIncreaseBeerSalesUpgrade2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.maxLevelBeerSalesUpgrade < 5) {
                    MainActivity.intViewMoneyCount -= MainActivity.intIncreaseBeerSalesUpgradePrice;
                    MainActivity.moneyPerSec *= 1.1f;
                    MainActivity.intIncreaseBeerSalesUpgradePrice *= 3;
                    MainActivity.maxLevelBeerSalesUpgrade++;

                    MainActivity.txtViewMoneyCount.setText(String.valueOf("$ " + MainActivity.intViewMoneyCount));
                    //MainActivity.moneyPerSec = MainActivity.floatMoneyPerWorker * MainActivity.floatBeerValue * MainActivity.intWorkerCount + MainActivity.extras;

                    MainActivity.txtViewMoneyCountPerSec.setText(String.valueOf("$ " + Math.round(MainActivity.moneyPerSec) + " Per Sec."));
                    MainActivity.txtViewIncreaseBeerSalesPrice.setText(String.valueOf(MainActivity.intIncreaseBeerSalesUpgradePrice));

                    int intIncreaseBeerSalesPrice2 = MainActivity.intIncreaseBeerSalesUpgradePrice;
                   btnIncreaseBeerSalesUpgrade2.setText(String.valueOf("$" + intIncreaseBeerSalesPrice2));
                    MainActivity.txtViewIncreaseBeerSalesPrice.setText(String.valueOf(intIncreaseBeerSalesPrice));

                    MainActivity.goldenBeers+=1;

                    MainActivity.progressStatusAdvertisment += 1;
                    progressBarAdvertisment.setProgress(MainActivity.progressStatusAdvertisment);

                    MainActivity.txtViewGoldenBeers.setText(String.valueOf("Golden Beers: " + MainActivity.goldenBeers));
                } else {
                    btnIncreaseBeerSalesUpgrade2.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= intIncreaseBeerSalesPrice && MainActivity.maxLevelBeerSalesUpgrade < 5){
                    btnIncreaseBeerSalesUpgrade2.setAlpha(1.0f);
                } else {
                    btnIncreaseBeerSalesUpgrade2.setAlpha(0.3f);
                }

                if (MainActivity.maxLevelBeerSalesUpgrade == 5) {
                    btnIncreaseBeerSalesUpgrade2.setEnabled(false);
                   btnIncreaseBeerSalesUpgrade2.setText(getString(R.string.maxLevel));
                    MainActivity.txtViewIncreaseBeerSalesPrice.setTextSize(10);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseBeerSalesUpgradePrice) {
                    btnIncreaseBeerSalesUpgrade2.setEnabled(true);
                } else {
                    btnIncreaseBeerSalesUpgrade2.setEnabled(false);
                }


            }
        });

        btnBiggerKegsUpgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.intViewMoneyCount >= intBiggerKegsPrice && MainActivity.maxLevelBiggerKegs <=4) {
                    int intBiggerKegsUpgradePrice2 = MainActivity.intBiggerKegsUpgradePrice;
                    MainActivity.intViewMoneyCount -= intBiggerKegsUpgradePrice2;
                    MainActivity.floatBeerValue *= 1.25;
                    MainActivity.maxLevelBiggerKegs ++;


                    intBiggerKegsUpgradePrice2 *=1.5;
                    MainActivity.intBiggerKegsUpgradePrice = intBiggerKegsUpgradePrice2;


                    MainActivity.moneyPerSec = MainActivity.floatMoneyPerWorker * MainActivity.floatBeerValue * MainActivity.intWorkerCount + MainActivity.extras;
                    MainActivity.txtViewMoneyCountPerSec.setText(String.valueOf("$" + Math.round(MainActivity.moneyPerSec) + " Per Sec."));
                    MainActivity.txtViewMoneyCount.setText(String.valueOf("$ " + MainActivity.intViewMoneyCount));
                    btnBiggerKegsUpgrade.setText(String.valueOf("$" + intBiggerKegsUpgradePrice2));
                    MainActivity.goldenBeers+=1;

                    MainActivity.progressStatusBiggerKegs += 1;
                    progressBarBiggerKegs.setProgress(MainActivity.progressStatusBiggerKegs);

                    MainActivity.txtViewGoldenBeers.setText(String.valueOf("Golden Beers: " + MainActivity.goldenBeers));
                } else {
                    btnHireRobots.setEnabled(false);
                }

                if (MainActivity.maxLevelBiggerKegs == 5){
                    btnBiggerKegsUpgrade.setEnabled(false);
                    btnBiggerKegsUpgrade.setText(R.string.maxLevel);
                } else {
                    btnBiggerKegsUpgrade.setEnabled(true);
                }

                if (MainActivity.intViewMoneyCount >= intBiggerKegsPrice && MainActivity.maxLevelBiggerKegs <= 4){
                    btnBiggerKegsUpgrade.setAlpha(1.0f);
                } else {
                    btnBiggerKegsUpgrade.setAlpha(0.3f);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseWorkerSpeedUpgradePrice && MainActivity.btnIncreaseWorkerSpeedMaxLevel <= 4) {
                    btnIncreaseWorkerSpeedUpgrade2.setEnabled(true);
                } else {
                    btnIncreaseWorkerSpeedUpgrade2.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.getIntIncreaseWorkerCapacityUpgradePrice) {
                    btnIncreaseWorkerCapacityUpgrade2.setEnabled(true);
                } else {
                    btnIncreaseWorkerCapacityUpgrade2.setEnabled(false);
                }

                if (MainActivity.intWorkerCount != MainActivity.maxWorkers && MainActivity.intViewMoneyCount >= MainActivity.intAddWorkerPrice) {
                    MainActivity.btnAddWorker.setEnabled(true);
                } else {
                    MainActivity.btnAddWorker.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseBeerValuePrice) {
                    btnIncreaseBeerValue2.setEnabled(true);
                } else {
                    btnIncreaseBeerValue2.setEnabled(false);
                }


            }

        });

        btntripleTapValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.intViewMoneyCount >= intTripleTapValuePrice && MainActivity.maxLevelTripleTapValue != 1){
                    MainActivity.intViewMoneyCount -= intTripleTapValuePrice;
                    MainActivity.maxLevelTripleTapValue++;
                    MainActivity.moneyPerClick *= 3;

                    MainActivity.txtViewMoneyCount.setText("$" + MainActivity.intViewMoneyCount);

                    MainActivity.goldenBeers+=1;

                    MainActivity.progressStatusProTapper += 1;
                    progressBarProTapper.setProgress(MainActivity.progressStatusProTapper);


                    MainActivity.txtViewGoldenBeers.setText(String.valueOf("Golden Beers: " + MainActivity.goldenBeers));

                } else {
                    btntripleTapValue.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= intTripleTapValuePrice && MainActivity.maxLevelTripleTapValue <= 1){
                    btntripleTapValue.setAlpha(1.0f);
                } else {
                    btntripleTapValue.setAlpha(0.3f);
                }

                if (MainActivity.maxLevelTripleTapValue == 1){
                    btntripleTapValue.setText(R.string.maxLevel);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseBeerSalesUpgradePrice) {
                    btnIncreaseBeerSalesUpgrade2.setEnabled(true);
                } else {
                    btnIncreaseBeerSalesUpgrade2.setEnabled(false);
                }
                if (intIncreaseBeerValuePrice <= MainActivity.intViewMoneyCount && MainActivity.maxLevelBeerValueUpgrade < 5) {
                    btnIncreaseBeerValue2.setEnabled(true);
                } else {
                    btnIncreaseBeerValue2.setEnabled(false);
                }
            }
        });

        btnDoubleWorkerOutput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.intViewMoneyCount >= intDoubleWorkerOutputPrice && MainActivity.maxLevelDoubleWorkerOutput != 5){
                    MainActivity.intViewMoneyCount -= intDoubleWorkerOutputPrice;
                    MainActivity.maxLevelDoubleWorkerOutput++;
                    MainActivity.floatMoneyPerWorker *= 2;
                    MainActivity.intDoubleWorkerOutput *= 2;

                    MainActivity.txtViewMoneyCount.setText("$ " + MainActivity.intViewMoneyCount);
                    MainActivity.moneyPerSec = MainActivity.floatMoneyPerWorker * MainActivity.floatBeerValue * MainActivity.intWorkerCount + MainActivity.extras;
                    MainActivity.txtViewMoneyCountPerSec.setText(String.valueOf("$ " + Math.round(MainActivity.moneyPerSec) + " Per Sec."));

                    MainActivity.goldenBeers+=1;

                    MainActivity.progressStatus24hrShifts += 1;
                    progressBar24hrShifts.setProgress(MainActivity.progressStatus24hrShifts);

                    MainActivity.txtViewGoldenBeers.setText(String.valueOf("Golden Beers: " + MainActivity.goldenBeers));
                } else {
                    btnDoubleWorkerOutput.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= intDoubleWorkerOutputPrice && MainActivity.maxLevelDoubleWorkerOutput < 1){
                    btnDoubleWorkerOutput.setAlpha(1.0f);
                } else {
                    btnDoubleWorkerOutput.setAlpha(0.3f);
                }

                if (MainActivity.maxLevelDoubleWorkerOutput == 1){
                    btnDoubleWorkerOutput.setText(R.string.maxLevel);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseWorkerSpeedUpgradePrice && MainActivity.btnIncreaseWorkerSpeedMaxLevel <= 4) {
                    btnIncreaseWorkerSpeedUpgrade2.setEnabled(true);
                } else {
                    btnIncreaseWorkerSpeedUpgrade2.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.getIntIncreaseWorkerCapacityUpgradePrice) {
                    btnIncreaseWorkerCapacityUpgrade2.setEnabled(true);
                } else {
                    btnIncreaseWorkerCapacityUpgrade2.setEnabled(false);
                }

                if (MainActivity.intWorkerCount != MainActivity.maxWorkers && MainActivity.intViewMoneyCount >= MainActivity.intAddWorkerPrice) {
                    MainActivity.btnAddWorker.setEnabled(true);
                } else {
                    MainActivity.btnAddWorker.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseBeerValuePrice) {
                    btnIncreaseBeerValue2.setEnabled(true);
                } else {
                    btnIncreaseBeerValue2.setEnabled(false);
                }

            }
        });

        btnHireRobots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.intViewMoneyCount >= intHireRobotsPrice && MainActivity.maxLevelHireRobots <=4) {
                    int intHireRobots2 = MainActivity.intHireRobotsUpgradePrice;
                    MainActivity.intViewMoneyCount -= intHireRobots2;
                    MainActivity.extras += 10000;
                    MainActivity.maxLevelHireRobots ++;


                    intHireRobots2 *=1.25;
                    MainActivity.intHireRobotsUpgradePrice = intHireRobots2;

                    MainActivity.moneyPerSec = MainActivity.floatMoneyPerWorker * MainActivity.floatBeerValue * MainActivity.intWorkerCount + MainActivity.extras;
                    MainActivity.txtViewMoneyCountPerSec.setText(String.valueOf("$" + Math.round(MainActivity.moneyPerSec) + " Per Sec."));
                    MainActivity.txtViewMoneyCount.setText(String.valueOf("$ " + MainActivity.intViewMoneyCount));
                    btnHireRobots.setText(String.valueOf("$" + intHireRobots2));
                    MainActivity.goldenBeers+=1;

                    MainActivity.progressStatusHireRobots += 1;
                    progressBarHireRobots.setProgress(MainActivity.progressStatusHireRobots);

                    MainActivity.txtViewGoldenBeers.setText(String.valueOf("Golden Beers: " + MainActivity.goldenBeers));
                } else {
                    btnHireRobots.setEnabled(false);
                }

                if (MainActivity.maxLevelHireRobots == 5){
                    btnHireRobots.setEnabled(false);
                    btnHireRobots.setText(R.string.maxLevel);
                } else {
                    btnHireRobots.setEnabled(true);
                }

                if (MainActivity.intViewMoneyCount >= intHireRobotsPrice && MainActivity.maxLevelHireRobots <= 4){
                    btnHireRobots.setAlpha(1.0f);
                } else {
                    btnHireRobots.setAlpha(0.3f);
                }

                    if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseWorkerSpeedUpgradePrice && MainActivity.btnIncreaseWorkerSpeedMaxLevel <= 4) {
                        btnIncreaseWorkerSpeedUpgrade2.setEnabled(true);
                    } else {
                        btnIncreaseWorkerSpeedUpgrade2.setEnabled(false);
                    }

                    if (MainActivity.intViewMoneyCount >= MainActivity.getIntIncreaseWorkerCapacityUpgradePrice) {
                        btnIncreaseWorkerCapacityUpgrade2.setEnabled(true);
                    } else {
                        btnIncreaseWorkerCapacityUpgrade2.setEnabled(false);
                    }

                    if (MainActivity.intWorkerCount != MainActivity.maxWorkers && MainActivity.intViewMoneyCount >= MainActivity.intAddWorkerPrice) {
                        MainActivity.btnAddWorker.setEnabled(true);
                    } else {
                        MainActivity.btnAddWorker.setEnabled(false);
                    }

                    if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseBeerValuePrice) {
                        btnIncreaseBeerValue2.setEnabled(true);
                    } else {
                        btnIncreaseBeerValue2.setEnabled(false);
                    }


                }

        });

        btnWizardSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.intViewMoneyCount >= intWizardSchoolPrice && MainActivity.maxLevelWizardSchool <=4) {
                    MainActivity.intViewMoneyCount -= intWizardSchoolPrice;
                    MainActivity.floatMoneyPerWorker *= 2.5;
                    MainActivity.maxLevelWizardSchool ++;

                    int intWizardSchoolPrice2 = MainActivity.intWizardSchoolUpgradePrice;
                    intWizardSchoolPrice2 *=1.5;
                    MainActivity.intWizardSchoolUpgradePrice = intWizardSchoolPrice2;

                    MainActivity.moneyPerSec = MainActivity.floatMoneyPerWorker * MainActivity.floatBeerValue * MainActivity.intWorkerCount + MainActivity.extras;
                    MainActivity.txtViewMoneyCountPerSec.setText(String.valueOf("$" + Math.round(MainActivity.moneyPerSec) + " Per Sec."));
                    MainActivity.txtViewMoneyCount.setText(String.valueOf("$ " + MainActivity.intViewMoneyCount));
                    btnWizardSchool.setText(String.valueOf("$" + intWizardSchoolPrice2));
                    MainActivity.goldenBeers+=1;

                    MainActivity.progressStatusWizardSchool += 1;
                    progressBarWizardSchool.setProgress(MainActivity.progressStatusWizardSchool);

                    MainActivity.txtViewGoldenBeers.setText(String.valueOf("Golden Beers: " + MainActivity.goldenBeers));
                } else {
                    btnHireRobots.setEnabled(false);
                }

                if (MainActivity.maxLevelWizardSchool == 5){
                    btnWizardSchool.setEnabled(false);
                    btnWizardSchool.setText(R.string.maxLevel);
                } else {
                    btnWizardSchool.setEnabled(true);
                }

                if (MainActivity.intViewMoneyCount >= intWizardSchoolPrice && MainActivity.maxLevelWizardSchool <= 4){
                    btnWizardSchool.setAlpha(1.0f);
                } else {
                    btnWizardSchool.setAlpha(0.3f);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseWorkerSpeedUpgradePrice && MainActivity.btnIncreaseWorkerSpeedMaxLevel <= 4) {
                    btnIncreaseWorkerSpeedUpgrade2.setEnabled(true);
                } else {
                    btnIncreaseWorkerSpeedUpgrade2.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.getIntIncreaseWorkerCapacityUpgradePrice) {
                    btnIncreaseWorkerCapacityUpgrade2.setEnabled(true);
                } else {
                    btnIncreaseWorkerCapacityUpgrade2.setEnabled(false);
                }

                if (MainActivity.intWorkerCount != MainActivity.maxWorkers && MainActivity.intViewMoneyCount >= MainActivity.intAddWorkerPrice) {
                    MainActivity.btnAddWorker.setEnabled(true);
                } else {
                    MainActivity.btnAddWorker.setEnabled(false);
                }

                if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseBeerValuePrice) {
                    btnIncreaseBeerValue2.setEnabled(true);
                } else {
                    btnIncreaseBeerValue2.setEnabled(false);
                }


            }

        });

        Thread t = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(100);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                updateButtons();
                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        t.start();

    }



    private void updateButtons() {

        final Button btnIncreaseBeerValue2;
        final Button btnIncreaseWorkerSpeedUpgrade2;
        final Button btnIncreaseWorkerCapacityUpgrade2;
        final Button btnIncreaseBeerSalesUpgrade2;
        final Button btnBiggerKegs;
        final Button btnTripleTapValue;
        final Button btnDoubleWorkerOutput;
        final Button btnHireRobots;
        final Button btnWizardSchool;


        btnIncreaseBeerValue2 = (Button) findViewById(R.id.buttonIncreaseBeerValueUpgrade2);
        btnIncreaseWorkerSpeedUpgrade2 = (Button) findViewById(R.id.buttonIncreaseWorkerSpeedUpgrade2);
        btnIncreaseWorkerCapacityUpgrade2 = (Button) findViewById(R.id.buttonIncreaseWorkerCapacityUpgrade2);
        btnIncreaseBeerSalesUpgrade2 = (Button) findViewById(R.id.buttonIncreaseBeerSalesUpgrade2);
        btnBiggerKegs = (Button) findViewById(R.id.buttonBiggerKegsUpgrade2);
        btnTripleTapValue = (Button) findViewById(R.id.buttonTripleTapValueUpgrade2);
        btnDoubleWorkerOutput = (Button) findViewById(R.id.buttonDoubleWorkerOutputUpgrade2);
       btnHireRobots = (Button) findViewById(R.id.buttonHireRobots);
        btnWizardSchool = (Button) findViewById(R.id.buttonWizardSchool);




        if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseWorkerSpeedUpgradePrice && MainActivity.btnIncreaseWorkerSpeedMaxLevel <= 4) {
            btnIncreaseWorkerSpeedUpgrade2.setEnabled(true);
            btnIncreaseWorkerSpeedUpgrade2.setAlpha(1.0f);
        } else {
            btnIncreaseWorkerSpeedUpgrade2.setEnabled(false);
            btnIncreaseWorkerSpeedUpgrade2.setAlpha(0.3f);
        }

        if (MainActivity.intViewMoneyCount >= MainActivity.getIntIncreaseWorkerCapacityUpgradePrice && MainActivity.maxLevelWorkerCapacityUpgrade <= 4) {
            btnIncreaseWorkerCapacityUpgrade2.setEnabled(true);
            btnIncreaseWorkerCapacityUpgrade2.setAlpha(1.0f);
        } else {
            btnIncreaseWorkerCapacityUpgrade2.setEnabled(false);
            btnIncreaseWorkerCapacityUpgrade2.setAlpha(0.3f);
        }

        if (MainActivity.intIncreaseBeerValuePrice <= MainActivity.intViewMoneyCount && MainActivity.maxLevelBeerValueUpgrade <= 4) {
            btnIncreaseBeerValue2.setEnabled(true);
            btnIncreaseBeerValue2.setAlpha(1.0f);
        } else {
            btnIncreaseBeerValue2.setEnabled(false);
            btnIncreaseBeerValue2.setAlpha(0.3f);
        }

        if (MainActivity.intViewMoneyCount >= MainActivity.intIncreaseBeerSalesUpgradePrice && MainActivity.maxLevelBeerSalesUpgrade <= 4) {
            btnIncreaseBeerSalesUpgrade2.setEnabled(true);
            btnIncreaseBeerSalesUpgrade2.setAlpha(1.0f);
        } else {
            btnIncreaseBeerSalesUpgrade2.setEnabled(false);
            btnIncreaseBeerSalesUpgrade2.setAlpha(0.3f);
        }

        if (MainActivity.intViewMoneyCount >= MainActivity.intBiggerKegsUpgradePrice && MainActivity.maxLevelBiggerKegs <= 4) {
            btnBiggerKegs.setEnabled(true);
            btnBiggerKegs.setAlpha(1.0f);
        } else {
            btnBiggerKegs.setEnabled(false);
            btnBiggerKegs.setAlpha(0.3f);
        }

        if (MainActivity.intViewMoneyCount >= MainActivity.intTripleTapValue && MainActivity.maxLevelTripleTapValue < 1){
            btnTripleTapValue.setEnabled(true);
            btnTripleTapValue.setAlpha(1.0f);
        } else {
            btnTripleTapValue.setEnabled(false);
            btnTripleTapValue.setAlpha(0.3f);
        }

        if(MainActivity.intViewMoneyCount >= MainActivity.intDoubleWorkerOutput && MainActivity.maxLevelDoubleWorkerOutput < 1) {
            btnDoubleWorkerOutput.setEnabled(true);
            btnDoubleWorkerOutput.setAlpha(1.0f);
        } else {
            btnDoubleWorkerOutput.setEnabled(false);
            btnDoubleWorkerOutput.setAlpha(0.3f);
        }

        if(MainActivity.intViewMoneyCount >= MainActivity.intHireRobotsUpgradePrice && MainActivity.maxLevelHireRobots <= 4) {
            btnHireRobots.setEnabled(true);
            btnHireRobots.setAlpha(1.0f);
        } else {
            btnHireRobots.setEnabled(false);
            btnHireRobots.setAlpha(0.3f);
        }

        if(MainActivity.intViewMoneyCount >= MainActivity.intWizardSchoolUpgradePrice && MainActivity.maxLevelWizardSchool <= 1) {
            btnWizardSchool.setEnabled(true);
            btnWizardSchool.setAlpha(1.0f);
        } else {
            btnWizardSchool.setEnabled(false);
            btnWizardSchool.setAlpha(0.3f);
        }

    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Pop Page", // TODO: Define a title for the content shown.
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
                "Pop Page", // TODO: Define a title for the content shown.
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
