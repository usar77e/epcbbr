package cl.epcbbr.backend.manager.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import cl.epcbbr.backend.dto.MarcaByIdDTO;
import cl.epcbbr.backend.exception.ModelNoFoundException;
import cl.epcbbr.backend.manager.MarcaManager;
import cl.epcbbr.backend.model.Marca;
import cl.epcbbr.backend.repository.MarcaRepository;
import cl.epcbbr.backend.repository.projections.FindMarcaByIdDTO;

public class MarcaManagerImpl implements MarcaManager{

	@Autowired
	private MarcaRepository marcaRepository;
	
	@Override
	public List<Marca> findAll() {
		// TODO Auto-generated method stub
		return marcaRepository.findAll();
	}

	@Override
	public Marca findById(Integer id) {
		Optional<Marca> marca = marcaRepository.findById(id);
        if(marca.isPresent()){
            return marca.get();
        } else {
            throw new ModelNoFoundException("Marca no encontrada");
        }
	}

	@Override
	public Marca save(Marca e) {
		// TODO Auto-generated method stub
		return marcaRepository.save(e);
	}

	@Override
	public Marca update(Marca e) {
		// TODO Auto-generated method stub
		return save(e);
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		marcaRepository.deleteById(id);
		return true;
	}

	@Override
	public List<MarcaByIdDTO> findMarcaByIdDTO(Integer id_marca) {
		// TODO Auto-generated method stub
		return marcaRepository.findMarcaByIdDTO(id_marca);
	}

	@Override
	public List<FindMarcaByIdDTO> findMarcaByIdDTOB(Integer id_marca) {
		// TODO Auto-generated method stub
		return marcaRepository.findMarcaByIdDTOB(id_marca);
	}
	
}
