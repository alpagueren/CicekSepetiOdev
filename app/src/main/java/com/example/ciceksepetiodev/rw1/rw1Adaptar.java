package com.example.ciceksepetiodev.rw1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ciceksepetiodev.databinding.CircleCardTasarimBinding;

import java.util.List;

public class rw1Adaptar extends RecyclerView.Adapter<rw1Adaptar.CircleCardTasarımTutucu> {
    private Context context;
    private List<rw1> rwListesi;

    public rw1Adaptar(Context context, List<rw1> rwListe) {
        this.context = context;
        this.rwListesi = rwListe;
    }

    public class CircleCardTasarımTutucu extends RecyclerView.ViewHolder{
        private CircleCardTasarimBinding binding;
        public CircleCardTasarımTutucu(CircleCardTasarimBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public CircleCardTasarımTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CircleCardTasarimBinding binding = CircleCardTasarimBinding.inflate(LayoutInflater.from(context),parent,false);
        return new CircleCardTasarımTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CircleCardTasarımTutucu holder, int position) {
        rw1 r1 = rwListesi.get(position);
        CircleCardTasarimBinding t = holder.binding;

        t.CardViewImageBir.setImageResource(context.getResources().getIdentifier(r1.getResimAd(),"drawable", context.getPackageName()));
        t.circleCardTextView.setText(r1.getAciklama());
    }

    @Override
    public int getItemCount() {
        return rwListesi.size();
    }
}
