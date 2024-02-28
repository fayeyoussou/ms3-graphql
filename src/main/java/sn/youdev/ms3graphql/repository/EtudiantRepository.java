package sn.youdev.ms3graphql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import sn.youdev.ms3graphql.entity.Etudiant;

public interface EtudiantRepository extends MongoRepository<Etudiant,String> {
}
