package tk.cagarbudayapml.e_linkpemalang.fragment.cagar;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import tk.cagarbudayapml.e_linkpemalang.R;
import tk.cagarbudayapml.e_linkpemalang.adapter.CagarRecyclerAdapter;
import tk.cagarbudayapml.e_linkpemalang.data.CagarData;
import tk.cagarbudayapml.e_linkpemalang.model.CagarModel;


public class CagarFragment extends Fragment {


    public CagarFragment() {
        // Required empty public constructor
    }
    RecyclerView rv_cagar;
    private ArrayList<CagarModel> cagarModelArrayList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewcagar = inflater.inflate(R.layout.fragment_cagar, container, false);
        rv_cagar = viewcagar.findViewById(R.id.rv_cagar);
        rv_cagar.setHasFixedSize(true);

        cagarModelArrayList = new ArrayList<>();
        cagarModelArrayList.addAll(CagarData.getListData());

        showCagarRecyclerList();
        return viewcagar;
    }

    private void showCagarRecyclerList() {
        rv_cagar.setLayoutManager(new GridLayoutManager(getActivity(),2));
        CagarRecyclerAdapter cagarRecyclerAdapter = new CagarRecyclerAdapter(getActivity());
        cagarRecyclerAdapter.setCagarModelArrayList(cagarModelArrayList);
        rv_cagar.setAdapter(cagarRecyclerAdapter);
    }

}
