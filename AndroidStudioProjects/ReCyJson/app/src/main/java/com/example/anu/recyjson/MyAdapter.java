package com.example.anu.recyjson;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<TestModel> listItems;
    private Context context;

    public MyAdapter(List<TestModel> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        TestModel listItem = listItems.get(position);
        viewHolder.textView01.setText(listItem.getName());
        viewHolder.textView02.setText(listItem.getRealname());

        Picasso.get().load(listItem.getImageurl()).into(viewHolder.img);

        viewHolder.row.setOnClickListener(v -> {
            Toast.makeText(context, listItem.getName(), Toast.LENGTH_SHORT).show();

        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView01;
        public TextView textView02;
        public LinearLayout row;
        public ImageView img;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            textView01 = (TextView) itemView.findViewById(R.id.textView01);
            textView02 = (TextView) itemView.findViewById(R.id.textView02);
            row = (LinearLayout) itemView.findViewById(R.id.row);
            img = (ImageView) itemView.findViewById(R.id.img);
            //// test

        }
    }
}
