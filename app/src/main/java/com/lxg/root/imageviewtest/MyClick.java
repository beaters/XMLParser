package com.lxg.root.imageviewtest;

import android.content.Intent;
import android.view.View;

/**
 * Created by root on 15-10-30.
 */
public class MyClick implements View.OnClickListener{
    private SecondActivity sa;
    public MyClick(SecondActivity secondActivity)
    {
        this.sa=secondActivity;
    }
    @Override
    public void onClick(View v)
    {
        Intent intent2=new Intent(sa,MainActivity.class);
        sa.startActivity(intent2);
        sa.finish();
        sa.overridePendingTransition(R.anim.in,R.anim.out);
    }
}
