package com.example.gridview_recyclerview;

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

import java.util.ArrayList;
import java.util.List;

public class InsideRecipeCategoryRecyclerViewAdapter extends RecyclerView.Adapter<InsideRecipeCategoryRecyclerViewAdapter.MyViewHolder> implements Filterable {

    private Context context;
    private List<FoodItem> recipeData;
    private List<FoodItem> recipeDataSearch;


    public InsideRecipeCategoryRecyclerViewAdapter(Context context, List<FoodItem> recipeData) {
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
        final FoodItem recipePosition = recipeData.get(position);

        //*******Set onclick Listener***********
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, RecipeDetails.class);

                //***************Passing data to the RecipeDetails activity**********
                intent.putExtra("ID", recipePosition.getTitle());
                intent.putExtra("Title", recipePosition.getTitle());
                intent.putExtra("Category", recipePosition.getCategory());
                intent.putExtra("Description", recipePosition.getDescription());
                intent.putExtra("Ingredients", recipePosition.getIngredients());
                intent.putExtra("Directions", recipePosition.getDirections());
                intent.putExtra("Thumbnail", recipePosition.getThumbnail());
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
            List<FoodItem> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(recipeDataSearch);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (FoodItem item : recipeDataSearch) {
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