# Spotify-Clone-App
Spotify Clone application developed using JAVA and includes XML FrontEnd (under Development) 👨‍💻☕

- [Installation Guide](#installation)
- [App Config](#app-configuration)
- [App Screenshots](#app-screenshots)

### Installation
Clone the repo, and start running the project
```
git clone https://github.com/TharunBalaji2004/Spotify-Clone-App.git
```

### App Configuration
```gradle
android {
    compileSdk 33

    defaultConfig {
        minSdk 24
        targetSdk 33
        versionCode 3
        versionName '3.3'
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
}
```

### App Screenshots

| Splash Screen | Home Screen | Search Screen |
| :---: | :---: | :---: |
| <img src="https://user-images.githubusercontent.com/95350584/233107537-20c5deb6-0654-476a-89d3-f1d30f830edc.jpeg" width="200" height="450"> | <img src="https://user-images.githubusercontent.com/95350584/233107563-ba8e2f0c-7fee-4514-b622-d3181f5bcd87.jpeg" width="200" height="450"> | <img src="https://user-images.githubusercontent.com/95350584/233107565-ddf84bd2-0f11-4522-a962-b13f98994a7a.jpeg" width="200" height="450"> | 


| Library Screen | Settings Screen | Premium Screen |
| :---: | :---: | :---: |
| <img src="https://user-images.githubusercontent.com/95350584/233107569-e2cbbb74-75a9-4cf1-af56-2011aef49e79.jpeg" width="200" height="450"> | <img src="https://user-images.githubusercontent.com/95350584/233107575-a1e83973-740d-4218-83a2-49df3e7dafce.jpeg" width="200" height="450"> | <img src="https://user-images.githubusercontent.com/95350584/233107583-7e6d53e6-6864-494d-8228-f97f6fc0d1aa.jpeg" width="200" height="450"> |
