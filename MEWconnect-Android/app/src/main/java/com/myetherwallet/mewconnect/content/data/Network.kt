package com.myetherwallet.mewconnect.content.data

import android.content.Context
import com.myetherwallet.mewconnect.R

/**
 * Created by BArtWell on 04.09.2018.
 */
enum class Network(val fullName: Int, val shortName: Int, val currency: Int, val apiMethod: String, val path: String, val chainId: Byte) {

    MAIN(R.string.wallet_network_main_full, R.string.wallet_network_main_short, R.string.wallet_network_main_currency, "eth", "m/44'/60'/0'/0", 1),
    RINKEBY(R.string.wallet_network_rinkeby_full, R.string.wallet_network_rinkeby_short, R.string.wallet_network_rinkeby_currency, "rin", "m/44'/1'/0'/0", 4);

    companion object {

        fun getTitles(context: Context): Array<String> {
            val titles = mutableListOf<String>()
            for (value in values()) {
                titles.add(context.getString(value.fullName))
            }
            return titles.toTypedArray()
        }
    }

    fun getCurrency(context: Context): String = context.getString(currency)
}
