package pyh.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pyh.entry.FilmPo;
import pyh.service.FilmService;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/hand/test/film")
//@PropertySource(value = "classpath:docker-compose.yml", ignoreResourceNotFound = false,
//        encoding = "utf-8") //路径问题尚未调试 暂放
public class FilmController {
    private final Logger logger = LoggerFactory.getLogger(FilmController.class);

    @Autowired
    private FilmService filmService;

    //路径有问题 时间不够调试直接写死
//    @Value("title")
//    private String title;
//    @Value("description")
//    private String description;
//    @Value("languageId")
//    private Integer language_id;
    private String title = "dsadasd";
    private String description = "adsadadaddasda";
    private Integer language_id = 1;
    private Double rental_rate = 2.12;
    private Double replacement_cost = 23.21;
    private String last_update = new SimpleDateFormat().format(new Date());
    private FilmPo filmPo = new FilmPo();

    public void setData(){
        filmPo.setTitle(title);
        filmPo.setDescription(description);
        filmPo.setLanguage_id(language_id);
        filmPo.setRental_rate(rental_rate);
        filmPo.setReplacement_cost(replacement_cost);
        filmPo.setLast_update(last_update);
    }


    @Transactional(propagation = Propagation.REQUIRED)
    @RequestMapping(value = "/insert/right")
    public String insertFilmRight(){
        setData();
//        logger.info(filmPo.toString());
        logger.info(title);
        logger.info(description);
        logger.info(language_id.toString());
        boolean result = filmService.insertFilm(filmPo);

        return result? "添加成功" : "添加失败!" ;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @RequestMapping(value = "/insert/failure")
    public void insertFilm() throws Exception{
        setData();
        logger.info(title);
        logger.info(description);
        logger.info(language_id.toString());

        boolean result = filmService.insertFilm(filmPo);
        throw new Exception("错误");

//        return result? "添加成功" : "添加失败!" ;
    }
}
