package patapignouf.com.tabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import patapignouf.com.R;


public class conclusionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conclusion);

        String credit = getResources().getString(R.string.conctext);


        final TextView menuTV;
        menuTV = (TextView) findViewById(R.id.textViewConc);
        menuTV.setText(credit);
    }
}
