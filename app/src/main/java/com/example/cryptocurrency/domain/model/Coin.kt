package com.example.cryptocurrency.domain.model

import com.example.cryptocurrency.data.remote.dto.CoinDto


data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)

