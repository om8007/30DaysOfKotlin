package com.om8007.a30daysofkotlin

data class OtherResModel(var title: String, var tag: String, var url: String)

object OtherSupplier{
    val codelabs = listOf<OtherResModel>(
        OtherResModel("Kotlin Bbootcamp For Programmers", "Udacity", "https://www.udacity.com/course/kotlin-bootcamp-for-programmers--ud9011"),
        OtherResModel("Developing Android Apps with Kotlin", "Udacity", "https://www.udacity.com/course/developing-android-apps-with-kotlin--ud9012"),
        OtherResModel("Kotlin Course - Tutorial for Beginners", "FreeCodecamp - Youtube", "https://www.youtube.com/watch?v=F9UC9DY-vIU"),
        OtherResModel("Android Development Course - Build native apps with kotlin tutorial", "FreeCodecamp - Youtube", "https://www.youtube.com/watch?v=Iz08OTTjR04")
    )
}