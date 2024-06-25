package org.m2i.contatct_backend_app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Contact {
    @Id
    @GeneratedValue
    private Integer contactId;
    private String contactName;
    private String contactEmail;
    private Long contactNum;
}
