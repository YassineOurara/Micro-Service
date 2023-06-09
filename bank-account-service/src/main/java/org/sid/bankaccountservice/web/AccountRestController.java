package org.sid.bankaccountservice.web;

import org.sid.bankaccountservice.entities.BankAccount;
import org.sid.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class AccountRestController {
    private BankAccountRepository BankAccountRepository;

    public AccountRestController (BankAccountRepository bankAccountRepository){
        this.BankAccountRepository=bankAccountRepository;
    }
    @GetMapping("/BankAccounts")
    public List<BankAccount> bankAccounts(){
        return BankAccountRepository.findAll();
    }
    @GetMapping("/BankAccounts/{id}")
    public BankAccount BankAccount(@PathVariable String id){
        return BankAccountRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Account %s not found",id)));
    }
    @PostMapping("/BankAccounts")
    public BankAccount save(@RequestBody BankAccount bankAccount){
        if(bankAccount.getId()==null) bankAccount.setId(UUID.randomUUID().toString());
        return BankAccountRepository.save(bankAccount);
    }

    @PutMapping("/BankAccounts/{id}")
    public BankAccount update(@PathVariable String id,@RequestBody BankAccount bankAccount){
        BankAccount account = BankAccountRepository.findById(id).orElseThrow();
        if(bankAccount.getBalance()!=null) account.setBalance(bankAccount.getBalance());
        if(bankAccount.getCreatedAT()!=null) account.setCreatedAT(new Date());
        if(bankAccount.getType()!=null) account.setType(bankAccount.getType());
        if(bankAccount.getCurrency()!=null) account.setCurrency(bankAccount.getCurrency());
        return BankAccountRepository.save(account);
    }
    @DeleteMapping("/BankAccounts/{id}")
    public void deleteAccount(@PathVariable String id){
        BankAccountRepository.deleteById(id);
    }
}