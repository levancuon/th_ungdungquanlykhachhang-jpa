package org.example.th_ungdungquanlykhachhang_jpa.service;

import org.example.th_ungdungquanlykhachhang_jpa.model.Customer;

import java.util.List;

public interface IGenerateService<T> {
    List<T> findAll();

    void save(T t);

    T findById(Long id);

    void remove(Long id);
}