package damoproductions.com.beerontap;

import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.android.vending.billing.IInAppBillingService;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;

//import damoproductions.com.beerontap.util.IabHelper;

public class MainActivity extends AppCompatActivity {




    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;

    public static TextView txtViewWorkerCount;
    public static TextView txtViewMoneyCount;
    public static TextView txtViewMoneyCountPerSec;
    public static int intWorkerCount = 0;
    public static long intViewMoneyCount = 0;
    public static float moneyPerSec = 0;
    public static int breweryValue;
    public static float advertisingBonus;


    public static int prestiges = 0;

    public static float floatMoneyPerWorker = 1;
    public static float floatBeerValue = 1;
    public static int moneyPerClick = 1;
    public static int extras = 0;
    Button btnIncreaseWorkerSpeedUpgrade;
    Button btnIncreaseWorkerCapacityUpgrade;
    Button btnIncreaseBeerValueUpgrade;
    public static ImageButton btnAddWorker;
    Button btnIncreaseBeerSalesUpgrade;
    static ImageButton btnBeerIcon;
    public static ImageButton btnBeerTypes;
    public static ImageButton btnBoostMenu;

    public static TextView txtViewMoneyPerTap;

    public static ImageButton btnUpgrades;
    public static ImageButton btnStats;

    public static int maxWorkers = 10;
    public static int maxLevelBeerValueUpgrade = 0; //5
    public static int maxLevelWorkerCapacityUpgrade = 0; //5
    public static int btnIncreaseWorkerSpeedMaxLevel = 0; //5
    public static int maxLevelBeerSalesUpgrade = 0; //5
    public static int maxLevelBiggerKegs = 0; //5
    public static int maxLevelTripleTapValue = 0; //1
    public static int maxLevelDoubleWorkerOutput = 0; //1
    public static int maxLevelHireRobots = 0; //5
    public static int maxLevelWizardSchool = 0; //5

    public static int progressStatusGoldenTouch = 0;
    public static int progressStatusSteroids = 0;
    public static int progressStatusWorkerHousing = 0;
    public static int progressStatusAdvertisment = 0;
    public static int progressStatusBiggerKegs = 0;
    public static int progressStatusProTapper = 0;
    public static int progressStatus24hrShifts = 0;
    public static int progressStatusHireRobots = 0;
    public static int progressStatusWizardSchool = 0;

    public static int goldenBeers = 0;
    public static TextView txtViewGoldenBeers;

    public static int intIncreaseBeerValuePrice = 100;
    public static TextView txtViewIncreaseBeerValuePrice;

    public static int intAddWorkerPrice = 10;
    public static TextView txtViewAddWorkerPrice;

    public static int intIncreaseWorkerSpeedUpgradePrice = 500;
    public static TextView txtViewIncreaseWorkerSpeedPrice;

    public static int getIntIncreaseWorkerCapacityUpgradePrice = 2500;
    public static TextView txtViewIncreaseWorkerCapacityPrice;

    public static int intIncreaseBeerSalesUpgradePrice = 5000;
    public static TextView txtViewIncreaseBeerSalesPrice;

    public static int intBiggerKegsUpgradePrice = 20000;

    public static int intTripleTapValue = 100000;

    public static int intDoubleWorkerOutput = 500000;

    public static int intHireRobotsUpgradePrice = 1000000;

    public static int intWizardSchoolUpgradePrice = 6666666;


    public static TextView txtViewTapMe;


    Animation anim;
    Animation beerValueAnim;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Typeface mTypeface = Typeface.createFromAsset(getAssets(), "rootbeer.otf");



    String base64EncodedPublicKey;

        // compute your public key and store it in base64EncodedPublicKey
        //mHelper = new com.example.android.trivialdrivesample.util.IabHelper(this, base64EncodedPublicKey);

