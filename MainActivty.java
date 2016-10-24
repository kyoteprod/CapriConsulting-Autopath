package capri.capritestapplication;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private java.util.Random Random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadRandomQuestion() {
        Intent[] Questions = {
                new Intent(this, MainActivity2.class)
        };
        int r = this.Random.nextInt(Questions.length-1) +1;
        Intent intent = Questions[r];
        
        startActivity(intent);
    }
}
