package cl.epcbbr.backend.service.impl;

import cl.epcbbr.backend.exception.ModelNoFoundException;
import cl.epcbbr.backend.model.Marca;
import cl.epcbbr.backend.repository.MarcaRepository;
import cl.epcbbr.backend.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaServiceImpl implements MarcaService {
    @Autowired
    private MarcaRepository marcaRepository;

    public MarcaServiceImpl(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    @Override
    public List<Marca> findAll() {
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
    public Marca save(Marca marca) {
        return marcaRepository.save(marca);
    }

    @Override
    public Marca update(Marca marca) {
        return save(marca);
    }

    @Override
    public boolean delete(Integer id) {
        marcaRepository.deleteById(id);
        return true;
    }
}
