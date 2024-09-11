package com.example.cryptocurrency.data.repository

import com.example.cryptocurrency.data.remote.CoinApi
import com.example.cryptocurrency.data.remote.dto.CoinDetailDto
import com.example.cryptocurrency.data.remote.dto.CoinDto
import com.example.cryptocurrency.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> =
        api.getCoins()


    override suspend fun getCoinById(coinId: String): CoinDetailDto =
        api.getCoinById(coinId)

}