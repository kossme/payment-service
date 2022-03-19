package com.example.paymentservice.service;

import com.example.paymentservice.model.Invoice;
import com.example.paymentservice.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;

    public Invoice proceedPayment() {
        return null;
    }

    public Invoice requestPayment(Invoice invoice) {
        return null;
    }

    public Optional<Invoice> getOne(Long id) {
        return invoiceRepository.findById(id);
    }

    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    public Invoice saveNew(Invoice invoice) {
        Invoice invoiceFromDb = invoiceRepository.save(invoice);
        //logic of send invoice to payment
        return invoice;
    }

    public Invoice update(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    public void deleteById(Long id) {
        invoiceRepository.deleteById(id);
    }
}
