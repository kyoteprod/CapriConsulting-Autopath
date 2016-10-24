package capri.capritestapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.Questions = {
		    "MainActivity2"
	    };
	    Random r = new Random();
	    this.Random = r.nextInt(this.Questions.Length-1) + 1;
    }

    public void loadRandomQuestion() {
	    Intent intent = new Intent(this, this.Questions[this.Random].class);
	    String[] questionsUpdated = new String[this.Questions.Length -1];
	    for(int i = 0; i <= this.Questions; i++) {
	    	if(i != this.Random) {
			    questionsUpdated[i] = this.Questions[i];
		    }
	    }
	    intent.putExtra(EXTRA_QUESTIONS, questionsUpdated);
	    startActivity();
    }
}
