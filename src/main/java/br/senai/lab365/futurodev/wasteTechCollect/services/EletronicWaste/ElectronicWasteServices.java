package br.senai.lab365.futurodev.wasteTechCollect.services.EletronicWaste;

import br.senai.lab365.futurodev.wasteTechCollect.dtos.ElectronicW.RequestElectW;
import br.senai.lab365.futurodev.wasteTechCollect.dtos.ElectronicW.ResponseElectW;
import br.senai.lab365.futurodev.wasteTechCollect.mappers.ElectronicWasteMapper;
import br.senai.lab365.futurodev.wasteTechCollect.models.ElectronicWaste;
import br.senai.lab365.futurodev.wasteTechCollect.repositories.ElectronicWasteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ElectronicWasteServices implements ElectronicWasteServicesInterf {

    private final ElectronicWasteRepository electronicwRepository;

    @Override
    public List<ResponseElectW> findAll() {
        return electronicwRepository.findAll().stream().map(electronicWaste ->
                ElectronicWasteMapper.toResponseDTO(electronicWaste)).toList();
    }

    @Override
    public ResponseElectW findById(Long id) {
        ElectronicWaste entity = electronicwRepository.findById(id).orElse(null);
        return ElectronicWasteMapper.toResponseDTO(entity);
    }

    @Override
    public ResponseElectW create(RequestElectW requestDto) {
        ElectronicWaste waste = ElectronicWasteMapper.toEntity(new ElectronicWaste(), requestDto);
        return ElectronicWasteMapper.toResponseDTO(electronicwRepository.save(waste));
    }

    @Override
    public ResponseElectW update(Long id, RequestElectW requestDto) {
        ElectronicWaste waste = electronicwRepository.findById(id).orElse(null);
        ElectronicWasteMapper.toEntity(waste, requestDto);
        return ElectronicWasteMapper.toResponseDTO(electronicwRepository.save(waste));
    }

    @Override
    public void delete(Long id) {
        ElectronicWaste waste = electronicwRepository.findById(id).orElse(null);
        electronicwRepository.delete(waste);
    }

}
