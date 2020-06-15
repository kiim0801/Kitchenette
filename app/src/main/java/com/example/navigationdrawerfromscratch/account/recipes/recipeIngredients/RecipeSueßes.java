package com.example.navigationdrawerfromscratch.account.recipes.recipeIngredients;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigationdrawerfromscratch.R;
import com.example.navigationdrawerfromscratch.account.recipes.IngredientCategory;
import com.example.navigationdrawerfromscratch.account.recipes.RecipeGenerate;
import com.example.navigationdrawerfromscratch.adapters.ProductAdapter;
import com.example.navigationdrawerfromscratch.lebensmittel.Food;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class RecipeSueßes extends Fragment implements ProductAdapter.OnNoteListener {

    List<Food> süßList;
    DatabaseReference databaseSüßes;
    ProductAdapter adapter;
    private RecyclerView mResultList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_drinks, container, false);

        süßList = new ArrayList<>();
        databaseSüßes = FirebaseDatabase.getInstance().getReference("Lebensmittel"); //"Lebensmittel"
        mResultList = (RecyclerView) view.findViewById(R.id.drinksView);
        mResultList.setHasFixedSize(true);
        mResultList.setLayoutManager(new LinearLayoutManager(view.getContext()));

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        adapter = new ProductAdapter(getView().getContext(), süßList, this);
        databaseSüßes.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                süßList.clear();

                for(DataSnapshot productSnapshot: dataSnapshot.getChildren()){
                    Food obst = productSnapshot.getValue(Food.class);
                    if (obst.getCategory().equals("Süßes")){
                        süßList.add(obst);
                    }
                    mResultList.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }

    @Override
    public void onFoodClick(int position) {

        String foodID = süßList.get(position).getId();
        String foodName = süßList.get(position).getName();
        //String foodInfo = süßList.get(position).getInfo();
        String foodImage = süßList.get(position).getImage();
        String foodCategory = süßList.get(position).getCategory();
        Food food = new Food(foodName, foodID, foodImage, foodCategory);

        RecipeGenerate.productList.add(food);

        IngredientCategory ingredientCategory = new IngredientCategory();
        FragmentManager manager = getFragmentManager();
        manager.beginTransaction().replace(R.id.fragment_container, ingredientCategory, ingredientCategory.getTag()).addToBackStack(null).commit();
    }


    //View Holder Class

    public class FoodViewHolder extends RecyclerView.ViewHolder {

        View mView;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            mView = itemView;

        }


    }
}
