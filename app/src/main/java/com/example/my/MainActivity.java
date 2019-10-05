package com.example.my;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int amount = 1;
    int basePrice=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMinus = findViewById(R.id.btn_minus);
        Button btnPlus = findViewById(R.id.btn_plus);
        final TextView tvAmount = findViewById(R.id.tv_amount);
        final CheckBox cbCream = findViewById(R.id.checkbox_cream);
        final CheckBox cbChoco = findViewById(R.id.checkbox_chocochip);
        final CheckBox cbVan = findViewById(R.id.checkbox_vanilla);
        Button btnOrder = findViewById(R.id.btn_order);
        final TextView tvTq=findViewById(R.id.tv_tq);

        btnMinus.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if (amount > 1) {
                    amount--;
                    tvAmount.setText(Integer.toString(amount));


                }

            }

        });

        btnPlus.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                amount++;
                tvAmount.setText(Integer.toString(amount));


            }
            });
        btnOrder.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View V){
                int finalPrice=basePrice;

                if(cbCream.isChecked()){

                    finalPrice+=1;
                }

                if(cbChoco.isChecked()){

                    finalPrice+=2;
                }

                if(cbVan.isChecked()){

                    finalPrice+=3;
                }


                finalPrice *=amount;


                Log.d("Final Price",Integer.toString(finalPrice));

                tvTq.setText("Thank you for your order. \n The total price is "+Integer.toString(finalPrice));

            }


        });



    }
}
