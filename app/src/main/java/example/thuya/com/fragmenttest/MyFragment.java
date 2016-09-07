package example.thuya.com.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by thuyha on 07/09/2016.
 */
public class MyFragment extends Fragment {
    public MyFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup containner, Bundle saveInstanceState){
        View rootView = inflater.inflate(R.layout.my_fragment, containner, false);
        return rootView;
    }

}
