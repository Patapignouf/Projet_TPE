package patapignouf.com.tabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import patapignouf.com.R;


public class exp1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp1);

        String texp1 = getResources().getString(R.string.textexp1_1);
        String texp1_2 = getResources().getString(R.string.textexp1_2);
        String texp1_3 = getResources().getString(R.string.textexp1_3);
        String texp1_4 = getResources().getString(R.string.textexp1_4);
        String texp1_5 = getResources().getString(R.string.textexp1_5);
        String texp1_6 = getResources().getString(R.string.textexp1_6);



        final TextView tVexp1;
        tVexp1 = (TextView) findViewById(R.id.textViewExp1_1);
        tVexp1.setText(texp1);

        final TextView tVexp1_2;
        tVexp1_2 = (TextView) findViewById(R.id.textViewExp1_2);
        tVexp1_2.setText(texp1_2);

        final TextView tVexp1_3;
        tVexp1_3 = (TextView) findViewById(R.id.textViewExp1_3);
        tVexp1_3.setText(texp1_3);

        final TextView tVexp1_4;
        tVexp1_4 = (TextView) findViewById(R.id.textViewExp1_4);
        tVexp1_4.setText(texp1_4);

        final TextView tVexp1_5;
        tVexp1_5 = (TextView) findViewById(R.id.textViewExp1_5);
        tVexp1_5.setText(texp1_5);

        final TextView tVexp1_6;
        tVexp1_6 = (TextView) findViewById(R.id.textViewExp1_6);
        tVexp1_6.setText(texp1_6);


    }
}
