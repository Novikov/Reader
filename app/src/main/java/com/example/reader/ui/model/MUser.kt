package com.example.reader.ui.model

data class MUser(
    val id: String?,
    val userId: String,
    val displayName: String,
    val avatarUrl: String,
    val quote: String,
    val profession: String
) {

    fun toMap(): MutableMap<String, Any> {
        return mutableMapOf(
            "user_id" to this.userId,
            "display_name" to this.displayName,
            "avatarUrl" to this.avatarUrl,
            "profession" to this.profession,
            "quote" to this.quote
        )
    }
}