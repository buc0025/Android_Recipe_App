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

        holder.tv_book_title.setText(recipeData.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(recipeData.get(position).getThumbnail());

        //*******Set onclick Listener***********
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, RecipeDetails.class);

                //***************Passing data to the RecipeDetails activity**********
                intent.putExtra("Title", recipeData.get(position).getTitle());
                intent.putExtra("Description", recipeData.get(position).getDescription());
                intent.putExtra("Thumbnail", recipeData.get(position).getThumbnail());
                intent.putExtra("Category", recipeData.get(position).getCategory());
                intent.putExtra("Ingredients", recipeData.get(position).getIngredients());
                intent.putExtra("Directions", recipeData.get(position).getDirections());
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

        TextView tv_book_title;
        ImageView img_book_thumbnail;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_book_title = (TextView) itemView.findViewById(R.id.book_title_id);
            img_book_thumbnail = (ImageView) itemView.findViewById(R.id.book_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardView_id);

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