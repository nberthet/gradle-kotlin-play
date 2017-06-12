A multi-project template using Gradle, Kotlin and Play
====================================================

Minimal structure containing a play application ("application") and a kotlin
dependency ("library"). The projects are built with Gradle and uses the "play" plugin
for its support for things like routes compilation.

Simply run the project using Gradle `--continuous` mode, to have it reload
code on change.

```
./gradlew --continuous runPlayBinary
```

Then open this address with your browser
```
http://localhost:9000/?name=test
```