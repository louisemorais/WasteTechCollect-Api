package br.senai.lab365.futurodev.wasteTechCollect.repositories;

import br.senai.lab365.futurodev.wasteTechCollect.models.ElectronicWaste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectronicWasteRepository extends JpaRepository<ElectronicWaste, Long> {
}
