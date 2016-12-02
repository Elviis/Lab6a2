package butterycontent.lab6a2;

import android.app.Fragment;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jonathan on 2016-12-01.
 */

public class DetailFrag extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_fragment, container, false);
        return view;
    }
    public void setText(String item) {
        TextView view = (TextView) getView().findViewById(R.id.captain); view.setText(item);

    }

    public void setImage (String portrait){
        ImageView headShot = (ImageView) getView().findViewById(R.id.portraitView);


            if (portrait.toLowerCase().contains("enterprise")) {
                headShot.setImageResource(R.drawable.archer);
            }
            if (portrait.toLowerCase().contains("star trek")) {
                headShot.setImageResource(R.drawable.kirk);
            }
            if (portrait.toLowerCase().contains("next generation")) {
                headShot.setImageResource(R.drawable.picard);
            }
            if (portrait.toLowerCase().contains("deep space 9")) {
                headShot.setImageResource(R.drawable.sisko);
            }
            if (portrait.toLowerCase().contains("voyager")) {
                headShot.setImageResource(R.drawable.janeway);

            }




    }
}