        getSupportActionBar().hide();

        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        beerValueAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.beervalue);

        // ADS
      //  MobileAds.initialize(getApplicationContext(), "ca-app-pub-5336619418792002~1678182572");
       // AdView mAdView = (AdView) findViewById(R.id.adView);
       // AdRequest adRequest = new AdRequest.Builder()
        //        .addTestDevice("YOUR_DEVICE_HASH")
         //       .build();
        //mAdView.loadAd(adRequest);

        //txtViewMoneyPerTap = (TextView) findViewById(R.id.textViewMoneyPerTap);
        // txtViewMoneyPerTap.setText(String.valueOf(moneyPerClick));

        final TextView txtViewBeerValueAnim;
        txtViewBeerValueAnim = (TextView) findViewById(R.id.textViewBeerValueAnim);


        txtViewTapMe = (TextView) findViewById(R.id.textViewTapMe);
        btnUpgrades = (ImageButton) findViewById(R.id.buttonUpgrades);
        btnBoostMenu = (ImageButton) findViewById(R.id.buttonBoostMenu);
        //Calling upon text views + buttons
        btnBeerIcon = (ImageButton) findViewById(R.id.imageButtonBeerIcon);
        btnAddWorker = (ImageButton) findViewById(R.id.buttonAddWorker);
        txtViewWorkerCount = (TextView) findViewById(R.id.textViewWorkerCount);
        txtViewMoneyCountPerSec = (TextView) findViewById(R.id.textViewMoneyCountPerSec);
        btnIncreaseWorkerSpeedUpgrade = (Button) findViewById(R.id.buttonIncreaseWorkerSpeedUpgrade);
        txtViewIncreaseWorkerSpeedPrice = (TextView) findViewById(R.id.textViewIncreaseWorkerSpeedUpgradePrice);
        btnIncreaseWorkerCapacityUpgrade = (Button) findViewById(R.id.buttonIncreaseWorkerCapacityUpgrade);
        txtViewIncreaseWorkerCapacityPrice = (TextView) findViewById(R.id.textViewIncreaseWorkerCapacityUpgradePrice);
        txtViewMoneyCount = (TextView) findViewById(R.id.textViewMoneyCount);
        txtViewAddWorkerPrice = (TextView) findViewById(R.id.textViewAddWorkerPrice);
        btnIncreaseBeerValueUpgrade = (Button) findViewById(R.id.buttonIncreaseBeerValueUpgrade);
        txtViewIncreaseBeerValuePrice = (TextView) findViewById(R.id.textViewIncreaseBeerValueUpgradePrice);
        btnIncreaseBeerSalesUpgrade = (Button) findViewById(R.id.buttonIncreaseBeerSalesUpgrade);
        txtViewIncreaseBeerSalesPrice = (TextView) findViewById(R.id.textViewIncreaseBeerSalesUpgradePrice);
        txtViewGoldenBeers = (TextView) findViewById(R.id.textViewGoldenBeers);

        btnStats = (ImageButton) findViewById(R.id.buttonStats);
        btnBeerTypes = (ImageButton) findViewById(R.id.buttonBeerTypes);

        txtViewMoneyCount.setTypeface(mTypeface);
        txtViewMoneyCountPerSec.setTypeface(mTypeface);
        txtViewGoldenBeers.setTypeface(mTypeface);
        txtViewTapMe.setTypeface(mTypeface);
        txtViewAddWorkerPrice.setTypeface(mTypeface);
        txtViewWorkerCount.setTypeface(mTypeface);


        //Setting Upgrade buttons to false
        btnIncreaseWorkerSpeedUpgrade.setEnabled(false);
        btnIncreaseWorkerCapacityUpgrade.setEnabled(false);
        btnAddWorker.setEnabled(false);
        btnAddWorker.setAlpha(0.3f);
        btnIncreaseBeerValueUpgrade.setEnabled(false);
        btnIncreaseBeerSalesUpgrade.setEnabled(false);


        txtViewTapMe.startAnimation(anim);

        moneyPerSec = floatMoneyPerWorker * floatBeerValue * intWorkerCount + extras + advertisingBonus;

        final Intent intentBundle = new Intent(MainActivity.this, Pop.class);
        final Bundle bundle = new Bundle();

        final Intent intentBundleStats = new Intent(MainActivity.this, Stats.class);
        final Bundle bundleStats = new Bundle();

        final Intent intentBundleBeerStats = new Intent(MainActivity.this, BeerTypes.class);
        final Bundle bundleBeers = new Bundle();


        btnUpgrades.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btnUpgrades.setScaleX(0.9f);
                btnUpgrades.setScaleY(0.9f);
                return false;


            }
        });

        btnAddWorker.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btnAddWorker.setScaleX(0.9f);
                btnAddWorker.setScaleY(0.9f);
                return false;


            }
        });
        btnStats.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btnStats.setScaleX(0.9f);
                btnStats.setScaleY(0.9f);
                return false;


            }
        });

        btnBeerIcon.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btnBeerIcon.setScaleX(0.95f);
                btnBeerIcon.setScaleY(0.95f);
                return false;


            }
        });

        btnUpgrades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this,Pop.class));


                bundle.putInt("intIncreaseBeerValuePrice", intIncreaseBeerValuePrice);
                bundle.putInt("intIncreaseWorkerSpeedPrice", intIncreaseWorkerSpeedUpgradePrice);
                bundle.putInt("intIncreaseWorkerCapacityPrice", getIntIncreaseWorkerCapacityUpgradePrice);
                bundle.putInt("intIncreaseBeerSalesPrice", intIncreaseBeerSalesUpgradePrice);
                bundle.putInt("intBiggerKegsUpgradePrice", intBiggerKegsUpgradePrice);
                bundle.putInt("intHireRobotsUpgradePrice", intHireRobotsUpgradePrice);
                bundle.putInt("intWizardSchoolUpgradePrice", intWizardSchoolUpgradePrice);
                bundle.putInt("goldenBeers", goldenBeers);

                bundle.putInt("progressStatusGoldenTouch", progressStatusGoldenTouch);
                intentBundle.putExtras(bundle);
                startActivity(intentBundle);


            }

        });

        btnStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // startActivity(new Intent(MainActivity.this,Stats.class));

                bundleStats.putInt("intWorkerCount", intWorkerCount);
                bundleStats.putInt("moneyPerClick", moneyPerClick);
                bundleStats.putInt("breweryValue", breweryValue);

                intentBundleStats.putExtras(bundleStats);
                startActivity(intentBundleStats);

            }
        });

        btnBeerTypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this, BeerTypes.class));
                bundleBeers.putInt("intWorkerCount", intWorkerCount);
                bundleBeers.putInt("moneyPerClick", moneyPerClick);
                bundleBeers.putInt("breweryValue", breweryValue);

                intentBundleBeerStats.putExtras(bundleStats);
                startActivity(intentBundleBeerStats);
            }
        });

        btnBoostMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, boostmenu.class));
            }
        });

        //Beer icon button
        btnBeerIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intViewMoneyCount += moneyPerClick;
                breweryValue += moneyPerClick;
                txtViewMoneyCount.setText(String.valueOf("$ " + intViewMoneyCount));

                btnBeerIcon.setScaleX(1f);
                btnBeerIcon.setScaleY(1f);

                Random rand = new Random();
                int xLow = btnBeerIcon.getLeft();
                int xHigh = btnBeerIcon.getRight();
                int yLow = btnBeerIcon.getBottom();
                int yHigh = btnBeerIcon.getTop();
                int x = rand.nextInt(xHigh - xLow) + xLow;
                int y = rand.nextInt(btnBeerIcon.getTop());

                txtViewBeerValueAnim.setTypeface(mTypeface);
                txtViewBeerValueAnim.setY(btnBeerIcon.getTop());
                txtViewBeerValueAnim.setX(x);

                txtViewBeerValueAnim.setText(String.valueOf("+" + (int) floatBeerValue * moneyPerClick));

                txtViewBeerValueAnim.startAnimation(beerValueAnim);


                if (intViewMoneyCount >= intIncreaseWorkerSpeedUpgradePrice && btnIncreaseWorkerSpeedMaxLevel != 5) {
                    btnIncreaseWorkerSpeedUpgrade.setEnabled(true);
                } else {
                    btnIncreaseWorkerSpeedUpgrade.setEnabled(false);
                }

                if (intViewMoneyCount >= getIntIncreaseWorkerCapacityUpgradePrice && maxLevelWorkerCapacityUpgrade != 5) {
                    btnIncreaseWorkerCapacityUpgrade.setEnabled(true);
                } else {
                    btnIncreaseWorkerCapacityUpgrade.setEnabled(false);
                }

                if (intWorkerCount != maxWorkers && intViewMoneyCount >= intAddWorkerPrice) {
                    btnAddWorker.setEnabled(true);
                    btnAddWorker.setAlpha(1.0f);
                } else {
                    btnAddWorker.setEnabled(false);
                    btnAddWorker.setAlpha(0.3f);
                }

                if (intIncreaseBeerValuePrice <= intViewMoneyCount && maxLevelBeerValueUpgrade != 5) {
                    btnIncreaseBeerValueUpgrade.setEnabled(true);
                } else {
                    btnIncreaseBeerValueUpgrade.setEnabled(false);
                }

                if (intViewMoneyCount >= intIncreaseBeerSalesUpgradePrice && maxLevelBeerSalesUpgrade != 5) {
                    btnIncreaseBeerSalesUpgrade.setEnabled(true);
                } else {
                    btnIncreaseBeerSalesUpgrade.setEnabled(false);
                }

            }
        });


        //button HIRE WORKER
        btnAddWorker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intViewMoneyCount >= intAddWorkerPrice && intWorkerCount != maxWorkers) {
                    btnAddWorker.setScaleY(1);
                    btnAddWorker.setScaleX(1);
                    intViewMoneyCount -= intAddWorkerPrice;

                    if (intWorkerCount < 50) {
                        intAddWorkerPrice *= 1.1;
                    } else if (intWorkerCount >= 50 && intWorkerCount < 100) {
                        intAddWorkerPrice *= 1.05;
                    } else if (intWorkerCount >= 100) {
                        intAddWorkerPrice *= 1.01;
                    }
                    intWorkerCount++;
                    moneyPerSec = floatMoneyPerWorker * floatBeerValue * intWorkerCount + extras + advertisingBonus;


                    txtViewAddWorkerPrice.setText(String.valueOf("$ " + intAddWorkerPrice));

                    int intWorkerCountValue;
                    intWorkerCountValue = intWorkerCount;
                    txtViewWorkerCount.setText(String.valueOf("Workers: " + intWorkerCountValue));


                    txtViewMoneyCountPerSec.setText(String.valueOf("$ " + Math.round(moneyPerSec) + " Per Sec."));

                    txtViewMoneyCount.setText(String.valueOf("$ " + intViewMoneyCount));
                    if (intViewMoneyCount >= intIncreaseWorkerSpeedUpgradePrice && btnIncreaseWorkerSpeedMaxLevel != 5) {
                        btnIncreaseWorkerSpeedUpgrade.setEnabled(true);
                    } else {
                        btnIncreaseWorkerSpeedUpgrade.setEnabled(false);
                    }

                    if (intWorkerCount != maxWorkers && intViewMoneyCount >= intAddWorkerPrice) {
                        btnAddWorker.setEnabled(true);
                        btnAddWorker.setAlpha(1.0f);
                    } else {
                        btnAddWorker.setEnabled(false);
                        btnAddWorker.setAlpha(0.3f);
                    }

                    if (intWorkerCount == maxWorkers) {
                        txtViewAddWorkerPrice.setText(String.valueOf("MAX"));
                        txtViewAddWorkerPrice.setTextSize(16);
                    } else {
                        txtViewAddWorkerPrice.setText(String.valueOf("$ " + intAddWorkerPrice));
                        txtViewAddWorkerPrice.setTextSize(16);
                    }
                }
            }
        });


        btnIncreaseBeerValueUpgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (maxLevelBeerValueUpgrade <= 4) {
                    moneyPerClick *= 2;
                    intViewMoneyCount -= intIncreaseBeerValuePrice;
                    intIncreaseBeerValuePrice *= 2;
                    maxLevelBeerValueUpgrade++;
                    txtViewIncreaseBeerValuePrice.setText(String.valueOf("$ " + intIncreaseBeerValuePrice));
                    goldenBeers++;

                    txtViewGoldenBeers.setText(String.valueOf(goldenBeers));
                    txtViewMoneyCount.setText(String.valueOf(intViewMoneyCount));
                    txtViewMoneyPerTap.setText(String.valueOf(moneyPerClick));


                } else {

                    btnIncreaseBeerValueUpgrade.setEnabled(false);
                }
                if (maxLevelBeerValueUpgrade == 5) {
                    txtViewIncreaseBeerValuePrice.setText(getString(R.string.maxLevel));
                    btnIncreaseBeerValueUpgrade.setEnabled(false);
                    txtViewIncreaseBeerValuePrice.setTextSize(10);
                }


                if (intViewMoneyCount >= intIncreaseWorkerSpeedUpgradePrice && btnIncreaseWorkerSpeedMaxLevel <= 4) {
                    btnIncreaseWorkerSpeedUpgrade.setEnabled(true);
                } else {
                    btnIncreaseWorkerSpeedUpgrade.setEnabled(false);
                }

                if (intViewMoneyCount >= getIntIncreaseWorkerCapacityUpgradePrice) {
                    btnIncreaseWorkerCapacityUpgrade.setEnabled(true);
                } else {
                    btnIncreaseWorkerCapacityUpgrade.setEnabled(false);
                }

                if (intWorkerCount != maxWorkers && intViewMoneyCount >= intAddWorkerPrice) {
                    btnAddWorker.setEnabled(true);
                } else {
                    btnAddWorker.setEnabled(false);
                }

                if (intViewMoneyCount >= intIncreaseBeerValuePrice) {
                    btnIncreaseBeerValueUpgrade.setEnabled(true);
                } else {
                    btnIncreaseBeerValueUpgrade.setEnabled(false);
                }


            }
        });

        btnIncreaseWorkerSpeedUpgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnIncreaseWorkerSpeedMaxLevel <= 4) {
                    intViewMoneyCount -= intIncreaseWorkerSpeedUpgradePrice;
                    floatMoneyPerWorker *= 2;
                    moneyPerSec = intWorkerCount * floatMoneyPerWorker;
                    txtViewMoneyCountPerSec.setText(String.valueOf(moneyPerSec));
                    intIncreaseWorkerSpeedUpgradePrice *= 2;
                    goldenBeers++;

                    txtViewGoldenBeers.setText(String.valueOf(goldenBeers));
                    txtViewIncreaseWorkerSpeedPrice.setText(String.valueOf(intIncreaseWorkerSpeedUpgradePrice));
                    btnIncreaseWorkerSpeedMaxLevel++;
                } else {
                    btnIncreaseWorkerSpeedUpgrade.setEnabled(false);
                }

                if (btnIncreaseWorkerSpeedMaxLevel == 5) {
                    btnIncreaseWorkerSpeedUpgrade.setEnabled(false);
                    txtViewIncreaseWorkerSpeedPrice.setText(getString(R.string.maxLevel));
                    txtViewIncreaseWorkerSpeedPrice.setTextSize(10);
                }

                txtViewMoneyCount.setText(String.valueOf(intViewMoneyCount));
                if (intViewMoneyCount >= intIncreaseWorkerSpeedUpgradePrice && btnIncreaseWorkerSpeedMaxLevel <= 4) {
                    btnIncreaseWorkerSpeedUpgrade.setEnabled(true);
                } else {
                    btnIncreaseWorkerSpeedUpgrade.setEnabled(false);
                }

                if (intViewMoneyCount >= getIntIncreaseWorkerCapacityUpgradePrice) {
                    btnIncreaseWorkerCapacityUpgrade.setEnabled(true);
                } else {
                    btnIncreaseWorkerCapacityUpgrade.setEnabled(false);
                }

                if (intWorkerCount != maxWorkers && intViewMoneyCount >= intAddWorkerPrice) {
                    btnAddWorker.setEnabled(true);
                } else {
                    btnAddWorker.setEnabled(false);
                }

                if (intIncreaseBeerValuePrice <= intViewMoneyCount && maxLevelBeerValueUpgrade <= 4) {
                    btnIncreaseBeerValueUpgrade.setEnabled(true);
                } else {
                    btnIncreaseBeerValueUpgrade.setEnabled(false);
                }

            }
        });

        btnIncreaseWorkerCapacityUpgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (maxLevelWorkerCapacityUpgrade < 5) {
                    intViewMoneyCount -= getIntIncreaseWorkerCapacityUpgradePrice;
                    maxWorkers *= 2;
                    getIntIncreaseWorkerCapacityUpgradePrice *= 4;
                    txtViewIncreaseWorkerCapacityPrice.setText(String.valueOf(getIntIncreaseWorkerCapacityUpgradePrice));
                    txtViewMoneyCount.setText(String.valueOf(intViewMoneyCount));
                    txtViewAddWorkerPrice.setText(String.valueOf(intAddWorkerPrice));
                    maxLevelWorkerCapacityUpgrade++;

                    goldenBeers++;

                    txtViewGoldenBeers.setText(String.valueOf(goldenBeers));
                } else {
                    btnIncreaseWorkerCapacityUpgrade.setEnabled(false);
                }

                if (maxLevelWorkerCapacityUpgrade == 5) {
                    btnIncreaseWorkerCapacityUpgrade.setEnabled(false);
                    txtViewIncreaseWorkerCapacityPrice.setText(getString(R.string.maxLevel));
                    txtViewIncreaseWorkerCapacityPrice.setTextSize(10);
                }

                if (intViewMoneyCount >= intIncreaseWorkerSpeedUpgradePrice && btnIncreaseWorkerSpeedMaxLevel < 4) {
                    btnIncreaseWorkerSpeedUpgrade.setEnabled(true);
                } else {
                    btnIncreaseWorkerSpeedUpgrade.setEnabled(false);
                }

                if (intViewMoneyCount >= getIntIncreaseWorkerCapacityUpgradePrice) {
                    btnIncreaseWorkerCapacityUpgrade.setEnabled(true);
                } else {
                    btnIncreaseWorkerCapacityUpgrade.setEnabled(false);
                }

                if (intWorkerCount != maxWorkers && intViewMoneyCount >= intAddWorkerPrice) {
                    btnAddWorker.setEnabled(true);
                } else {
                    btnAddWorker.setEnabled(false);
                }

                if (intIncreaseBeerValuePrice <= intViewMoneyCount && maxLevelBeerValueUpgrade <= 4) {
                    btnIncreaseBeerValueUpgrade.setEnabled(true);
                } else {
                    btnIncreaseBeerValueUpgrade.setEnabled(false);
                }

                if (intViewMoneyCount >= intIncreaseBeerSalesUpgradePrice) {
                    btnIncreaseBeerSalesUpgrade.setEnabled(true);
                } else {
                    btnIncreaseBeerSalesUpgrade.setEnabled(false);
                }
            }
        });

        btnIncreaseBeerSalesUpgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (maxLevelBeerSalesUpgrade < 5) {
                    intViewMoneyCount -= intIncreaseBeerSalesUpgradePrice;
                    advertisingBonus = moneyPerSec * 1.1f;
                    intIncreaseBeerSalesUpgradePrice *= 3;
                    maxLevelBeerSalesUpgrade++;
                    goldenBeers++;

                    txtViewGoldenBeers.setText(String.valueOf(goldenBeers));
                    txtViewMoneyCount.setText(String.valueOf(intViewMoneyCount));
                    txtViewMoneyCountPerSec.setText(String.valueOf(moneyPerSec));
                    txtViewIncreaseBeerSalesPrice.setText(String.valueOf(intIncreaseBeerSalesUpgradePrice));
                } else {
                    btnIncreaseBeerSalesUpgrade.setEnabled(false);
                }

                if (maxLevelBeerSalesUpgrade == 5) {
                    btnIncreaseBeerSalesUpgrade.setEnabled(false);
                    txtViewIncreaseBeerSalesPrice.setText(getString(R.string.maxLevel));
                    txtViewIncreaseBeerSalesPrice.setTextSize(10);
                }

                if (intViewMoneyCount >= intIncreaseBeerSalesUpgradePrice) {
                    btnIncreaseBeerSalesUpgrade.setEnabled(true);
                } else {
                    btnIncreaseBeerSalesUpgrade.setEnabled(false);
                }

            }

        });

        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                txtViewTapMe.setAlpha(0);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


        Thread t = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                updateStuff();
                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        t.start();


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    public void updateStuff() {
        //Updating text values


        intViewMoneyCount += moneyPerSec;
        txtViewMoneyCount.setText(String.valueOf("$ " + intViewMoneyCount));
        breweryValue += moneyPerSec;


        if (intViewMoneyCount >= intIncreaseWorkerSpeedUpgradePrice && btnIncreaseWorkerSpeedMaxLevel <= 4) {
            btnIncreaseWorkerSpeedUpgrade.setEnabled(true);
        } else {
            btnIncreaseWorkerSpeedUpgrade.setEnabled(false);
        }

        if (intViewMoneyCount >= getIntIncreaseWorkerCapacityUpgradePrice && maxLevelWorkerCapacityUpgrade <= 4) {
            btnIncreaseWorkerCapacityUpgrade.setEnabled(true);
        } else {
            btnIncreaseWorkerCapacityUpgrade.setEnabled(false);
        }

        if (intWorkerCount != maxWorkers && intViewMoneyCount >= intAddWorkerPrice) {
            btnAddWorker.setEnabled(true);
            btnAddWorker.setAlpha(1.0f);
        } else {
            btnAddWorker.setEnabled(false);
            btnAddWorker.setAlpha(0.3f);
        }

        if (intIncreaseBeerValuePrice <= intViewMoneyCount && maxLevelBeerValueUpgrade <= 4) {
            btnIncreaseBeerValueUpgrade.setEnabled(true);
        } else {
            btnIncreaseBeerValueUpgrade.setEnabled(false);
        }

        if (intViewMoneyCount >= intIncreaseBeerSalesUpgradePrice && maxLevelBeerSalesUpgrade <= 4) {
            btnIncreaseBeerSalesUpgrade.setEnabled(true);
        } else {
            btnIncreaseBeerSalesUpgrade.setEnabled(false);
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
                "Main Page", // TODO: Define a title for the content shown.
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
                "Main Page", // TODO: Define a title for the content shown.
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


