package parker.david.labs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import java.util.Random;

import android.view.View;
import  android.widget.TextView;

public class CoinTossActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_toss);
        Log.i( "Activity Lifecycle",  "onCreate");
    }
    @Override
    protected void onPause() {

        super.onPause();
        Log.i("Activity Lifecycle","onPause");
    }

    private String getCoinToss(){
        Random random = new Random();
        if(random.nextBoolean()) {
            return "Heads";
        }
        return "Tails";
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Activity Lifecycle","onResume");
        TextView coinTossView = (TextView) findViewById(R.id.coinTossView);

        String result = getCoinToss();

        coinTossView.setText(result);
    }

}