package com.sad.simple_calculator10002;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText sayi1;
    EditText sayi2;
    EditText x;
    EditText y;
    TextView sonuc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            sayi1=findViewById(R.id.sayi1);
            sayi2=findViewById(R.id.sayi2);
            x=findViewById(R.id.x);
            y=findViewById(R.id.y);
            sonuc=findViewById(R.id.sonuc);
            return insets;
        });

    }

    public void toplama(View view){
        if (sayi1.getText().toString().matches("")||sayi2.getText().toString().matches("")){
        sonuc.setText("result"+"   "+"napıyorsun kardeşim");
    }
      else {  int number1=Integer.parseInt(sayi1.getText().toString());
        int number2=Integer.parseInt(sayi2.getText().toString());
        int sonuc1=number1+number2;
        sonuc.setText("sonuc"+""+sonuc1);}

    }
    public void cıkarma(View view){
        if (sayi1.getText().toString().matches("")||sayi2.getText().toString().matches("")){
            sonuc.setText("result"+"   "+"napıyorsun kardeşim");
        }
        else {
            int number1 = Integer.parseInt(sayi1.getText().toString());
            int number2 = Integer.parseInt(sayi2.getText().toString());
            int sonuc1 = number1 - number2;
            sonuc.setText("sonuc:" + "" + sonuc1);
        }

    }

    public void carpma(View view){
        if (sayi1.getText().toString().matches("")||sayi2.getText().toString().matches("")){
            sonuc.setText("result"+"   "+"napıyorsun kardeşim");
        }
        else{
        int number1=Integer.parseInt(sayi1.getText().toString());
        int number2=Integer.parseInt(sayi2.getText().toString());
        int sonuc1=number1*number2;
        sonuc.setText("sonuc:"+""+sonuc1);}

    }
    public void bolme(View view){
        if (sayi1.getText().toString().matches("")||sayi2.getText().toString().matches("")){
            sonuc.setText("result"+"   "+"napıyorsun kardeşim");
        }
        else {
            int number1 = Integer.parseInt(sayi1.getText().toString());
            int number2 = Integer.parseInt(sayi2.getText().toString());
            int sonuc1 = number1 / number2;
            sonuc.setText("sonuc:" + "" + sonuc1);
        }
    }
    public void karealma(View view){
        if (sayi1.getText().toString().matches("")||sayi2.getText().toString().matches("")){
            sonuc.setText("result"+"   "+"napıyorsun kardeşim");
        }
        else {
            int number1 = Integer.parseInt(x.getText().toString());
            //int number2=Integer.parseInt(sayi2.getText().toString());
            int sonuc1 = number1 * number1;
            sonuc.setText("sonuc:" + "" + sonuc1);
        }
    }
    public void kupalma(View view){
        if (sayi1.getText().toString().matches("")||sayi2.getText().toString().matches("")){
            sonuc.setText("result"+"   "+"napıyorsun kardeşim");
        }
        else {
            int number1 = Integer.parseInt(x.getText().toString());
            //int number2=Integer.parseInt(sayi2.getText().toString());
            int sonuc1 = number1 * number1 * number1;
            sonuc.setText("sonuc:" + "" + sonuc1);
        }
    }
    public void karekok(View view){
        if (sayi1.getText().toString().matches("")||sayi2.getText().toString().matches("")){
            sonuc.setText("result"+"   "+"napıyorsun kardeşim");
        }
        else
        {
            int number1 = Integer.parseInt(x.getText().toString());
            //int number2=Integer.parseInt(sayi2.getText().toString());
            double sonuc1 = Math.sqrt(number1);
            sonuc.setText("sonuc:" + "" + sonuc1);
        }
    }
    public void bolux(View view){
        if (sayi1.getText().toString().matches("")||sayi2.getText().toString().matches("")){
        sonuc.setText("result"+"   "+"napıyorsun kardeşim");
    }
        else{
        int number1=Integer.parseInt(x.getText().toString());
        double sonuc1=1/number1;
        sonuc.setText("sonuc:"+""+sonuc1);}
    }
    public void xuzeriy(View view){
        if (sayi1.getText().toString().matches("")||sayi2.getText().toString().matches("")){
            sonuc.setText("result"+"   "+"napıyorsun kardeşim");
        }
        else {
            int number1 = Integer.parseInt(x.getText().toString());
            int number2 = Integer.parseInt(y.getText().toString());
            double sonuc1 = Math.pow(number1, number2);
            sonuc.setText("sonuc:" + "" + sonuc1);
        }
    }

}
