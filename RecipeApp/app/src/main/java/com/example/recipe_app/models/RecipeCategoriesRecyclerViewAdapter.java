package com.example.recipe_app.models;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipe_app.R;
import com.example.recipe_app.activities.InsideRecipeCategoryActivity;

import java.util.ArrayList;
import java.util.List;

public class RecipeCategoriesRecyclerViewAdapter extends RecyclerView.Adapter<RecipeCategoriesRecyclerViewAdapter.MyViewHolder> implements Filterable {

    private Context context;
    private List<Recipe> recipeData;
    private List<Recipe> recipeDataSearch;


    public RecipeCategoriesRecyclerViewAdapter(Context context, List<Recipe> recipeData) {
        this.context = context;
        this.recipeData = recipeData;
        recipeDataSearch = new ArrayList<>(recipeData);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(context);
        view = mInflater.inflate(R.layout.cardview_of_recipes, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.tvBookTitle.setText(recipeData.get(position).getTitle());
        holder.imgBookThumbnail.setImageResource(recipeData.get(position).getThumbnail());

        //*******Set onclick Listener***********
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, InsideRecipeCategoryActivity.class);
                intent.putExtra("meal_type", recipeData.get(position).getCategory());

                //******start the activity**************
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return recipeData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvBookTitle;
        ImageView imgBookThumbnail;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvBookTitle = (TextView) itemView.findViewById(R.id.bookTitleId);
            imgBookThumbnail = (ImageView) itemView.findViewById(R.id.bookImgId);
            cardView = (CardView) itemView.findViewById(R.id.cardViewId);
        }
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }
    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Recipe> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(recipeDataSearch);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (Recipe item : recipeDataSearch) {
                    if (item.getTitle().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            recipeData.clear();
            recipeData.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };
}
