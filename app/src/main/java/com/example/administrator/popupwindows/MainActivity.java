package com.example.administrator.popupwindows;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View root = this.getLayoutInflater().inflate(R.layout.activity_main,null);
        final PopupWindow popup = new PopupWindow(root,280,360);
        Button button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup.showAsDropDown(v);
                popup.showAtLocation(findViewById(R.id.button1), Gravity.CENTER,20,20);
            }
        });
        root.findViewById(R.id.close).setOnClickListener((
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        popup.dismiss();
                    }
                }
                ));
    }
}
