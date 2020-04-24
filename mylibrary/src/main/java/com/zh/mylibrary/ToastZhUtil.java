package com.zh.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by hongzhang on 2020/4/24.
 */
public class ToastZhUtil {
    public ToastZhUtil(){

    }

    public void showMsg(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
}
