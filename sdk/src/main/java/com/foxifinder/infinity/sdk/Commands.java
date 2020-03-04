package com.foxifinder.infinity.sdk;

import android.os.Bundle;

public class Commands {
    private InfinitySDK sdk;
    Commands(InfinitySDK sdk) {
        this.sdk = sdk;
    }

    /**
     * setAirplaneModeEnabled - turn Airplane mode on or off
     * @param value, true to on, false to off
     * @param cb, callback function with result of operation: succes or not
     */
    public void setAirplaneModeEnabled(boolean value, InfinitySDK.CommandCallback cb) {
        sdk.runCommand("AIRPL_MODE", (value ? "1" : "0"), cb, false);
    }

    public void setMobileDataEnabled(boolean value, InfinitySDK.CommandCallback cb) {
        sdk.runCommand("MOBILE_DATA", (value ? "1" : "0"), cb, false);
    }

}
