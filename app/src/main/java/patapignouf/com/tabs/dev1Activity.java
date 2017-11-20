package patapignouf.com.tabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import patapignouf.com.R;


public class dev1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev1);
        String tdev1 = getResources().getString(R.string.textdev1_1);
        String tdev1_2 = getResources().getString(R.string.textdev1_2);

        final TextView tVdev1;
        tVdev1 = (TextView) findViewById(R.id.textViewDev1_1);
        tVdev1.setText(tdev1);

        final TextView tVdev1_2;
        tVdev1_2 = (TextView) findViewById(R.id.textViewDev1_2);
        tVdev1_2.setText(tdev1_2);
    }
}
