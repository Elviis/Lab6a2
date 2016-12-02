package butterycontent.lab6a2;

import android.app.ListFragment;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;



/**
 * Created by Jonathan on 2016-12-01.
 */

public class ListFrag extends ListFragment {

    ImageView headShotPic;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String[] values = new String[]{"Enterprise", "Star Trek Original", "Next Generation", "Deep Space 9", "Voyager"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);

        DetailFrag frag = (DetailFrag) getFragmentManager().findFragmentById(R.id.frag_capt);
        if (frag != null && frag.isInLayout()) {
            frag.setText(getCapt(item));
            frag.setImage((item));

        }
    }

    private String getCapt(String ship) {


        if (ship.toLowerCase().contains("enterprise")) {
         //   headShotPic.setImageResource(R.drawable.archer);
            return "Johnathan Archer";
        }
        if (ship.toLowerCase().contains("star trek")) {
            return "James T. Kirk";
        }
        if (ship.toLowerCase().contains("next generation")) {
            return "Jean-Luc Picard";
        }
        if (ship.toLowerCase().contains("deep space 9")) {
            return "Benjamin Sisko";
        }
        if (ship.toLowerCase().contains("voyager")) {
            return "Kathryn Janeway";
        }
        return "???";
    }



    private String getCaptPic(String ship) {
        if (ship.toLowerCase().contains("enterprise")) {

            return "JA";
        }
        if (ship.toLowerCase().contains("star trek")) {
            return "JTK";
        }
        if (ship.toLowerCase().contains("next generation")) {
            return "JLP";
        }
        if (ship.toLowerCase().contains("deep space 9")) {
            return "BS";
        }
        if (ship.toLowerCase().contains("voyager")) {
            return "KJ";
        }
        return "???";
    }
}




