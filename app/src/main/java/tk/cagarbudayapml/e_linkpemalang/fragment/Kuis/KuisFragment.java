package tk.cagarbudayapml.e_linkpemalang.fragment.Kuis;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import tk.cagarbudayapml.e_linkpemalang.R;
import tk.cagarbudayapml.e_linkpemalang.activity.kuis.KuisPilganActivity;


public class KuisFragment extends Fragment {

    public KuisFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_kuis, container, false);
        Button button = (Button) rootView.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { goToAttract();

            }
        });
        return  rootView;
    }

    private void goToAttract() {
        Intent intent = new Intent(getActivity(),KuisPilganActivity.class);
        startActivity(intent);
    }



}