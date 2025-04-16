package com.joaobarbosa.dev.moneasy_api.core.domain;

import com.joaobarbosa.dev.moneasy_api.core.abstractions.Auditable;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_usuario")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class User extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "sobrenome")
    private String lastName;
    private String email;
    @Column(name = "senha_criptografada")
    private String hashedPassword;
}
