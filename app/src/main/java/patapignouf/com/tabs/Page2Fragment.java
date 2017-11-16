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

/* Fragment used as page 2 */
public class Page2Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page2, container, false);

        final Float eurRes;
        final Float dongRes;

        final EditText dongVal;
        dongVal = (EditText) rootView.findViewById(R.id.val);
        dongVal.setText("26414.15");

        final EditText eurMont;
        eurMont = (EditText) rootView.findViewById(R.id.eurText);

        final EditText dongMont;
        dongMont = (EditText) rootView.findViewById(R.id.eurText2);

        final TextView resEur;
        resEur = (TextView) rootView.findViewById(R.id.res1);

        final TextView resDong;
        resDong = (TextView) rootView.findViewById(R.id.res2);

        Button convButton;
        convButton = (Button) rootView.findViewById(R.id.convButton);
        convButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resEur.setText(String.valueOf(Float.valueOf(String.valueOf(eurMont.getText()))*Float.valueOf(String.valueOf(dongVal.getText()))));
            }
        });

        Button convButton2;
        convButton = (Button) rootView.findViewById(R.id.convButton2);
        convButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resDong.setText(String.valueOf(Float.valueOf(String.valueOf(dongMont.getText()))/Float.valueOf(String.valueOf(dongVal.getText()))));
            }
        });







        return rootView;
    }


}
