package jinni.aboutmeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        final Switch switch1 = (Switch) findViewById(R.id.switch1);
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switch1.isChecked()) {
                    final TextView aboutMeView = (TextView) findViewById(R.id.textViewAboutMe);
                    final TextView bioView = (TextView) findViewById(R.id.textViewBio);
                    aboutMeView.setText(getApplicationContext().getResources().getString(R.string.about_me_personal));
                    bioView.setText(getApplicationContext().getResources().getString(R.string.personal_blurb));
                } else {
                    final TextView aboutMeView = (TextView) findViewById(R.id.textViewAboutMe);
                    final TextView bioView = (TextView) findViewById(R.id.textViewBio);
                    aboutMeView.setText(getApplicationContext().getResources().getString(R.string.about_me_prof));
                    bioView.setText(getApplicationContext().getResources().getString(R.string.prof_blurb));
                }
            }
        });
    }


}
