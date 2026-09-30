# AutomatedCalling

An Android Jetpack Compose application built with MVVM and Clean Architecture principles. 
This project setup was inspired by the structural layout of the `EcellKMP` project.

## Tech Stack
* **UI**: Jetpack Compose (Material 3 + Expressive)
* **Architecture**: MVVM + Clean Architecture
* **Dependency Injection**: Koin
* **Networking**: Ktor (with OkHttp engine)
* **Image Loading**: Coil
* **Navigation**: Navigation 3 (`androidx.navigation3`)
* **Serialization**: Kotlinx Serialization

## Project Structure
The project is divided into the following layers:
- `app`: Application class, theming, and top-level configurations.
- `di`: Koin modules for dependency injection.
- `data`: Repositories, local storage, network clients, and data models.
- `domain`: Use cases, repository interfaces, and business models.
- `presentation`: UI components broken down by feature, including ViewModels and Compose screens.
- `utility`: Helper functions, extensions, and constants.

## Setup
1. Clone the repository.
2. Open in Android Studio.
3. Sync Gradle dependencies.
4. Run the `app` configuration on an emulator or physical device.
