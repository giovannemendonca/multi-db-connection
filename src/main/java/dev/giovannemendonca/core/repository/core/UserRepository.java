package dev.giovannemendonca.core.repository.core;

import dev.giovannemendonca.core.model.core.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<Users, UUID> {
}
