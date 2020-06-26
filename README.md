# Singleton Android

- [SingletonSession.kt](https://github.com/thiminhnhut/SingletonExample/blob/master/app/src/main/java/io/github/thiminhnhut/singleton/SingletonSession.kt)

```kotlin
class SingletonSession private constructor() {

    private object Holder {
        val instance = SingletonSession()
    }

    companion object {
        val instance: SingletonSession by lazy { Holder.instance }
    }
}
```
