package com.juck.jxk.mbookretrofit2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.juck.jxk.mbookretrofit2.model.Book;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by JXK on 17/11/2560.
 */

public class BookAdapter extends ArrayAdapter<Book> {
    List<Book> bookList;
    Context context;
    private LayoutInflater mInflater;


    public BookAdapter(Context context, List<Book> object) {
        super(context, 0,object);
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        bookList = object;
    }
    @Override
    public Book getItem(int position)
    {
        return bookList.get(position);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder vh;
        if (convertView == null) {
            View view = mInflater.inflate(R.layout.grid_layout, parent, false);
            vh = ViewHolder.create((RelativeLayout) view);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        Book item = getItem(position);

        vh.textViewName.setText(item.getBookName());
        Picasso.with(context).load(item.getBookImage()).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(vh.imageView);

        return vh.rootView;
    }

    private static class ViewHolder {
        public final RelativeLayout rootView;
        public final ImageView imageView;
        public final TextView textViewName;

        private ViewHolder(RelativeLayout rootView, TextView textViewName, ImageView imageView) {
            this.rootView = rootView;
            this.textViewName = textViewName;
            this.imageView = imageView;

        }

        public static ViewHolder create(RelativeLayout rootView) {
            TextView textViewName = (TextView) rootView.findViewById(R.id.textBook_NAME);
            ImageView imageView = (ImageView) rootView.findViewById(R.id.imagegetshow);
            return new ViewHolder(rootView,textViewName,imageView);
        }
    }
}
