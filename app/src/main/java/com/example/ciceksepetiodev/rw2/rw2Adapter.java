package com.example.ciceksepetiodev.rw2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ciceksepetiodev.databinding.CardTasarimBinding;

import java.util.List;

public class rw2Adapter extends RecyclerView.Adapter<rw2Adapter.CardTasarimTutucu> {

    private Context context;
    private List<rw2> rw2Listesi;

    public rw2Adapter(Context context,List<rw2> rw2Listesi ){
        this.context = context;
        this.rw2Listesi = rw2Listesi;
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder{
        private CardTasarimBinding binding;
        public CardTasarimTutucu(CardTasarimBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public rw2Adapter.CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding = CardTasarimBinding.inflate(LayoutInflater.from(context),parent,false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull rw2Adapter.CardTasarimTutucu holder, int position) {
        rw2 r2 = rw2Listesi.get(position);
        CardTasarimBinding t1 = holder.binding;
        t1.cardViewImage.setImageResource(context.getResources().getIdentifier(r2.getResimAd(),"drawable",context.getPackageName()));
    }

    @Override
    public int getItemCount() {
        return rw2Listesi.size();
    }
}
