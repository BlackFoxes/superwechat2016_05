package cn.ucai.superwechat.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.baidu.platform.comapi.map.I;

import java.util.ArrayList;

import cn.ucai.superwechat.R;
import cn.ucai.superwechat.ui.GuideActivity;
import cn.ucai.superwechat.ui.LoginActivity;
import cn.ucai.superwechat.ui.RegisterActivity;


/**
 * Created by clawpo on 2016/12/27.
 */

public class MFGT {
    public static void finish(Activity activity){
        activity.finish();
        activity.overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
    }
    public static void startActivity(Activity activity, Intent intent){
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }
    public static void startActivity(Context context,Class<?> cls){
        Intent intent = new Intent(context,cls);
        startActivity(context,intent);
    }

    public static void startActivity(Context context,Intent intent){
        context.startActivity(intent);
        ((Activity)context).overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }
    public static void gotoLogin(Activity activity) {
        startActivity(activity, LoginActivity.class);

    }

    public static void gotoRegister(Activity activity) {
        startActivity(activity, RegisterActivity.class);
    }

    public static void gotoGuide(Activity activity) {
        startActivity(activity, GuideActivity.class);

    }

}
