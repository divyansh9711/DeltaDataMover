package com.example.divyanshsingh.deltadatamover;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Divyansh Singh on 26-10-2017.
 */

public class SecondaryActivity extends MainActivity {
    private Button nButton = null;
    private Button jButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondary_activity);
        Intent inten = getIntent();
        String recieved = inten.getStringExtra("Id");

        TextView mText = (TextView) findViewById(R.id.nameText);
        mText.setText(recieved);
        String text = mText.getText().toString();
        nButton = (Button) findViewById(R.id.buton);
        jButton = (Button) findViewById(R.id.nButon);
        final Spinner nSpinner = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this,R.array.darr,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        nSpinner.setAdapter(adapter);
        ImageView img = (ImageView) findViewById(R.id.background);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(v.getContext(),MainActivity.class);
                startActivity(j);
            }
        });

        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(v.getContext(),MainActivity.class);
                startActivity(j);
            }
        });
        jButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = null;
                int choice = nSpinner.getSelectedItemPosition();
                switch (choice){
                    case 0:
                        k = new Intent("android.media.action.IMAGE_CAPTURE");
                        break;
                    case 1:
                        k = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
                        break;
                    case 2:
                        k = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:30.2715,-97.742"));
                        break;
                }
                startActivity(k);
            }
        });

    }
}
