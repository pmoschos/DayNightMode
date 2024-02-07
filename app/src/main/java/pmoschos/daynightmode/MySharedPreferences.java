package pmoschos.daynightmode;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreferences {

    private static final String DAY_NIGHT_APP = "dayNightApp";
    private static final String NIGHT_MODE = "nightMode";

    public static void setMode(Context context, boolean value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(DAY_NIGHT_APP, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(NIGHT_MODE, value);
        editor.apply();
    }

    public static boolean getMode(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(DAY_NIGHT_APP, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(NIGHT_MODE, false);
    }
}
