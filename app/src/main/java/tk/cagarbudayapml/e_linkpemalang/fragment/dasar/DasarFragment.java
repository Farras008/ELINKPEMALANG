package tk.cagarbudayapml.e_linkpemalang.fragment.dasar;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;

import tk.cagarbudayapml.e_linkpemalang.R;


public class DasarFragment extends Fragment {
    PDFView pdfView;
    Integer pageNumber = 0;
    String pdfFileName;


    public DasarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewHome = inflater.inflate(R.layout.fragment_dasar, container, false);
        pdfView = (viewHome).findViewById(R.id.webdasaritu);
        pdfView.fromAsset("uu.pdf").load();
        return viewHome;
    }




}
