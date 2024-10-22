package ma.wem.iocditp.metier;

import ma.wem.iocditp.dao.IData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class MetierImpl implements IMetier{

    private IData datacall;

    @Autowired
    public void setDatacall(@Qualifier("dataImpl") IData datacall) {
        this.datacall = datacall;
    }
    @Override
    public double calcul() {
        return datacall.getData() * 2;
    }
}
