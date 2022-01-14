package com.debug.lib;

import android.os.Build;
import android.text.TextUtils;

public class DebugLib {
    public static String BORDER = "HONOR/BKL-AL00/HWBKL:10/HUAWEIBKL-AL00/10.0.0.179C00:user/release-keys";
    public static boolean debug;

    public static void init(boolean isDebug) {
        DebugLib.debug = isDebug;
    }

    public static void setBorder(String border) {
        DebugLib.BORDER = border;
    }

    public boolean isDebug() {
        return TextUtils.equals(BORDER, Build.FINGERPRINT) && debug;
    }
}
