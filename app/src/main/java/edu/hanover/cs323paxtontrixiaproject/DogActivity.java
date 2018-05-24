package edu.hanover.cs323paxtontrixiaproject;

import android.os.Bundle;
import android.app.Activity;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.View;

public class DogActivity extends Activity {

    public static final String EXTRA_DOGNO = "dogNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);

        //Get the dog from the intent
        int dogNo = (Integer) getIntent().getExtras().get(EXTRA_DOGNO);
        Dog dog = Dog.dog[dogNo];

        //Populate the dog image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(dog.getImageResourceId());
        photo.setContentDescription(dog.getName());

        //Populate the dog name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(dog.getName());

        //Populate the dog description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(dog.getDescription());
    }

    public void onCheck(View view) {
        Toast toast = Toast.makeText(this, "Dog is Available!", Toast.LENGTH_SHORT);
        toast.show();
    }

}
