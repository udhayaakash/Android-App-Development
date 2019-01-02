package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    int noc=0;
    int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        dis(a*5);
    }

    public void inc(View view) {
        //int a=3;
        a++;
        display(a);
    }

    public void dec(View view) {
        //int a=1;
        a--;
        display(a);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);


        quantityTextView.setText("" + number);

    }

    private void dis(int number)
    {
        TextView q = (TextView) findViewById( R.id.price);
        q.setText("" + number);
    }
}