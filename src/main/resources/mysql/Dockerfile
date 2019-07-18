FROM registry.saas.hand-china.com/tools/mysql:5.6

ENV AUTO_RUN_DIR /docker-entrypoint-initdb.d

ENV INSTALL_DB_SQL_O1 sakila-schema.sql

ENV INSTALL_DB_SQL_O2 sakila-data.sql

COPY ./$INSTALL_DB_SQL_O1 $AUTO_RUN_DIR/

COPY ./$INSTALL_DB_SQL_O2 $AUTO_RUN_DIR/


RUN chmod a+x $AUTO_RUN_DIR/$INSTALL_DB_SQL_O1

RUN chmod a+x $AUTO_RUN_DIR/$INSTALL_DB_SQL_O2

