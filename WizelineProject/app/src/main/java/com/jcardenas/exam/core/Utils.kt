package com.jcardenas.exam.core

import com.jcardenas.exam.R
import java.text.DecimalFormat

fun Double.formatToMoney(): String = DecimalFormat("#,###.00").format(this)

fun getImageResource(name: String): Int {
    return when (name) {
        "btc_mxn" -> {
            R.drawable.btc
        }
        "eth_mxn" -> {
            R.drawable.eth
        }
        "xrp_mxn" -> {
            R.drawable.xrp
        }
        "ltc_mxn" -> {
            R.drawable.ltc
        }
        "bch_mxn" -> {
            R.drawable.bch
        }
        "tusd_mxn" -> {
            R.drawable.tusd
        }
        "mana_mxn" -> {
            R.drawable.mana
        }
        "bat_mxn" -> {
            R.drawable.bat
        }
        "dai_mxn" -> {
            R.drawable.dai
        }
        "usd_mxn" -> {
            R.drawable.usd
        }
        else -> {
            R.drawable.generic
        }
    }
}