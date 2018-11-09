package org.sid.dao;

import org.sid.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
//habi
public interface ClientRepository extends JpaRepository<Client, Long> {

}
