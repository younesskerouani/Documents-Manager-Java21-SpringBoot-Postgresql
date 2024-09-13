package com.doc.docmanager.entity;

import com.doc.docmanager.enumeration.Authority;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@JsonInclude(NON_DEFAULT)
public class RoleEntity extends Auditable{
  private String name;
  private Authority authorities;
}
