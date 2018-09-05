package optick.elisoft.com.newconoptik.data.preferences

import optick.elisoft.com.newconoptik.util.AppConstants

interface PreferenceHelper {
    fun getCurrentUserName(): String

    fun setCurrentUserName(userName: String?)

    fun getCurrentUserEmail(): String?

    fun setCurrentUserEmail(email: String?)

    fun getAccessToken(): String?

    fun setAccessToken(accessToken: String?)

    fun getCurrentUserId(): Long?
}