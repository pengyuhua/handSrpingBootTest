package pyh.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Repository;
import pyh.entry.FilmPo;

import java.util.List;

@Repository
public interface FilmMapper {

    @Insert("INSERT INTO film (title, description, language_id, rental_rate, replacement_cost, last_update)" +
            "VALUES (#{title}, #{description}, #{language_id}, #{rental_rate}, #{replacement_cost}, #{last_update})")
    int insertFilm(FilmPo filmPo);
}
