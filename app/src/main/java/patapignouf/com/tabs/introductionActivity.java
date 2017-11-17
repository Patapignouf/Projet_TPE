package patapignouf.com.tabs;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import patapignouf.com.R;

public class introductionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);


        String credit = getResources().getString(R.string.introtext);


        final TextView menuTV;
        menuTV = (TextView) findViewById(R.id.textViewIntro);
        menuTV.setText(credit);

    }

}