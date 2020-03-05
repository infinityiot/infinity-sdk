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
1. add the dependency:
```
    dependencies {
	    com.github.infinityiot:infinity-sdk:1.0.0-alpha.1'
	}
```

Minimum Ansroid SDK 19+.

Example of using the Infinity SDK
--------
1. Initializate the SDK
```java
public class MainActivity extends Activity {

    InfinitySDK sdk = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ...
        sdk = new InfinitySDK(this, <init callback if needed or null>);
    }
```
1. Run a command
```java
    public void onButtonClick(View view) {
        sdk.commands.setAirplaneModeEnabled(false, <command callback if needed or null>);
    }
```
Commands
--------
* `setAirplaneModeEnabled`: Turn Airplane mode on or off.  
     * param value `true` to on, `false` to off
     * param cb `InfinitySDK.CommandCallback` object with the result of the operation: succeed or not

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
