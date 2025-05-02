package br.senai.lab365.futurodev.wasteTechCollect.services;

import br.senai.lab365.futurodev.wasteTechCollect.dtos.CollectionP.RequestCollectionP;
import br.senai.lab365.futurodev.wasteTechCollect.dtos.CollectionP.ResponseCollectionP;
import br.senai.lab365.futurodev.wasteTechCollect.mappers.CollectionPointMapper;
import br.senai.lab365.futurodev.wasteTechCollect.models.CollectionPoint;
import br.senai.lab365.futurodev.wasteTechCollect.repositories.CollectionPointRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CollectionPointService implements CollectionPointServicesInterf {

    private final CollectionPointRepository collectionPointRepository;

    @Override
    public List<ResponseCollectionP> findAll() {
        List<CollectionPoint> entities =collectionPointRepository.findAll();
        return CollectionPointMapper.toResponseDtos(entities);
    }

    @Override
    public ResponseCollectionP findById(Long id) {
        CollectionPoint entity = collectionPointRepository.findById(id).orElse(null);
        return CollectionPointMapper.toResponseDTO(entity);
    }

    @Override
    public List<ResponseCollectionP> findByName(String name) {
        List<CollectionPoint> collectionPointss=collectionPointRepository.findByName(name);
        return CollectionPointMapper.toResponseDtos(collectionPointss);
    }
    @Override
    public ResponseCollectionP creates(RequestCollectionP dto) {
        CollectionPoint collectionPoint = CollectionPointMapper.toEntity(new CollectionPoint(), dto);
        return CollectionPointMapper.toResponseDTO(collectionPointRepository.save(collectionPoint));
    }

    @Override
    public ResponseCollectionP update(Long id, RequestCollectionP dto) {
        CollectionPoint collectionPoint = collectionPointRepository.findById(id).orElse(null);
        CollectionPointMapper.toEntity(collectionPoint, dto);
        return CollectionPointMapper.toResponseDTO(collectionPointRepository.save(collectionPoint));
    }


    @Override
    public void delete(Long id) {
        CollectionPoint collectionPoints = collectionPointRepository.findById(id).orElse(null);
        collectionPointRepository.delete(collectionPoints);
    }
}
