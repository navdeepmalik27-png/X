# Fluffy OxygenOS (OnePlus 13) Icon Pack

Inspired by 3D needle-felted wool / plush craft icons, designed specifically for OnePlus 13 running OxygenOS 15 (Android 15).

## Package Contents:
1. `standalone_icons_png/`: 28 individual high-resolution 192x192 PNG icons.
   - Use directly with **Icon Pack Studio**, **Nova Launcher**, **Lawnchair**, or OxygenOS custom icon picker.
2. `app/`: Complete Android Icon Pack source with:
   - `AndroidManifest.xml` (supports OxygenOS, Nova, Lawnchair, ADW)
   - `res/xml/appfilter.xml` (mapped to OnePlus 13 Dialer, Camera, Gallery, Settings, Notes, Weather, Calculator, etc.)
   - `res/xml/drawable.xml` (catalog for launcher pickers)
3. `.github/workflows/build-apk.yml`:
   - Push this repo to GitHub, and GitHub Actions will automatically compile and produce an installable `.apk`!

## How to Apply on OnePlus 13:
### Method 1: Via Icon Pack Studio (No PC required - Fastest!)
1. Install **Icon Pack Studio** (free on Google Play).
2. Create a new pack -> choose 'Import Custom Icons'.
3. Select the icons from the `standalone_icons_png/` folder.
4. Export and apply directly to your OnePlus home screen!

### Method 2: Build the APK with Android Studio (1 Click)
1. Open this project in **Android Studio**.
2. Go to **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
3. Transfer `app-debug.apk` to your OnePlus 13 and tap Install.
4. Go to **Settings > Wallpapers & style > Icons** and select **Fluffy OxygenOS**.
