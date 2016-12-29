package app.viewpager.android.narena.com.master;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by ibrisimovicnarena on 12/29/16.
 */

public class TopRatedFragment extends Fragment {
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_top_rated,container,false);
        return rootView;
    }
}
