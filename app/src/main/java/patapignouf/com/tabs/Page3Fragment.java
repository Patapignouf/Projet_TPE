package patapignouf.com.tabs;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import patapignouf.com.R;

/* Fragment used as page 3 */
public class Page3Fragment extends Fragment {

    @SuppressLint("WrongConstant")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page3, container, false);

        String retour = getResources().getString(R.string.retour_button);
        String xp2buttonS = getResources().getString(R.string.xp2buttonS);

        Button returnButton;
        returnButton = (Button) rootView.findViewById(R.id.backbutton3);
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

        Button xp2Button;
        xp2Button = (Button) rootView.findViewById(R.id.xp2button);
        xp2Button.setText(xp2buttonS);
        xp2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Actions du bouton
                Intent intent = new Intent( getActivity(), exp2Activity.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton;
        imageButton = (ImageButton) rootView.findViewById(R.id.imageButton4);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Actions du bouton
                Intent intent = new Intent( getActivity(), dev3Activity.class);
                startActivity(intent);
            }
        });


        return rootView;
    }
}
