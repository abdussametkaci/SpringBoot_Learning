package com.tutorial.springboot.demo.datasource.network.dto

import com.tutorial.springboot.demo.model.Bank

data class BankList(
    val results: Collection<Bank>
)
