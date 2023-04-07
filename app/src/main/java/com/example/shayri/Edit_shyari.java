package com.example.shayri;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Edit_shyari extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    String shayri;
    GridView gridView;
    ScrollView scrollView;
    SeekBar seekBar;
    String type;
    Button colourchange,zoom,backgroud,textcolour,share,font,emoji,textsize;
    File localefile;
    String permission []={Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_shyari);
        textView=findViewById(R.id.Edit_shayritext);
        shayri=getIntent().getStringExtra("shayri");
        textView.setText(""+shayri);
        colourchange=findViewById(R.id.Change_button1);
        zoom=findViewById(R.id.Zoom_button1);
        backgroud=findViewById(R.id.Background_button);
        textcolour=findViewById(R.id.Text_color_button);
        share=findViewById(R.id.Share_button);
        font=findViewById(R.id.Font_button);
        emoji=findViewById(R.id.Emoji_button);
        textsize=findViewById(R.id.Size_button);
        colourchange.setOnClickListener(this);
        zoom.setOnClickListener(this);
        backgroud.setOnClickListener(this);
        textcolour.setOnClickListener(this);
        share.setOnClickListener(this);
        font.setOnClickListener(this);
        emoji.setOnClickListener(this);
        textsize.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {
        if (view.getId()==zoom.getId())
        {
            BottomSheetDialog bottomSheetDialog =  new BottomSheetDialog(this);
            bottomSheetDialog.setContentView(R.layout.gridview_iteam);
            gridView=bottomSheetDialog.findViewById(R.id.Gradient_Gridview);
            BackgroundAdapter backgroundAdapter= new BackgroundAdapter(Edit_shyari.this, Config.gradients);
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
        if (view.getId()==colourchange.getId())
        {
            int min=0;
            int max=7;
            int r=new Random().nextInt(max-min)+min;
            textView.setBackgroundResource(Config.gradients[r]);
        }
        if (view.getId()==backgroud.getId())
            {
                BottomSheetDialog bottomSheetDialog =  new BottomSheetDialog(this);
                bottomSheetDialog.setContentView(R.layout.gridview_iteam);
                gridView=bottomSheetDialog.findViewById(R.id.Gradient_Gridview);
                BackgroundAdapter backgroundAdapter= new BackgroundAdapter(Edit_shyari.this, Config.colours);
                gridView.setAdapter(backgroundAdapter);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @SuppressLint("ResourceType")
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        textView.setBackgroundResource(Config.colours[i]);
                        bottomSheetDialog.cancel();
                    }

                });
                bottomSheetDialog.show();
            }
        if (view.getId()==textcolour.getId())
        {
            BottomSheetDialog bottomSheetDialog =  new BottomSheetDialog(this);
            bottomSheetDialog.setContentView(R.layout.gridview_iteam);
            gridView=bottomSheetDialog.findViewById(R.id.Gradient_Gridview);
            BackgroundAdapter backgroundAdapter= new BackgroundAdapter(Edit_shyari.this, Config.colours);
            gridView.setAdapter(backgroundAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @SuppressLint("ResourceType")
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    textView.setTextColor(getResources().getColor(Config.colours[i]));
                    bottomSheetDialog.cancel();
                }

            });
            bottomSheetDialog.show();
        }

        if(view.getId()==textsize.getId())
        {
            BottomSheetDialog bottomSheetDialog =  new BottomSheetDialog(this);
            bottomSheetDialog.setContentView(R.layout.text_size_activity);
            seekBar=bottomSheetDialog.findViewById(R.id.text_size_bar);
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    textView.setTextSize(2,i);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }

            });
            bottomSheetDialog.show();
        }
        if (view.getId()==font.getId())
        {
            BottomSheetDialog bottomSheetDialog =  new BottomSheetDialog(this);
            bottomSheetDialog.setContentView(R.layout.gridview_iteam);
            gridView=bottomSheetDialog.findViewById(R.id.Gradient_Gridview);
            type="font";
            FontAdapter backgroundAdapter= new FontAdapter(Edit_shyari.this, Config.font,type);
            gridView.setAdapter(backgroundAdapter);

            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @SuppressLint("ResourceType")
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Typeface typeface = Typeface.createFromAsset(getAssets(),Config.font[i]);

                    textView.setTypeface(typeface);
                    bottomSheetDialog.cancel();
                }

            });
            bottomSheetDialog.show();
        }   if (view.getId()==emoji.getId())
        {
            BottomSheetDialog bottomSheetDialog =  new BottomSheetDialog(this);
            bottomSheetDialog.setContentView(R.layout.gridview_iteam);
            gridView=bottomSheetDialog.findViewById(R.id.Gradient_Gridview);
            type="emoji";
            FontAdapter backgroundAdapter= new FontAdapter(Edit_shyari.this, Config.emoji,type);
            gridView.setAdapter(backgroundAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @SuppressLint("ResourceType")
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    textView.setText(""+Config.emoji[i]+"\n"+shayri+"\n"+Config.emoji[i]);
                    bottomSheetDialog.cancel();
                }

            });
            bottomSheetDialog.show();
        }
        if (view.getId()==share.getId())
        {
            requestPermissions(permission,1);

        }
    }
    private Bitmap getBitmapFromView(View view)
    {
        Bitmap returnedBitmap = Bitmap.createBitmap(view.getWidth(),view.getHeight(),Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(returnedBitmap);
        Drawable drawable = view.getBackground();
        if (drawable != null)
        {
            drawable.draw(canvas);
        }
        else
        {
            canvas.drawColor(Color.WHITE);
        }
        view.draw(canvas);
        return returnedBitmap;
    }
    @Override
 public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
       if(grantResults[0]== PackageManager.PERMISSION_GRANTED || grantResults[1]==PackageManager.PERMISSION_GRANTED)
        {
            Bitmap bitmap = getBitmapFromView(textView);
            Intent share = new Intent(Intent.ACTION_SEND);
            share.setType("image/jpeg");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG,100,byteArrayOutputStream);
            int num=new Random().nextInt(2000);
            SimpleDateFormat s = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
            String c = s.format(new Date());
            localefile=new File(Config.file.getAbsolutePath()+"img/"+c+".jpg");
            try {
                localefile.createNewFile();
                FileOutputStream fo= new FileOutputStream(localefile);
                fo.write(byteArrayOutputStream.toByteArray());
                Toast.makeText(this, "dowenload", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                e.printStackTrace();
            }
            share.putExtra(Intent.EXTRA_STREAM, Uri.parse(localefile.getAbsolutePath()));
            startActivity(Intent.createChooser(share,"share...."));

        }
        else
        {
            finish();
        }

    }
}