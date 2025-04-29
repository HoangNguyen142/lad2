package com.example.firebaseproject

import com.google.firebase.firestore.Exclude

data class Course(
    @Exclude var courseID: String? = "",
    var courseName: String? = "",
    var courseDuration: String? = "",
    var courseDescription: String? = ""
)
