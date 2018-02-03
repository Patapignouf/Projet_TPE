package patapignouf.com.tabs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import patapignouf.com.R;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        String menu = getResources().getString(R.string.menu);
        String intro = getResources().getString(R.string.menuButtonIntro);
        String old = getResources().getString(R.string.menuButtonOld);
        String apropos = getResources().getString(R.string.menuButtonCredit);
        String conclusion = getResources().getString(R.string.menuButtonConclusion);


        final TextView menuTV;
        menuTV = (TextView) findViewById(R.id.menu);
        menuTV.setText(menu);

        Button introButton;
        introButton = (Button) findViewById(R.id.introButton);
        introButton.setText(intro);
        //introButton.layout
        introButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //Actions du bouton
                Intent intent = new Intent(Menu.this, introductionActivity.class);
                startActivity(intent);

            }
        });

        Button oldButton;
        oldButton = (Button) findViewById(R.id.oldButton);
        oldButton.setText(old);
        oldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Actions du bouton
                Page1Fragment.marqueur = 0;
                Intent intent = new Intent(Menu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button conButton;
        conButton = (Button) findViewById(R.id.conButton);
        conButton.setText(conclusion);
        conButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Actions du bouton
                Intent intent = new Intent(Menu.this, conclusionActivity.class);
                startActivity(intent);
            }
        });


        Button creditButton;
        creditButton = (Button) findViewById(R.id.aproposButton);
        creditButton.setText(apropos);
        creditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Actions du bouton
                Intent intent = new Intent(Menu.this, creditActivity.class);
                startActivity(intent);
            }
        });

    }
}
