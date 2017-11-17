package patapignouf.com.tabs;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import patapignouf.com.R;

/* Fragment used as page 1 */
public class Page1Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page1, container, false);

        /*
        final EditText prix;
        prix = (EditText) rootView.findViewById(R.id.prixArt);

        final EditText red;
        red = (EditText) rootView.findViewById(R.id.redArt);


        final TextView res01;
        res01 = (TextView) rootView.findViewById(R.id.res01);

        final TextView res02;
        res02 = (TextView) rootView.findViewById(R.id.res02);

        final TextView res03;
        res03 = (TextView) rootView.findViewById(R.id.res03);


        final TextView res04;
        res04 = (TextView) rootView.findViewById(R.id.res04);




        Button calcbut;
        calcbut = (Button) rootView.findViewById(R.id.calcbutton);
        calcbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res02.setText(String.valueOf(Float.valueOf(String.valueOf(prix.getText()))*(1-Float.valueOf(String.valueOf(red.getText()))/100)));
                res01.setText(String.valueOf(Float.valueOf(String.valueOf(prix.getText()))-(Float.valueOf(String.valueOf(res02.getText())))));
                res03.setText(String.valueOf(Float.valueOf(String.valueOf(res03.getText()))+(Float.valueOf(String.valueOf(res01.getText())))));
                res04.setText(String.valueOf(Float.valueOf(String.valueOf(res04.getText()))+(Float.valueOf(String.valueOf(res02.getText())))));
            }
        });

        Button delete;
        delete = (Button) rootView.findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prix.setText("");
                red.setText("");
                res01.setText("0");
                res02.setText("0");
                res03.setText("0");
                res04.setText("0");
            }
        });
        */
        return rootView;

    }
}
