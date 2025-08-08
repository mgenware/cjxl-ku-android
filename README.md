# cjxl-ku-android

cjxl (libjxl encoder) on Android.

- libjxl 0.11.1
- Min SDK: 26
- ABIs: arm64-v8a, x86_64

| iOS / macOS                                                  | Android                                                        |
| ------------------------------------------------------------ | -------------------------------------------------------------- |
| [cjxl-ku-darwin](https://github.com/mgenware/cjxl-ku-darwin) | [cjxl-ku-android](https://github.com/mgenware/cjxl-ku-android) |

## Installation

```kotlin
repositories {
  google()
  mavenCentral()
}

dependencies {
  implementation("com.mgenware.cjxlku:cjxlku:0.11.1")
}
```

## Usage

```kotlin
val cjxlKu = CjxlKu();
// args: cjxl arguments.
val args = arrayOf<String>(
    inputFile,
    outFile
)
val retCode = cjxlKu.run(args)
```
