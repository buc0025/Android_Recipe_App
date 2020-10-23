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

import com.example.recipe_app.activities.OwnRecipeActivity;
import com.example.recipe_app.R;

import java.util.ArrayList;
import java.util.List;

public class CustomRecipeRecyclerViewAdapter extends RecyclerView.Adapter<CustomRecipeRecyclerViewAdapter.MyViewHolder> implements Filterable {

    private Context context;
    private List<Recipe> customRecipes;
    private List<Recipe> customRecipeSearch;

    public CustomRecipeRecyclerViewAdapter(Context context, List<Recipe> customRecipes) {
        this.context = context;
        this.customRecipes = customRecipes;
        customRecipeSearch = new ArrayList<>(customRecipes);
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

        holder.tvBookTitle.setText(customRecipes.get(position).getTitle());
        holder.imgBookThumbnail.setImageResource(R.drawable.stock_food_pic);
        final Recipe recipePosition = customRecipes.get(position);

        //*******Set onclick Listener***********
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, OwnRecipeActivity.class);

                //***************Passing data to the OwnRecipeActivity activity**********
                intent.putExtra("Custom Title", recipePosition.getTitle());
                intent.putExtra("Custom Category", recipePosition.getCategory());
                intent.putExtra("Custom Description", recipePosition.getDescription());
                intent.putExtra("Custom Ingredients", recipePosition.getIngredients());
                intent.putExtra("Custom Directions", recipePosition.getDirections());

                //******start the activity**************
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return customRecipes.size();
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
                filteredList.addAll(customRecipeSearch);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (Recipe item : customRecipeSearch) {
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
            customRecipes.clear();
            customRecipes.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };
}
