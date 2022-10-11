package parker.david.labs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;

import java.util.Random;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i( "Activity Lifecycle",  "onCreate");
    }
    @Override
    protected void onPause() {

        super.onPause();
        Log.i("Activity Lifecycle","onPause");
    }
    private String getCoinToss(){
        if(random.nextBoolean()) {
            return "Heads";
        }
        return "Tails";
    }
}