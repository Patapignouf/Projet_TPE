package patapignouf.com.tabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import patapignouf.com.R;

public class creditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);

        String credit = getResources().getString(R.string.apropostext);


        final TextView menuTV;
        menuTV = (TextView) findViewById(R.id.textViewCredit);
        menuTV.setText(credit);

    }
}
