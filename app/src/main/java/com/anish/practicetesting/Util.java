package com.anish.practicetesting;

import android.content.Context;
import android.content.Intent;

public class Util {
    public static Intent getIntent(Context context,String name,String address){
        Intent i = new Intent(context,MainActivity.class);
        i.putExtra("NAME",name);
        i.putExtra("ADDRESS",address);

        return i;
    }
}
