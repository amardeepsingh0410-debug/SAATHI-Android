SAATHI Android APK project

This is an Android WebView wrapper project around the supplied SAATHI web app.
To build APK through GitHub Actions:
1. Create a GitHub repository and upload all project files to the main branch.
2. Open Actions tab, select Build SAATHI APK, and click Run workflow.
3. After completion, download the SAATHI-APK artifact. Inside is app-debug.apk.
4. Transfer APK to Android phone, allow installation from unknown sources if asked, and install.

For local build, use Android Studio with Android SDK 35 and JDK 17, then run Gradle assembleDebug.
The app data is local to the device WebView. No cloud sync has been added.
