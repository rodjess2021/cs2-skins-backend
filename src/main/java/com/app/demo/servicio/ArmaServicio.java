package com.app.demo.servicio;

import com.app.demo.modelo.Arma;
import com.app.demo.repositorio.ArmaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ArmaServicio implements ArmaRepositorio{

    @Autowired
    private ArmaRepositorio armaRepositorio;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Arma> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Arma> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Arma> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Arma getOne(Long aLong) {
        return null;
    }

    @Override
    public Arma getById(Long aLong) {
        return null;
    }

    @Override
    public Arma getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Arma> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Arma> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Arma> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Arma> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Arma> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Arma> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Arma, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Arma> S save(S entity) {
        return armaRepositorio.save(entity);
    }

    @Override
    public <S extends Arma> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Arma> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Arma> findAll() {
        return armaRepositorio.findAll();
    }

    @Override
    public List<Arma> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        armaRepositorio.deleteById(id);
    }

    @Override
    public void delete(Arma entity) {
        armaRepositorio.delete(entity);

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Arma> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Arma> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Arma> findAll(Pageable pageable) {
        return null;
    }
}
