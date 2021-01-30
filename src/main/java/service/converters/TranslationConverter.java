package service.converters;

import domain.Translation;
import data.entity.TranslationCsvToObject;

import static java.lang.Integer.parseInt;

public class TranslationConverter {
    public TranslationConverter() {}

    public static Translation convert(TranslationCsvToObject input) {
        return Translation.builder()
                .transId(parseInt(input.getTransId()))
                .lang(input.getLang())
                .translation(input.getTranslation())
                .build();
    }
}
