package edu.hanover.cs323paxtontrixiaproject;

import android.os.Bundle;
import android.app.ListActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;

public class DogBreeds extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDogs = getListView();
        ArrayAdapter<Dog> listAdapter = new ArrayAdapter<Dog>(this, android.R.layout.simple_list_item_1, Dog.dog);
        listDogs.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        Intent intent = new Intent(DogBreeds.this, DogActivity.class);
        intent.putExtra(DogActivity.EXTRA_DOGNO, (int) id);
        startActivity(intent);
    }

}
