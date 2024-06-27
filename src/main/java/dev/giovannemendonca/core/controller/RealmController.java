package dev.giovannemendonca.core.controller;

import dev.giovannemendonca.core.model.iam.Realm;
import dev.giovannemendonca.core.repository.iam.RealmRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/iam/realm")
public class RealmController {

    private RealmRepository realmRepository;

    public RealmController(RealmRepository realmRepository) {
        this.realmRepository = realmRepository;
    }

    @GetMapping
    public List<Realm> listAll() {
        return realmRepository.findAll();
    }
}
