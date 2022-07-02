package cl.epcbbr.backend.service.impl;

import cl.epcbbr.backend.model.Marca;
import cl.epcbbr.backend.service.MarcaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServiceImpl implements MarcaService {
    @Override
    public List<Marca> findAll() {
        return null;
    }

    @Override
    public Marca findById(Integer id) {
        return null;
    }

    @Override
    public Marca save(Marca marca) {
        return null;
    }

    @Override
    public Marca update(Marca marca) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
