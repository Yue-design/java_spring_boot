package com.techtalk.conferencedemo.repositories;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
