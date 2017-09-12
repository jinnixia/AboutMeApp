package jinni.aboutmeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Home extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button aboutMeButton = (Button) findViewById(R.id.about_me_button);

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutMe();
            }
        });

    }

    /**
     * Brings user to about me screen
     */
    private void aboutMe() {
        Intent aboutIntent = new Intent(Home.this, AboutMe.class);
        aboutIntent.putExtra("isEdit", true);
        startActivity(aboutIntent);
    }

}
