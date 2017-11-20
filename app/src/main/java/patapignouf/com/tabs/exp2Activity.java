package patapignouf.com.tabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import patapignouf.com.R;

public class exp2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp2);

        String texp2 = getResources().getString(R.string.textexp2_1);
        String texp2_2 = getResources().getString(R.string.textexp2_2);
        String texp2_3 = getResources().getString(R.string.textexp2_3);
        String texp2_4 = getResources().getString(R.string.textexp2_4);
        String texp2_5 = getResources().getString(R.string.textexp2_5);



        final TextView tVexp2;
        tVexp2 = (TextView) findViewById(R.id.textViewExp2_1);
        tVexp2.setText(texp2);

        final TextView tVexp2_2;
        tVexp2_2 = (TextView) findViewById(R.id.textViewExp2_2);
        tVexp2_2.setText(texp2_2);

        final TextView tVexp2_3;
        tVexp2_3 = (TextView) findViewById(R.id.textViewExp2_3);
        tVexp2_3.setText(texp2_3);

        final TextView tVexp2_4;
        tVexp2_4 = (TextView) findViewById(R.id.textViewExp2_4);
        tVexp2_4.setText(texp2_4);

        final TextView tVexp2_5;
        tVexp2_5 = (TextView) findViewById(R.id.textViewExp2_5);
        tVexp2_5.setText(texp2_5);
    }
}
