package com.app.demo.servicio;

import com.app.demo.modelo.Skin;
import com.app.demo.repositorio.SkinRepositorio;
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
public class SkinServicio implements SkinRepositorio{

    @Autowired
    private SkinRepositorio skinRepositorio;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Skin> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Skin> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Skin> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Skin getOne(Long aLong) {
        return null;
    }

    @Override
    public Skin getById(Long aLong) {
        return null;
    }

    @Override
    public Skin getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Skin> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Skin> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Skin> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Skin> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Skin> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Skin> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Skin, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Skin> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Skin> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Skin> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Skin> findAll() {
        return skinRepositorio.findAll();
    }

    @Override
    public List<Skin> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Skin entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Skin> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Skin> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Skin> findAll(Pageable pageable) {
        return null;
    }
}
