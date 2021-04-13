package cn.eas.usdk.demo.view;

import android.os.Bundle;
import android.view.View;

import com.usdk.apiservice.aidl.led.Light;
import com.usdk.apiservice.aidl.led.ULed;

import cn.eas.usdk.demo.R;
import cn.eas.usdk.demo.constant.DemoConfig;
import cn.eas.usdk.demo.DeviceHelper;

public class LedActivity extends BaseDeviceActivity {

    private ULed led;

    @Override
    protected void onCreateView(Bundle savedInstanceState) {
        initDeviceInstance();
        setContentView(R.layout.activity_led);
        setTitle("Led Module");
    }

    protected void initDeviceInstance() {
        led = DeviceHelper.me().getLed(DemoConfig.RF_DEVICE_NAME);
    }

    public void turnOnBlue(View v) {
        try {
            led.turnOn(Light.BLUE);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void turnOffBlue(View v) {
        try {
            led.turnOff(Light.BLUE);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void turnOnYellow(View v) {
        try {
            led.turnOn(Light.YELLOW);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void turnOffYellow(View v) {
        try {
            led.turnOff(Light.YELLOW);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void turnOnGreen(View v) {
        try {
            led.turnOn(Light.GREEN);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void turnOffGreen(View v) {
        try {
            led.turnOff(Light.GREEN);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void turnOnRed(View v) {
        try {
            led.turnOn(Light.RED);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void turnOffRed(View v) {
        try {
            led.turnOff(Light.RED);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void turnOnAllLed(View v) {
        try {
            led.turnOn(Light.BLUE);
            led.turnOn(Light.YELLOW);
             led.turnOn(Light.GREEN);
             led.turnOn(Light.RED);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void turnOffAllLed(View v) {
        try {
             led.turnOff(Light.BLUE);
             led.turnOff(Light.YELLOW);
             led.turnOff(Light.GREEN);
             led.turnOff(Light.RED);
        } catch (Exception e) {
            handleException(e);
        }
    }
}
