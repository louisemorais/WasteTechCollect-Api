package br.senai.lab365.futurodev.wasteTechCollect.Repositories;

import br.senai.lab365.futurodev.wasteTechCollect.models.ElectronicWaste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EletronicWasteRepository extends JpaRepository<ElectronicWaste, Long> {
}
