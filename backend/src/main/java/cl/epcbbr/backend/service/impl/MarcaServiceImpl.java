package cl.epcbbr.backend.service.impl;

import cl.epcbbr.backend.dto.MarcaByIdDTO;
import cl.epcbbr.backend.exception.ModelNoFoundException;
import cl.epcbbr.backend.manager.MarcaManager;
import cl.epcbbr.backend.model.Marca;
import cl.epcbbr.backend.repository.projections.FindMarcaByIdDTO;
import cl.epcbbr.backend.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaServiceImpl implements MarcaService {
    @Autowired
    private MarcaManager marcaManager;

    public MarcaServiceImpl(MarcaManager marcaRepository) {
        this.marcaManager = marcaManager;
    }

    @Override
    public List<Marca> findAll() {
        return marcaManager.findAll();
    }

    @Override
    public Marca findById(Integer id) {
        /*Optional<Marca> marca = marcaManager.findById(id);
        if(marca.isPresent()){
            return marca.get();
        } else {
            throw new ModelNoFoundException("Marca no encontrada");
        }*/
    	//temporalmente fuera de servicio
    	return null;
    }

    @Override
    public Marca save(Marca marca) {
        return marcaManager.save(marca);
    }

    @Override
    public Marca update(Marca marca) {
        return save(marca);
    }

    @Override
    public boolean delete(Integer id) {
    	marcaManager.delete(id);
        return true;
    }

	@Override
	public List<MarcaByIdDTO> findMarcaByIdDTO(Integer id_marca) {
		return marcaManager.findMarcaByIdDTO(id_marca);
	}
    
	@Override
	public List<FindMarcaByIdDTO> findMarcaByIdDTOB(Integer id_marca){
		return marcaManager.findMarcaByIdDTOB(id_marca);
	}
}
