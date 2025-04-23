package br.senai.lab365.futurodev.wasteTechCollect.repositories;

import br.senai.lab365.futurodev.wasteTechCollect.models.CollectionPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionPointRepository extends JpaRepository<CollectionPoint, Long> {
}
