package patapignouf.com.tabs;

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

/* Fragment used as page 1 */
public class Page1Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_page1, container, false);

        String retour = getResources().getString(R.string.retour_button);

        Button returnButton;
        returnButton = (Button) rootView.findViewById(R.id.backbutton);
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

        ImageButton imageButton;
        imageButton = (ImageButton) rootView.findViewById(R.id.imageButton2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Actions du bouton
                Intent intent = new Intent( getActivity(), dev1Activity.class);
                startActivity(intent);
            }
        });

        return rootView;

    }
}
