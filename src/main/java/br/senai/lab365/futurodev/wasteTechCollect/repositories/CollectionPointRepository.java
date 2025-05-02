package br.senai.lab365.futurodev.wasteTechCollect.repositories;

import br.senai.lab365.futurodev.wasteTechCollect.models.CollectionPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CollectionPointRepository extends JpaRepository<CollectionPoint, Long> {
    @Query("SELECT DISTINCT cp.collectionPoint FROM AcceptedMaterial cp " +
            "WHERE UPPER(cp.electronicWaste.wasteType) LIKE CONCAT('%', UPPER(:name) , '%')")
    List<CollectionPoint> findByNameWaste(@Param("name") String name);


}