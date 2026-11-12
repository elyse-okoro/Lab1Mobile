package com.example.lab1mobile

import android.content.Intent
import androidx.core.net.toUri

/**
 * Неявные интенты для контактов на визитке.
 */
object ContactIntents {

    private const val WEB_SCHEME = "https://"

    /** Открывает страницу в браузере или в приложении сайта; адрес на визитке записан без схемы. */
    fun web(address: String): Intent =
        Intent(Intent.ACTION_VIEW, (WEB_SCHEME + address.removePrefix(WEB_SCHEME)).toUri())
}
