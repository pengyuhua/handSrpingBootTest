package pyh.service.serviceImpl;

import pyh.dao.FilmMapper;
import pyh.entry.FilmPo;
import pyh.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;

    @Override
    public boolean insertFilm(FilmPo filmPo) {
        return filmMapper.insertFilm(filmPo) >= 0 ? true : false;
    }
}
