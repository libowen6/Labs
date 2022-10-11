package parker.david.labs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import java.util.Random;
import  android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Random random;
    private String getCoinToss(){

        if(random.nextBoolean()){
            return "Heads!";
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