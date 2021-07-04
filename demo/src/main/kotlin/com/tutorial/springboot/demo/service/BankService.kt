package com.tutorial.springboot.demo.service

import com.tutorial.springboot.demo.datasource.BankDataSource
import com.tutorial.springboot.demo.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

}