package tk.cagarbudayapml.e_linkpemalang.fragment.lokasi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import tk.cagarbudayapml.e_linkpemalang.R;


public class LokasiFragment extends Fragment {


    public LokasiFragment() {
        // Required empty public constructor
    }


    ImageView Lokasi;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewHome = inflater.inflate(R.layout.fragment_lokasi, container, false);
        Lokasi = viewHome.findViewById(R.id.lokasi);
        Glide.with(getActivity()).load(R.drawable.peta).crossFade().into(Lokasi);
        return viewHome;
    }


}
