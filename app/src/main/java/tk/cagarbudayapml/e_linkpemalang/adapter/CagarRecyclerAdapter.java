package tk.cagarbudayapml.e_linkpemalang.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import tk.cagarbudayapml.e_linkpemalang.R;
import tk.cagarbudayapml.e_linkpemalang.activity.detailcagar.DetailCagarActivity;
import tk.cagarbudayapml.e_linkpemalang.model.CagarModel;

public class CagarRecyclerAdapter extends RecyclerView.Adapter<CagarRecyclerAdapter.CagarViewHolder> {
    private  Context context;
    private ArrayList<CagarModel> cagarModelArrayList;

    public ArrayList<CagarModel> getCagarModelArrayList() {
        return cagarModelArrayList;
    }
    public void setCagarModelArrayList (ArrayList<CagarModel> cagarModelArrayList){
        this.cagarModelArrayList = cagarModelArrayList;
    }
    public CagarRecyclerAdapter (Context context){
        this.context = context;
    }
    @Override
    public CagarViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
    View itemCagar = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cagar,parent, false);
    return new CagarViewHolder(itemCagar);
    }

    @Override
    public void onBindViewHolder(final CagarViewHolder holder, final int position) {
      holder.cagarJudul.setText(getCagarModelArrayList().get(position).getJudulCagar());
        Glide.with(context).load(getCagarModelArrayList().get(position).getLogoCagar())
                .crossFade()
                .into(holder.cagarFoto);
        holder.cardDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailCagar = new Intent(context, DetailCagarActivity.class);
                detailCagar.putExtra("DATA_FOTO",getCagarModelArrayList().get(position).getLogoCagar());
                detailCagar.putExtra("DATA_JUDUL",getCagarModelArrayList().get(position).getJudulCagar());
                detailCagar.putExtra("DATA_DESKRIPSI",getCagarModelArrayList().get(position).getDeskripsiCagar());
                context.startActivity(detailCagar);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getCagarModelArrayList().size();
    }
    class CagarViewHolder extends  RecyclerView.ViewHolder {
        TextView cagarJudul;
        ImageView cagarFoto;
        CardView cardDetail;

        private CagarViewHolder(View itemView) {
            super(itemView);
            cagarFoto = itemView.findViewById(R.id.iv_cagar_foto);
            cagarJudul = itemView.findViewById(R.id.tv_cagar_judul);
            cardDetail = itemView.findViewById(R.id.cardDetail);
        }

    }


}
