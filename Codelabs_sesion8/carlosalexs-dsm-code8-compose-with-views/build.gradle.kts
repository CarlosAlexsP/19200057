
buildscript {
    extra.apply {
        set("lifecycle_version", "2.6.1")
        set("room_version", "2.5.2")
    }
}
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("com.android.library") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}
