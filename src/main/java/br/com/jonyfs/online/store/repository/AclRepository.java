/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jonyfs.online.store.repository;

import java.io.Serializable;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 *
 * @author jony
 */
@NoRepositoryBean
public interface AclRepository<T extends Object, ID extends Serializable> extends Repository<T, ID> {

    @PreAuthorize("hasPermission(#s, 'CREATE') or hasPermission(#s, 'UPDATE') or hasPermission(#s,'ADMINISTRATION') or hasRole('ADMIN')")
    public <S extends T> S save(S s);

    public <S extends T> Iterable<S> save(Iterable<S> itrbl);

    public T findOne(ID id);

    public boolean exists(ID id);

    public Iterable<T> findAll();

    public Iterable<T> findAll(Iterable<ID> itrbl);

    public long count();

    public void delete(ID id);

    public void delete(T t);

    public void delete(Iterable<? extends T> itrbl);

    public void deleteAll();
}