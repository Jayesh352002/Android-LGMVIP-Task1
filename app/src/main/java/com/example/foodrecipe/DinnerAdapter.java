package com.example.foodrecipe;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DinnerAdapter extends RecyclerView.Adapter<DinnerAdapter.ViewHolder> {
    private LunchData[] listdata;
    private Context con ;

    // RecyclerView recyclerView;
    public DinnerAdapter(Context context, LunchData[] listdata) {
        this.listdata = listdata;
        this.con = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.lunch_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final LunchData myListData = listdata[position];
        holder.textView.setText(listdata[position].getName());
        holder.textView1.setText(listdata[position].getApply());
        holder.textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==0)
                {
                    Intent i = new Intent(con,Pulav.class);
                    con.startActivity(i);
                }
                if(position==1)
                {
                    Intent i = new Intent(con,TfriedRice.class);
                    con.startActivity(i);
                }
                if(position==2)
                {
                    Intent i = new Intent(con,DalK.class);
                    con.startActivity(i);
                }
                if(position==3)
                {
                    Intent i = new Intent(con,ChesseKh.class);
                    con.startActivity(i);
                }
                if(position==4)
                {
                    Intent i = new Intent(con,Pasta.class);
                    con.startActivity(i);
                }
                if(position==5)
                {
                    Intent i = new Intent(con,Biryani.class);
                    con.startActivity(i);
                }
                if(position==6)
                {
                    Intent i = new Intent(con,DalMhakhni.class);
                    con.startActivity(i);
                }
                if(position==7)
                {
                    Intent i = new Intent(con,DalPakwan.class);
                    con.startActivity(i);
                }
            }
        });
        holder.imageView.setImageResource(listdata[position].getImgId());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext()," "+myListData.getName(),Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView , textView1;
        public LinearLayout linearLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.img_one);
            this.textView = (TextView) itemView.findViewById(R.id.first);
            this.textView1 = (TextView) itemView.findViewById(R.id.apply);
            this.linearLayout = (LinearLayout) itemView.findViewById(R.id.r1);
        }
    }
}
