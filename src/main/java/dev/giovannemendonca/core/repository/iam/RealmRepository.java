package dev.giovannemendonca.core.repository.iam;

import dev.giovannemendonca.core.model.iam.Realm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RealmRepository extends JpaRepository<Realm, String> {
}
