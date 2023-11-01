package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout exerciseLL,stepCounterLL;
    private LottieAnimationView exerciseLAV,counterLAV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exerciseLL = findViewById(R.id.idLLExercise);
        stepCounterLL = findViewById(R.id.idLLExercise);
        exerciseLAV  = findViewById(R.id.idLAVExercise);
        exerciseLAV.setAnimation(R.raw.side_planks);
        exerciseLAV.loop(true);
        exerciseLAV.playAnimation();


        counterLAV = findViewById(R.id.idLAVStepCounter);
        counterLAV.setAnimation(R.raw.push_ups);
        counterLAV.loop(true);
        counterLAV.playAnimation();

        //using url
//        exerciseLAV.setAnimationFromUrl("https://lottie.host/?file=07a53775-7a18-47c4-bc57-091722fd273e/WPzD0ArX7t.json");
//        counterLAV.setAnimationFromUrl("https://lottie.host/?file=07a53775-7a18-47c4-bc57-091722fd273e/WPzD0ArX7t.json");


//        LottieAnimationView exercise = findViewById(R.id.idLAVExercise);
//        exercise.setAnimation(R.raw.push_ups);
//        exercise.playAnimation();
//
//        LottieAnimationView counter = findViewById(R.id.idLAVStepCounter);
//        counter.setAnimation(R.raw.abs_crunches);
//        counter.playAnimation();


        exerciseLL.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                Intent i= new Intent(MainActivity.this, ExerciseActivity.class);
                startActivity(i);
            }
        });

        stepCounterLL.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                Intent i = new Intent(MainActivity.this, StepCounterActivity.class);
                startActivity(i);
            }
        });



    }
}