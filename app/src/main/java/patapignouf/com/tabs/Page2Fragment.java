package patapignouf.com.tabs;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import patapignouf.com.R;

/* Fragment used as page 2 */
public class Page2Fragment extends Fragment {


    @SuppressLint("WrongConstant")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page2, container, false);

        String retour = getResources().getString(R.string.retour_button);
        String xp1buttonS = getResources().getString(R.string.xp1buttonS);

        Button returnButton;
        returnButton = (Button) rootView.findViewById(R.id.backbutton2);
        returnButton.setText(retour);
        returnButton.setVisibility(rootView.INVISIBLE);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Actions du bouton
                Intent intent = new Intent( getActivity(), Menu.class);
                startActivity(intent);
            }
        });

        Button xp1Button;
        xp1Button = (Button) rootView.findViewById(R.id.xp1button);
        xp1Button.setText(xp1buttonS);
        xp1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Actions du bouton
                Intent intent = new Intent( getActivity(), exp1Activity.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton;
        imageButton = (ImageButton) rootView.findViewById(R.id.imageButton3);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Actions du bouton
                Intent intent = new Intent( getActivity(), dev2Activity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }


}
