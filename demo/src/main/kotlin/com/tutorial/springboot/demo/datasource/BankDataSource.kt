package com.tutorial.springboot.demo.datasource

import com.tutorial.springboot.demo.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}