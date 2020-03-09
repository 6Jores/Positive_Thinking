package com.example.positivethinking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.positivethinking.model.ModelManager;
import com.example.positivethinking.model.PositiveApp;
import com.example.positivethinking.model.Thought;
import com.example.positivethinking.tool.FileManager;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private File appFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fileInitialise();

        Button listButton = findViewById(R.id.list_button);
        Button rollButton = findViewById(R.id.roll_button);

        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"List",Toast.LENGTH_LONG).show();
            }
        });

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Roll",Toast.LENGTH_LONG).show();
            }
        });

        ModelManager.setPositiveApp(appFile);
    }

    private void fileInitialise(){
        File root = new File(Environment.getExternalStorageDirectory(),"positiveAppRoot");
        if (!root.exists()){
            root.mkdirs();
        }
        appFile = new File(root,"data");
    }

    private void testText(){

    }
}
