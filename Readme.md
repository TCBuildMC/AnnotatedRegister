# Annotated Register
An annotation-powered library mod to ease the content registration. 

Especially for small mods.

Supports almost all the versions since Minecraft 1.14.

**NOTE: This mod is for Fabric!**

### Add dependency to your mod

In `build.gradle`:
```gradle
repositories {
    maven {
        url = "https://jitpack.io/"
    }
}

dependencies {
    // If you want to transitive dependency, you can use `modApi` instead of `modImplementation`
    modImplementation "com.github.TCBuildMC:AnnotatedRegister:${project.annotated_register_version}"
    
    // Suggested. Nest it into your mod, don't need to drop it in your mods folder.
    include "com.github.TCBuildMC:AnnotatedRegister:${project.annotated_register_version}"
}
```

In `gradle.properties`:
```properties
annotated_register_version=INSERT RELEASE VERSION HERE
```
