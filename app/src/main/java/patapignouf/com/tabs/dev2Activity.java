package patapignouf.com.tabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import patapignouf.com.R;


public class dev2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev2);
        String tdev2 = getResources().getString(R.string.textdev2_1);
        String tdev2_2 = getResources().getString(R.string.textdev2_2);
        String tdev2_3 = getResources().getString(R.string.textdev2_3);
        String tdev2_4 = getResources().getString(R.string.textdev2_4);
        String tdev2_5 = getResources().getString(R.string.textdev2_5);
        String tdev2_6 = getResources().getString(R.string.textdev2_6);
        String tdev2_7 = getResources().getString(R.string.textdev2_7);

        final TextView tVdev2;
        tVdev2 = (TextView) findViewById(R.id.textViewDev2_1);
        tVdev2.setText(tdev2);

        final TextView tVdev2_2;
        tVdev2_2 = (TextView) findViewById(R.id.textViewDev2_2);
        tVdev2_2.setText(tdev2_2);

        final TextView tVdev2_3;
        tVdev2_3 = (TextView) findViewById(R.id.textViewDev2_3);
        tVdev2_3.setText(tdev2_3);

        final TextView tVdev2_4;
        tVdev2_4 = (TextView) findViewById(R.id.textViewDev2_4);
        tVdev2_4.setText(tdev2_4);

        final TextView tVdev2_5;
        tVdev2_5 = (TextView) findViewById(R.id.textViewDev2_5);
        tVdev2_5.setText(tdev2_5);

        final TextView tVdev2_6;
        tVdev2_6 = (TextView) findViewById(R.id.textViewDev2_6);
        tVdev2_6.setText(tdev2_6);

        final TextView tVdev2_7;
        tVdev2_7 = (TextView) findViewById(R.id.textViewDev2_7);
        tVdev2_7.setText(tdev2_7);


    }
}
