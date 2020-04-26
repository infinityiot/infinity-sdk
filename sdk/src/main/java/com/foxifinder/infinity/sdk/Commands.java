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

    /**
     * Set clock style on the lock screen
     * @param value {@code 0} to analog, {@code 1} to digital
     * @param cb {@link InfinitySDK.CommandCallback} object with the result of the operation:
     *                                              succeed or not
     */
    public void setClockStyle(int value, InfinitySDK.CommandCallback cb) {
        sdk.runCommand("setClockStyle", String.valueOf(value), cb, false);
    }

    /**
     * Reboot the device
     * @param cb {@link InfinitySDK.CommandCallback} object with the result of the operation:
     *                                              succeed or not
     */
    public void reboot(InfinitySDK.CommandCallback cb) {
        sdk.runCommand("reboot", null, cb, false);
    }

    /**
     * Turn off the device.
     * @param cb {@link InfinitySDK.CommandCallback} object with the result of the operation:
     *                                              succeed or not
     */
    public void shutdown(InfinitySDK.CommandCallback cb) {
        sdk.runCommand("shutdown", null, cb, false);
    }
}
