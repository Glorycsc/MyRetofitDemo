package com.glory.slidingdelete;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import static com.glory.slidingdelete.R.layout.layout_recycler_item;

/**
 * Create by glorizz on 2018/9/1
 * Describe:
 */
public class DeleteAdapter extends RecyclerView.Adapter<DeleteAdapter.ViewHolder> {
    private Context context;
    private List<String> listData;

    public DeleteAdapter(Context context, List<String> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return new ViewHolder(inflater.inflate(layout_recycler_item, null));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TextView tvLeft = holder.swipeMenu.findViewById(R.id.left);
        TextView tvRight = holder.swipeMenu.findViewById(R.id.right);
        tvLeft.setText(listData.get(position));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        private SwipeMenu swipeMenu;

        public ViewHolder(View view) {
            super(view);
            this.swipeMenu = view.findViewById(R.id.swipe);
        }
    }
}
