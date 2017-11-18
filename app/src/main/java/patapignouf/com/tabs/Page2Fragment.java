package patapignouf.com.tabs;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import patapignouf.com.R;

/* Fragment used as page 2 */
public class Page2Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page2, container, false);

        String retour = getResources().getString(R.string.retour_button);

        Button returnButton;
        returnButton = (Button) rootView.findViewById(R.id.backbutton2);
        returnButton.setText(retour);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Actions du bouton
                Intent intent = new Intent( getActivity(), Menu.class);
                startActivity(intent);
            }
        });


        return rootView;
    }


}
