/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jonyfs.online.store.security;

import br.com.jonyfs.online.store.domain.User;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author jony
 */
public class OnlineStoreUserDetails implements UserDetails {

    private static final long serialVersionUID = 1L;

    private final User user;

    private List<SimpleGrantedAuthority> auhorities = new LinkedList<>();

    public OnlineStoreUserDetails(User user) {
        super();
        this.user = user;
        /*
        if (usuario.getModulos() != null) {

            for (Modulo modulo : usuario.getModulos()) {
                // TODO RESOLVER AS ROLES POR MODULO

            for (Role role : user.getRoles()) {
                auhorities.add(new SimpleGrantedAuthority(role.getAuthority()));
            }

            }

        }
         */
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return auhorities;
    }

    @Override
    public String getPassword() {
        return getUser().getPassword();
    }

    @Override
    public String getUsername() {
        return getUser().getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public User getUser() {
        return user;
    }
}
