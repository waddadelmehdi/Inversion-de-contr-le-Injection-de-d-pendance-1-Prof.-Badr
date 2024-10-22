package ma.wem.iocditp.dao;

import org.springframework.stereotype.Repository;

@Repository

public class DataImplExt implements IData{
    @Override
    public double getData() {
        return 20;
    }
}
