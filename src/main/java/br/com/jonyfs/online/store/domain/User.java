/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jonyfs.online.store.domain;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.jpa.domain.AbstractAuditable;

/**
 *
 * @author jony
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends AbstractAuditable<User, Long> {

    private static final long serialVersionUID = 3734142812356869370L;

    @NotEmpty
    @Email
    @Size(max = 200)
    private String email;

    @NotEmpty
    @Size(max = 200)
    private String password;

}
