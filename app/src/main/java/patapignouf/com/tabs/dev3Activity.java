package patapignouf.com.tabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import patapignouf.com.R;


public class dev3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev3);
        String tdev3 = getResources().getString(R.string.textdev3_1);
        String tdev3_2 = getResources().getString(R.string.textdev3_2);
        String tdev3_3 = getResources().getString(R.string.textdev3_3);
        String tdev3_4 = getResources().getString(R.string.textdev3_4);


        final TextView tVdev3;
        tVdev3 = (TextView) findViewById(R.id.textViewDev3_1);
        tVdev3.setText(tdev3);

        final TextView tVdev3_2;
        tVdev3_2 = (TextView) findViewById(R.id.textViewDev3_2);
        tVdev3_2.setText(tdev3_2);

        final TextView tVdev3_3;
        tVdev3_3 = (TextView) findViewById(R.id.textViewDev3_3);
        tVdev3_3.setText(tdev3_3);

        final TextView tVdev3_4;
        tVdev3_4 = (TextView) findViewById(R.id.textViewDev3_4);
        tVdev3_4.setText(tdev3_4);
    }
}
