package com.tutorial.springboot.demo.datasource.mock

import com.tutorial.springboot.demo.datasource.BankDataSource
import com.tutorial.springboot.demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 0),
        Bank("5678", 3.14, 100)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}