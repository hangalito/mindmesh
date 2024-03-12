@file:Suppress("MemberVisibilityCanBePrivate")

package com.mindmesh.model


/**
 * Represents a user in the app.
 *
 * @author Bartolomeu Hangalo
 */
data class User(
    val uid: String,
    val email: String,
    val displayName: String,
) {
    /**
     * The user first name
     */
    var firstName: String? = null
        private set

    /**
     * The user last name
     */
    var lastName: String? = null
        private set

    /**
     * The user picture uri
     */
    var imageUri: String? = null


    fun register(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
    }

    fun setProfilePicture(imageUri: String) {
        // TODO: write code to save it in Firebase instance
        this.imageUri = imageUri
    }
}
