package edu.hanover.cs323paxtontrixiaproject;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    //Call onFindDog() when button is clicked
    public void onFindDog(View view) {
        Intent intent = new Intent(this, DogBreeds.class);
        startActivity(intent);
    }
}
