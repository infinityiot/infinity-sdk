# Infinity SDK
========

For Infinity IoT devices you can write your own Android code using this Infinity SDK and install it into your devices. 

For more information please see [the website][site].


Download
--------

Download [the latest library][link]

or using Gradle:
1. add the repository:
```GDL
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
``` 
2. add the dependency:
```
    dependencies {
	    implementation 'com.github.infinityiot:infinity-sdk:1.0.0-alpha.3'
	}
```

Minimum Android SDK 19+.

The simplest example of using the Infinity SDK
--------
1. Initializate the SDK
```java
public class MainActivity extends Activity {

    InfinitySDK sdk = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ...
        sdk = new InfinitySDK(this, null);
    }
```
2. Run a command
```java
    public void onButtonClick(View view) {
        sdk.commands.setAirplaneModeEnabled(false, null);
    }
```
Commands
-------
* `setAirplaneModeEnabled`: Turn Airplane mode on or off.  
     * param: value - `true` to on, `false` to off
     * param: cb - `null` or `InfinitySDK.CommandCallback` object with the result of the operation: succeed or not
* `setClockStyle`: Set clock style on the lock screen.  
     * param: value - `0` to analog, `1` to digital
     * param: cb - `null` or `InfinitySDK.CommandCallback` object with the result of the operation: succeed or not
* `reboot`: Reboot the device.  
     * param: cb - `null` or `InfinitySDK.CommandCallback` object with the result of the operation: succeed or not   
* `shutdown`: Turn off the device.  
     * param: cb - `null` or `InfinitySDK.CommandCallback` object with the result of the operation: succeed or not 
     
#### Commands use the next callback inteface:

`InfinitySDK.CommandCallback`- Infinity callback interface. Used to notify the user asynchronously of the results of the   Command execution. 
* method: `void onSuccess(String descrtiption, Bundle params)` - Called when the command was completed successfully, where
	* param: descrtiption - Text description of the command result.
	* param: params - Additional information if available.
* method: `void onError(java.lang.String error, android.os.Bundle params)` - Called when the Command occurred an error, where
	* param: error - Error desciption.
	* param: params - Additional information if available.
	
License
=======

    Copyright 2020 Foxifinder, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


 [side]: https://www.infinityiot.org/
 [link]: https://notdefined.yet
