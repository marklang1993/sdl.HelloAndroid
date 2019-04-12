package jp.ac.titech.itpro.sdl.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView viewOutput;
    private EditText editTextEnterName;
    private Button buttonOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewOutput = (TextView) findViewById(R.id.view_output);
        editTextEnterName = (EditText) findViewById(R.id.editText_enterName);
        buttonOk = (Button) findViewById(R.id.button_ok);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output(v);
            }
        });

    }
    public void output(View v) {
        String name = editTextEnterName.getText().toString().trim();

        if (name.length() > 0) {
            viewOutput.setText("Hello " + name + "!\nNice to see you!");
        }
    }
}
