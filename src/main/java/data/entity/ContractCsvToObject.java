package data.entity;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;

public class ContractCsvToObject {
    @CsvBindByPosition(position = 0)
    @Getter String routeId;

    @CsvBindByPosition(position = 1)
    @Getter String contractId;

    @CsvBindByPosition(position = 2)
    @Getter String updatePermission;

    @CsvBindByPosition(position = 3)
    @Getter String contractType;

}
