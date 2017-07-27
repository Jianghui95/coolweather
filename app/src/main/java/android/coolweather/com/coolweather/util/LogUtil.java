package android.coolweather.com.coolweather.util;

import android.util.Log;

/**
 * Created by Jiang_PC on 2017/7/27.
 * 在测试时，会打印出很多log日志，项目上线后，手动删除log较为麻烦，
 * 于是增加一个if判断，上线后将LEVEL的值设定为NOTHING即可
 */

public class LogUtil {
    public static final int VERBOSE = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
    public static final int WARN = 4;
    public static final int ERROR = 5;
    public static final int NOTHING = 6;
    public static final int LEVEL = VERBOSE;

    public static void v(String tag,String msg){
        if(LEVEL<=VERBOSE){
            Log.v(tag,msg);
        }
    }
    public static void d(String tag,String msg){
        if(LEVEL<=DEBUG){
            Log.d(tag,msg);
        }
    }
    public static void i(String tag,String msg){
        if(LEVEL<=INFO){
            Log.i(tag,msg);
        }
    }
    public static void w(String tag,String msg){
        if(LEVEL<=WARN){
            Log.w(tag,msg);
        }
    }
    public static void e(String tag,String msg){
        if(LEVEL<=ERROR){
            Log.e(tag,msg);
        }
    }
}
