package com.example.railfence;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button encbtn;
    private Button decbtn;
    private EditText intxt;
    private EditText outtxt;
    private Button clrbtn;
    private String input;
    int i,j,l,k;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        encbtn = (Button)findViewById(R.id.btnenc);
        decbtn = (Button)findViewById(R.id.btndec);
        intxt = (EditText)findViewById(R.id.intext);
        outtxt = (EditText)findViewById(R.id.outtext);
        clrbtn = (Button)findViewById(R.id.btnclr);

        encbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input=intxt.getText().toString();
                l=input.length();
                char[] c = new char[l];
                j=0;
                for(i=0;i<l;i++) {
                    if(i%2==0)
                        c[j++] = input.charAt(i);
                }
                for(i=0;i<l;i++) {
                    if(i%2==1)
                        c[j++] = input.charAt(i);
                }
                String c1 = new String(c);
                outtxt.setText(c1);
            }
        });

        clrbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intxt.setText("");
                outtxt.setText("");
            }
        });

        decbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input= intxt.getText().toString();
                l=input.length();
                char[] d = new char[l];
                j=0;
                if(l%2==0)
                    k = l/2;
                else
                    k = (l/2)+1;
                for(int i=0;i<k;i++) {
                    d[j] = input.charAt(i);
                    j+=2;
                }
                j=1;
                for(int i=k;i<l;i++) {
                    d[j] = input.charAt(i);
                    j+=2;
                }
                String d1 = new String(d);
                outtxt.setText(d1);
            }
        });

    }
}
