package com.example.nikhilreddy.ass;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ChapterAdapter extends ArrayAdapter<Item>{

    private int colorId;

    public ChapterAdapter(Context context, ArrayList<Item> arrayList, int colorId){
        super(context,0,arrayList);
        this.colorId = colorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view,parent,false);
        }

        Item currentItem = getItem(position);

        TextView numberView = (TextView) listItemView.findViewById(R.id.number_text);
        numberView.setText(currentItem.getNumber());

        TextView chapterView = (TextView) listItemView.findViewById(R.id.chapter_text);
        chapterView.setText(currentItem.getChapter());

        LinearLayout linearLayout = (LinearLayout)listItemView.findViewById(R.id.list_for_item);
        int color = ContextCompat.getColor(getContext(),colorId);
        linearLayout.setBackgroundColor(color);

        return listItemView;
    }
}
