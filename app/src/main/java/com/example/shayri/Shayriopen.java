package com.example.shayri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.Random;

public class Shayriopen extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    String shayri;
    String[]shayriarr;
    Button zoom,color,copy,left,edit,right,send;
    GridView gridView;
    int k;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_shayriopen);
        setContentView(R.layout.activity_shayriopen);
        textView=findViewById(R.id.Shayri_open_txt);
      k=getIntent().getIntExtra("pos",0);
      shayriarr=getIntent().getStringArrayExtra("shayr");
      shayri=getIntent().getStringExtra("shayri");
      textView.setText(""+shayri);
      zoom=findViewById(R.id.Zoom_button);
      color=findViewById(R.id.Color_change_button);
      copy=findViewById(R.id.Copy_button);
      left=findViewById(R.id.Left_button);
      edit=findViewById(R.id.Edit_button);
      right=findViewById(R.id.Right_button);
      send=findViewById(R.id.Share_button);
      zoom.setOnClickListener(this);
      color.setOnClickListener(this);
      copy.setOnClickListener(this);
      left.setOnClickListener(this);
      right.setOnClickListener(this);
      send.setOnClickListener(this);
      edit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()==zoom.getId())
        {
            BottomSheetDialog bottomSheetDialog =  new BottomSheetDialog(this);
            bottomSheetDialog.setContentView(R.layout.gridview_iteam);
            gridView=bottomSheetDialog.findViewById(R.id.Gradient_Gridview);
            BackgroundAdapter backgroundAdapter= new BackgroundAdapter(Shayriopen.this, Config.gradients);
            gridView.setAdapter(backgroundAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    textView.setBackgroundResource(Config.gradients[i]);
                    bottomSheetDialog.cancel();
                }

            });
            bottomSheetDialog.show();
        }
        if (view.getId()==color.getId())
        {
            int min=0;
            int max=7;
            int r=new Random().nextInt(max-min)+min;
            textView.setBackgroundResource(Config.gradients[r]);
        }
        if (view.getId()==copy.getId())
        {
            ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            cm.setText(textView.getText());
            Toast.makeText(this, "Copied ", Toast.LENGTH_SHORT).show();
        }
        if (view.getId()==left.getId())
        {
            if (k>0)
            {
                k--;
                textView.setText(shayriarr[k]);

            }
        }
        if (view.getId()==right.getId())
        {
            if (k<shayriarr.length-1)
            {
                k++;
                textView.setText(shayriarr[k]);
            }
        }
        if (view.getId()==send.getId())
        {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT,textView.getText());
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "The title");
            startActivity(Intent.createChooser(shareIntent, "Share..."));
        }
        if(view.getId()==edit.getId())
        {
            Intent intent= new Intent(Shayriopen.this,Edit_shyari.class);
            intent.putExtra("shayri",shayri);
            startActivity(intent);
        }


    }
}