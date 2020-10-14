package com.flowyk.grwn;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Index;

public class User {

    @Column(unique = true)
    String email;

    @Id
    String username;
}
