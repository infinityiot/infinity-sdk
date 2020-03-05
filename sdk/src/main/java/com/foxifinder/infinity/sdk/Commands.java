package com.foxifinder.infinity.sdk;

import android.os.Bundle;

public class Commands {
    private InfinitySDK sdk;
    Commands(InfinitySDK sdk) {
        this.sdk = sdk;
    }

    /**
     * Turn Airplane mode on or off
     * @param value {@code true} to on, {@code false} to off
     * @param cb {@link InfinitySDK.CommandCallback} object with the result of the operation:
     *                                              succeed or not
     */
    public void setAirplaneModeEnabled(boolean value, InfinitySDK.CommandCallback cb) {
        sdk.runCommand("AIRPL_MODE", (value ? "1" : "0"), cb, false);
    }

//    public void setMobileDataEnabled(boolean value, InfinitySDK.CommandCallback cb) {
//        sdk.runCommand("MOBILE_DATA", (value ? "1" : "0"), cb, false);
//    }

}
