package com.om8007.a30daysofkotlin

data class GoogleResModel(var title: String, var tag: String, var url: String)

object Supplier{
    val codelabs = listOf<GoogleResModel>(
        GoogleResModel("Kotlin Programming Language", "Beginner", "https://developer.android.com/courses/kotlin-bootcamp/overview?utm_source=week1&utm_medium=email&utm_campaign=30DaysOfKotlin&utm_term=Basic"),
        GoogleResModel("Android with Kotlin", "Intermediate", "https://developer.android.com/courses/kotlin-android-fundamentals/overview?utm_source=week1&utm_medium=email&utm_campaign=30DaysOfKotlin&utm_term=Intermediate"),
        GoogleResModel("Advanced Android with Kotlin", "Advanced", "https://developer.android.com/courses/kotlin-android-advanced/overview?utm_source=week1&utm_medium=email&utm_campaign=30DaysOfKotlin&utm_term=Advanced")
    )
}