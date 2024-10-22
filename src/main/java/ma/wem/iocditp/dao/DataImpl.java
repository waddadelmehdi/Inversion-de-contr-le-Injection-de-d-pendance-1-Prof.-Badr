package ma.wem.iocditp.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("data")
public class DataImpl implements IData {

    @Override
    public double getData() {
        return 10;
    }
}
