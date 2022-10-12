package parker.david.labs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openCoinToss(View view){
        Intent openCoinTossIntent = new Intent(getApplicationContext(),CoinTossActivity.class);
        startActivity(openCoinTossIntent);
    }
}