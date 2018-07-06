package tk.cagarbudayapml.e_linkpemalang.fragment.home;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;

import tk.cagarbudayapml.e_linkpemalang.R;

public class HomeFragment extends Fragment {

    public HomeFragment() {

        // Required empty public constructor
    }

    ImageView bgHome;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewHome = inflater.inflate(R.layout.fragment_home, container, false);
        bgHome = viewHome.findViewById(R.id.bg_Home);
        Glide.with(getActivity()).load(R.drawable.background).crossFade().into(bgHome);
        return viewHome;
    }


}
