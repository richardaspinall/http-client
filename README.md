# http-client
> Feb 2021

## Description
A hands-on labs to show the power of creating a Native app across multiple platforms with Kotlin. 

## Results
I think there are some assumptions that you are coming from Java when doing these labs. It's mostly about configuring the build of the application 
but the instructions seem a bit outdated (the config files for Gradle that are created through IntelliJ end up being quite different). I was hoping this lab would take 20 minutes and I would just quickly see the power of using Kotlin to build a native app, however it took several hours to work out some of these issues. Cloning from the repository also didn't work. Going through struggles like this is good for learning though, but it's also good to know when to learn to stop going down a rabbit hole. 

I sent some feedback mentioning that the documentation might be outdated for newbs which will hopefully help stop someone from running into the same troubles I had: https://github.com/kotlin-hands-on/intro-kotlin-native/issues/2

## Steps
The steps I took in this learning journey was to just follow the lab steps but the below are the extras:

* The instructions are using Groovy syntax instead of Kotlin for the config. As I'm a beginner in Kotlin (and my Java experience was 10 years ago) it took me ages to pick up on this because I had created the project in Kotlin syntax for gradle initially. I did eventually realize in IntelliJ that you can choose Gradle with Kotlin or Groovy when creating the project – I think this was a recent additon to IntelliJ. 

* I also accidentally got it working by commenting out an import statement for Curl while I was debugging which really looked like it was needed 
for it to work. I stopped here though cos I was just happy to have it working.


### Skills learned
* Familarity with IntelliJ
* Familarity with Gradle
* There wasn't any learning of Kotlin but I wasn't expecting that.

## Takeaways
* If I focus on learning the Kotlin and know that things will come with time, all of the above struggles will be minimized (there will always be some)

## Resources
* https://play.kotlinlang.org/hands-on/Introduction%20to%20Kotlin%20Native/01_Introduction
