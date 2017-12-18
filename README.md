# Using GSheet Java Api in Android Sample

##  WHAT THIS APP DOES?

 This app contains sample code on how to implement the Google SpreadSheet API and Google Sign-In(Android Client API). For the time being I have just implemented the methods to read and write(Append to be more specific) using the java client library.
 More code for achieving different features can be found in the [official documentation](https://developers.google.com/sheets/api/reference/rest/)
 
To use this code

##  Get the credentials
First go to 
[console.developers.google.com](https://console.developers.google.com)
and enable G+ api and Google SpreadSheet Api

Then get the google services JSON from [here](https://developers.google.com/mobile/add?platform=android&cntapi=signin&cnturl=https:%2F%2Fdevelopers.google.com%2Fidentity%2Fsign-in%2Fandroid%2Fsign-in%3Fconfigured%3Dtrue&cntlbl=Continue%20Adding%20Sign-In) and add it to the app folder of your android project


##  Adding the permissions 
Be sure that you have added the following permissions in the android Manifest
 
	
	<uses-permission android:name="android.permission.GET_ACCOUNTS" />
    <uses-permission android:name="android.permission.READ_PROFILE" />
    <uses-permission android:name="android.permission.READ_CONTACTS" />
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
	
	
##  Adding the dependencies
Be sure that you have added the following dependencies in the Project level gradle build file

	classpath 'com.google.gms:google-services:3.1.0'		
 
Add the following dependencies in the App level gradle build file
	
	
	Android{
	...
	configurations.all {
			resolutionStrategy.force 'com.google.code.findbugs:jsr305:1.3.9'
		}
	...
	}		
	
	
	
	
then add
	
	
	
	compile 'com.google.android.gms:play-services-auth:11.6.2'
    compile('com.google.apis:google-api-services-sheets:v4-rev493-1.23.0') {
        exclude group: 'org.apache.httpcomponents'
    }

    compile 'com.google.android.gms:play-services-auth:11.6.2'
    compile 'pub.devrel:easypermissions:0.3.0'
    compile 'com.google.oauth-client:google-oauth-client-jetty:1.23.0'
    compile('com.google.api-client:google-api-client-android:1.23.0') {
        exclude group: 'org.apache.httpcomponents'
    }
		
	
	
Below everything else add
	
	
	apply plugin: 'com.google.gms.google-services'



##  License

Licensed under [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0)

##  For more info and queries 


Most of the code is self explainatory and also comments are added to get you through the code easily 
Be sure to ping me too if there are bugs or if the code is not working as expected 


email me:  dev.theblueorb@gmail.com


My Play Store Developer page: https://play.google.com/store/apps/developer?id=THE%20BLUE-ORB&hl=en
