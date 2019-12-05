
package com.chuangjiangx.printer;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.Map;

import javax.annotation.Nullable;

public class RNPrinterModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNPrinterModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNPrinter";
    }


    @Nullable
    @Override
    public Map<String, Object> getConstants() {
        return super.getConstants();
    }

    @ReactMethod
    public void init() {
        Log.i("test", "init");
    }
}