# Dittobnb

Dittbnb is a small Android app designed to serve as an example of how Ditto's exported .xml files can be integrated into an android app. While Ditto supports many different ways to use variants, this project demonstrates how to use variants to aide in localizing a mobile application.

![Screen Shot 2022-06-24 at 2 35 44 PM](https://user-images.githubusercontent.com/19922122/175696064-a6d5fed4-7bb5-41bf-9c16-18247927a1d9.png)

### 🛠 Initial setup

This project was tested using Android Studio Chipmunk | 2021.2.1 Patch 1.

1. Clone the repository
2. Open the Dittobnb project in Android Studio.
3. Click the `Sync files with Gradle` button.
4. Select the app configuration and press the Run button to boot Dittobnb onto your emulator!

The project is setup to use the primary language of the device the app is run on. To force a specific language on an android emulator or device, do the following steps:

1. Open Settings app on your device.
2. Tap System -> Languages & Input -> Languages -> + Add a language.
3. Select Spanish and make sure it's set to priorty 1 on the list.
4. Open the Dittobnb app, and you should now see the app using the spanish variant text!

### 🗂 Populating your component library

1. Sign in to your Ditto account
2. Navigate to [your component library](https://app.dittowords.com/components/all)
3. Enable [Developer Mode](https://www.dittowords.com/docs/ditto-developer-mode) for your component library if it isn't enabled already
4. In the top-right corner, click **New Component** -> **Import from JSON**
5. Upload [ditto-component-library\_\_base.json](ditto/ditto-component-library__base.json) and follow the prompts to finalize the import
6. Repeat the import process with [ditto-component-library\_\_spanish.json](ditto/ditto-component-library__spanish.json); **when prompted for a variant name, make sure to name your variant "Spanish"**

### 🖋 Making an example edit

1. Sign in to your Ditto account
2. Navigate to your [component library](https://app.dittowords.com/components/all)
3. In the search input near the top of the screen, search for the text "Travel the world with your family"
4. Select the component and, using the detail panel on the right side of the screen, change the text to "Go anywhere" and click **Save Edits**.
5. Select the export project button near the top right of the screen.
6. In the modal that shows up, select **Android (.xml)** under the File format drop down.
7. By default the base variant will be selected. Click the export button at the bottom and you should have a `base.xml` file downloaded.
8. Move that file into the `app/src/main/res/values` folder and make sure to name it `strings.xml`.
9. Repeat steps 5-8 but select `Spanish` in the variant drop down and place the file at `app/src/main/res/values-es/strings.xml`.

Rebuild the project, and you should see the app reflect the change made in Ditto!

### 🖼 Syncing edits from designs (optional)

To sync edits from design all the way to development, you can integrate your Ditto components with a design file. That way, you can also test out sample edits directly from your design file!

1. Duplicate our corresponding [Dittobnb Figma file](https://www.figma.com/community/file/956627227087012313)
2. Import the file as a new Ditto project via our [Figma plugin](https://www.figma.com/community/plugin/798826066406007173/%E2%9C%8D%EF%B8%8F-Ditto-%7C-collaborate-on-copy).
3. Connect your component library to your Ditto project. You can do this quickly via our [Component Suggestions](https://www.dittowords.com/blog/introducing-component-suggestions)!
4. Make an edit to text via our Figma plugin.
5. Follow steps 5-9 under [Making an Example Edit](https://github.com/dittowords/ditto-android-demo#-making-an-example-edit) and you should see the edits made in Ditto!

## Expanding

Is there another library/framework that you think we should create a demo for? Let us know by [opening an issue](https://github.com/dittowords/ditto-android-demo/issues/new), or feel free to open a pull request!
