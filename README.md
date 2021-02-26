# http-client
> Feb 2021

## Description
A hands-on labs to show the power of creating a Native app across multiple platforms with Kotlin. 

## Results
* I was hoping this lab would take 20 minutes and I would just quickly see the power of using Kotlin to build a native app, however it took several hours.
* I think there are some assumptions (not clear) that you are coming from Java when doing these labs. It's mostly about configuring the build of the application 
but the instructions seem a bit outdated (the config files for Gradle that are created through IntelliJ end up being quite different), it took some time to 
work out what the issues were. One big one was eventually realizing that the instructions were using Groovy syntax instead of Kotlin for the config. 
As I am a beginner in Kotlin (and my Java experience was 10 years ago) it took me ages to pick up on this. I did eventually realize in IntelliJ that 
you can choose Gradle with Kotlin or Groovy when creating the project – I think this was a recent additon to IntelliJ. Finally, I accidentally got it working by commenting out an import statement for Curl that really looks like it should be needed 
to work. As soon as I did this it started working correctly :/
* Cloning, building and running also didn't work. 

### Skills learned
* Familarity with IntelliJ
* Familarity with Gradle
* There wasn't any learning of Kotlin but I wasn't expecting that.

## Resources
* https://play.kotlinlang.org/hands-on/Introduction%20to%20Kotlin%20Native/01_Introduction
