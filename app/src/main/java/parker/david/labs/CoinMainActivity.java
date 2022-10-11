package parker.david.labs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;

import java.util.Random;

import android.view.View;
import android.widget.TextView;
public class CoinMainActivity extends AppCompatActivity {

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
    Random random;
    private String getCoinToss(){
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
    public void openCoinToss(View view){
        Intent openCoinTossIntent=new Intent(getApplicationContext(),CoinTossACtivity.class);
        startActivity(openCoinTossIntent);
    }


}